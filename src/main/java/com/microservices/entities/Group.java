package com.microservices.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "typegroup")
public class Group implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id_group;
	
	@Column(length = 255)
	private String title;
	
	@Column(length = 255)
	private String description;
	
	@Column(length = 255)
	private String purpose;
	
	@OneToMany
    private List<Patient> patient = new ArrayList<>();
	
	@JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_diet")
	private Diet diet; 
	
	public Group() {
		// TODO Auto-generated constructor stub
	}

	

	public Group(UUID id_group, String title, String description, String purpose, List<Patient> patient, Diet diet) {
		super();
		this.id_group = id_group;
		this.title = title;
		this.description = description;
		this.purpose = purpose;
		this.patient = patient;
		this.diet = diet;
	}



	public UUID getId_group() {
		return id_group;
	}



	public void setId_group(UUID id_group) {
		this.id_group = id_group;
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



	@Override
	public String toString() {
		return "Group [id_group=" + id_group + ", title=" + title + ", description=" + description + ", purpose="
				+ purpose + ", patient=" + patient + ", diet=" + diet + "]";
	}


}
