package com.microservices.dto.specialist;

public class RegistroSpecialistDTO {
		
	private String name_specialist;
		
	private String occupation_specialist;
	
	private String crn_crm;
	
	public RegistroSpecialistDTO() {
		// TODO Auto-generated constructor stub
	}

	public RegistroSpecialistDTO(String name_specialist, String occupation_specialist, String crn_crm) {
		super();
		this.name_specialist = name_specialist;
		this.occupation_specialist = occupation_specialist;
		this.crn_crm = crn_crm;
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
