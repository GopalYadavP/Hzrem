package com.hzrem.doctor.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hzrem.doctor.bean.Doctor;
import com.hzrem.doctor.dao.DoctorDao;
import com.hzrem.doctor.service.DoctorService;

@Service
public class DoctorSerivceImpl implements DoctorService {
    
	@Autowired
	private DoctorDao dao;
	
	@Override
	public int saveDoctor(Doctor doctor) {
		
		return dao.saveDoctor(doctor);
	}

}
