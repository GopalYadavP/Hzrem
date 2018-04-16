package com.hzrem.patient.service;

import java.util.List;

import com.hzrem.patient.bean.Patient;

public interface PatientService {
	public int savePatient(Patient patient);

	public List<Patient> getPastients();

	public void updatePatient(Patient patient);

	public void deletePatient(int patient_id);

	public Patient getByPatientId(int patient_id);

}
