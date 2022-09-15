package com.microservices.entities;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pay")
public class Pay implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id_pay;
	
	private Double price_diet;

	private Boolean isdebt;
	
	@OneToOne
	@JoinColumn(name = "id_patient")
	private Patient patient;

	public Pay() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Pay(UUID id_pay, Double price_diet, Boolean isdebt, Patient patient) {
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
	
	public Diet typeDiet(Boolean isdebt) {
		Diet principal = new Diet();
		this.isdebt = isdebt;
		if(isdebt == true) {
			throw new RuntimeException("Diet not found"); 
		}
		
		return principal;
	}




	@Override
	public String toString() {
		return "Pay [id_pay=" + id_pay + ", price_diet=" + price_diet + ", isdebt=" + isdebt + ", patient=" + patient
				+ "]";
	}




	
	
	

}
