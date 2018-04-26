package com.hzrem.doctor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hzrem.doctor.bean.Doctor;
import com.hzrem.doctor.service.DoctorService;

@Controller
public class DoctorController {

	@Autowired
	private DoctorService service;

	@RequestMapping(value = "/doctRegi")
	public String showPage() {

		return "saveDoctor";
	}

	@RequestMapping(value = "/saveDoctor", method = RequestMethod.POST)
	public String saveDoctor(@ModelAttribute("Doctor") Doctor doctor, ModelMap map) {

		int doctorId = service.saveDoctor(doctor);

		String info = "save with doctorId = " + doctorId;

		map.addAttribute("msg", info);

		return "saveDoctor";
	}
}
