package com.microservices.dto.pay;

import java.util.UUID;

import com.microservices.entities.Patient;

public class ConsultaPayDTO {
	
	private UUID id_pay;
	
	private Double price_diet;

	private Boolean isdebt;
	
	private Patient patient;
	
	public ConsultaPayDTO() {
		// TODO Auto-generated constructor stub
	}

	public ConsultaPayDTO(UUID id_pay, Double price_diet, Boolean isdebt, Patient patient) {
		super();
		this.id_pay = id_pay;
		this.price_diet = price_diet;
		this.isdebt = isdebt;
		this.patient = patient;
	}

	public UUID getId_pay() {
		return id_pay;
	}

	public void setId_pay(UUID id_pay) {
		this.id_pay = id_pay;
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
