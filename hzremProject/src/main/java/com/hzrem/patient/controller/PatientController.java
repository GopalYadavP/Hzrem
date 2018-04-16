package com.hzrem.patient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hzrem.patient.bean.Patient;
import com.hzrem.patient.service.PatientService;

@Controller
public class PatientController {

	@Autowired
	private PatientService service;

	@RequestMapping(value = "/showPage")
	public String showPage() {

		return "savePatient";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String savePatioent(@ModelAttribute("patient") Patient patient, ModelMap map) {

		Integer id = service.savePatient(patient);
		String info = "save with id " + id;
		map.addAttribute("msg", info);
		return "savePatient";

	}

}
