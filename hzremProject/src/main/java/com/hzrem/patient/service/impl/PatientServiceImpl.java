package com.hzrem.patient.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hzrem.patient.bean.Patient;
import com.hzrem.patient.dao.PatientDao;
import com.hzrem.patient.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientDao dao;

	@Override
	public int savePatient(Patient patient) {

		return dao.savePatient(patient);
	}

	@Override
	public List<Patient> getPastients() {

		return dao.getPastients();
	}

	@Override
	public void updatePatient(Patient patient) {
		dao.updatePatient(patient);

	}

	@Override
	public void deletePatient(int patient_id) {
		dao.deletePatient(patient_id);

	}

	@Override
	public Patient getByPatientId(int patient_id) {
		return dao.getByPatientId(patient_id);
	}

}
