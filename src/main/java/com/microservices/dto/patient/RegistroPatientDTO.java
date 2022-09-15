package com.microservices.dto.patient;

public class RegistroPatientDTO {
	
private String name_patient;
	
	private String birthday;
	
	private String occupation_patient;
	
	private String rg;
	
	private String cpf;
	
	private String telephone;
	
	private String goal;
	
	private Double height_patient;
	
	private Double weight_patient;
	
	private String allergy;
	
    
    public RegistroPatientDTO() {
		// TODO Auto-generated constructor stub
	}

	public RegistroPatientDTO(String name_patient, String birthday, String occupation_patient, String rg, String cpf,
			String telephone, String goal, Double height_patient, Double weight_patient, String allergy) {
		super();
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

	
    
    

}
