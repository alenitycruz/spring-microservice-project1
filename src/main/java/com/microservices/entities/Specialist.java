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
@Table(name = "specialist")
public class Specialist implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id_specialist;
	
	@Column(length = 255)
	private String name_specialist;
	
	@Column(length = 255)
	private String occupation_specialist;
	
	@Column(length = 255)
	private String crn_crm;
	
	public Specialist() {
		// TODO Auto-generated constructor stub
	}

	public Specialist(UUID id_specialist, String name_specialist, String occupation_specialist, String crn_crm) {
		super();
		this.id_specialist = id_specialist;
		this.name_specialist = name_specialist;
		this.occupation_specialist = occupation_specialist;
		this.crn_crm = crn_crm;
	}

	

	public UUID getId_specialist() {
		return id_specialist;
	}

	public void setId_specialist(UUID id_specialist) {
		this.id_specialist = id_specialist;
	}

	public String getName_specialist() {
		return name_specialist;
	}

	public void setName_specialist(String name_specialist) {
		this.name_specialist = name_specialist;
	}

	public String getOccupation_specialist() {
		return occupation_specialist;
	}

	public void setOccupation_specialist(String occupation_specialist) {
		this.occupation_specialist = occupation_specialist;
	}

	public String getCrn_crm() {
		return crn_crm;
	}

	public void setCrn_crm(String crn_crm) {
		this.crn_crm = crn_crm;
	}

	@Override
	public String toString() {
		return "Specialist [idSpecialist=" + id_specialist + ", name=" + name_specialist + ", occupation=" + occupation_specialist
				+ ", crn_crm=" + crn_crm + "]";
	}
	
	
	

}
