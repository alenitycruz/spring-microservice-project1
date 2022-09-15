package com.microservices.entities;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patient")
public class Patient implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id_patient;
	
	@Column(length = 255)
	private String name_patient;
	
	@Column(length = 255)
	private String birthday;
	
	@Column(length = 255)
	private String occupation_patient;
	
	@Column(length = 255)
	private String rg;
	
	@Column(length = 255)
	private String cpf;
	
	@Column(length = 255)
	private String telephone;
	
	@Column(length = 255)
	private String goal;
	
	private Double height_patient;
	
	private Double weight_patient;
	
	@Column(length = 255)
	private String allergy;
	
	
	public Patient() {
		// TODO Auto-generated constructor stub
	}

	public Patient(UUID id_patient, String name_patient, String birthday, String occupation_patient, String rg,
			String cpf, String telephone, String goal, Double height_patient, Double weight_patient, String allergy) {
		super();
		this.id_patient = id_patient;
		this.name_patient = name_patient;
		this.birthday = birthday;
		this.occupation_patient = occupation_patient;
		this.rg = rg;
		this.cpf = cpf;
		this.telephone = telephone;
		this.goal = goal;
		this.height_patient = height_patient;
		this.weight_patient = weight_patient;
		this.allergy = allergy;
		
	}

	public UUID getId_patient() {
		return id_patient;
	}


	public void setId_patient(UUID id_patient) {
		this.id_patient = id_patient;
	}


	public String getName_patient() {
		return name_patient;
	}


	public void setName_patient(String name_patient) {
		this.name_patient = name_patient;
	}


	public String getBirthday() {
		return birthday;
	}


	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}


	public String getOccupation_patient() {
		return occupation_patient;
	}


	public void setOccupation_patient(String occupation_patient) {
		this.occupation_patient = occupation_patient;
	}


	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public String getGoal() {
		return goal;
	}


	public void setGoal(String goal) {
		this.goal = goal;
	}


	public Double getHeight_patient() {
		return height_patient;
	}


	public void setHeight_patient(Double height_patient) {
		this.height_patient = height_patient;
	}


	public Double getWeight_patient() {
		return weight_patient;
	}


	public void setWeight_patient(Double weight_patient) {
		this.weight_patient = weight_patient;
	}


	public String getAllergy() {
		return allergy;
	}


	public void setAllergy(String allergy) {
		this.allergy = allergy;
	}







	@Override
	public String toString() {
		return "Patient [id_patient=" + id_patient + ", name_patient=" + name_patient + ", birthday=" + birthday
				+ ", occupation_patient=" + occupation_patient + ", rg=" + rg + ", cpf=" + cpf + ", telephone="
				+ telephone + ", goal=" + goal + ", height_patient=" + height_patient + ", weight_patient="
				+ weight_patient + ", allergy=" + allergy + "]";
	}


	

	
	
	//vizualizar dieta
	
	//acessar a fatura
	
	//historico



}
