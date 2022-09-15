package com.microservices.dto.group;

import java.util.List;

import com.microservices.entities.Diet;
import com.microservices.entities.Patient;

public class RegistroGroupDTO {
	
	private String title;

	private String description;
	
	private String purpose;
	
    private List<Patient> patient;
    
    private Diet diet; 
    
    public RegistroGroupDTO() {
		// TODO Auto-generated constructor stub
	}

	public RegistroGroupDTO(String title, String description, String purpose, List<Patient> patient, Diet diet) {
		super();
		this.title = title;
		this.description = description;
		this.purpose = purpose;
		this.patient = patient;
		this.diet = diet;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public List<Patient> getPatient() {
		return patient;
	}

	public void setPatient(List<Patient> patient) {
		this.patient = patient;
	}

	public Diet getDiet() {
		return diet;
	}

	public void setDiet(Diet diet) {
		this.diet = diet;
	}
    
	
    
}
