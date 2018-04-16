package com.hzrem.patient.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hzrem.patient.bean.Patient;
import com.hzrem.patient.dao.PatientDao;

@Repository

public class PatientDaoImpl implements PatientDao {

	@Autowired
	private HibernateTemplate template;

	@Transactional(readOnly = false)
	@Override
	public int savePatient(Patient patient) {

		return (int) template.save(patient);
	}

	@Override
	public List<Patient> getPastients() {

		return template.loadAll(Patient.class);
	}

	@Override
	public void updatePatient(Patient patient) {
		template.update(patient);

	}

	@Override
	public void deletePatient(int patient_id) {
		template.delete(new Patient(patient_id));

	}

	@Override
	public Patient getByPatientId(int patient_id) {

		return template.get(Patient.class, patient_id);
	}

}
