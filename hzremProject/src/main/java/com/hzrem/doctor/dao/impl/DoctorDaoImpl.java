package com.hzrem.doctor.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.hzrem.doctor.bean.Doctor;
import com.hzrem.doctor.dao.DoctorDao;

@Repository
public class DoctorDaoImpl implements DoctorDao {

	@Autowired
	private HibernateTemplate template;

	@Override
	public int saveDoctor(Doctor doctor) {

		return (int) template.save(doctor);
	}

}
