package com.microservices.dto.pay;

import com.microservices.entities.Patient;

public class RegistroPayDTO {
	
	private Double price_diet;

	private Boolean isdebt;
	
	private Patient patient;
	
	public RegistroPayDTO() {
		// TODO Auto-generated constructor stub
	}

	public RegistroPayDTO(Double price_diet, Boolean isdebt, Patient patient) {
		super();
		this.price_diet = price_diet;
		this.isdebt = isdebt;
		this.patient = patient;
	}

	public Double getPrice_diet() {
		return price_diet;
	}

	public void setPrice_diet(Double price_diet) {
		this.price_diet = price_diet;
	}

	public Boolean isIsdebt() {
		return isdebt;
	}

	public void setIsdebt(Boolean isdebt) {
		this.isdebt = isdebt;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	

}
