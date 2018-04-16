package com.hzrem.patient.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patient_tab")
public class Patient implements Serializable {

	@Id
	private int patient_id;

	private String patient_Name;

	private String sex;

	private String address;

	private int phoneNumber;

	private int age;

	public int getAge() {
		return age;
	}

	public Patient(int patient_id) {
		super();
		this.patient_id = patient_id;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Patient() {
		super();
	}

	public int getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}

	public String getPatient_Name() {
		return patient_Name;
	}

	public void setPatient_Name(String patient_Name) {
		this.patient_Name = patient_Name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
