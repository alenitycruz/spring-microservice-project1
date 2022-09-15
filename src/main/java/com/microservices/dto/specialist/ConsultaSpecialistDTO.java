package com.microservices.dto.specialist;

import java.util.UUID;

public class ConsultaSpecialistDTO {
	
	private UUID id_specialist;
	
	private String name_specialist;
	
	private String occupation_specialist;
	
	private String crn_crm;
	
	public ConsultaSpecialistDTO() {
		// TODO Auto-generated constructor stub
	}

	public ConsultaSpecialistDTO(UUID id_specialist, String name_specialist, String occupation_specialist,
			String crn_crm) {
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
	
	

}
