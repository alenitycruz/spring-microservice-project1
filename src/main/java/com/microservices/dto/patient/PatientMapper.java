package com.microservices.dto.patient;

import com.microservices.entities.Patient;

public class PatientMapper {

	
	public static Patient fromDTO(RegistroPatientDTO dto) {
		return new Patient(null, dto.getName_patient(), dto.getBirthday(), dto.getOccupation_patient(), dto.getRg(), dto.getCpf(), dto.getTelephone(), dto.getGoal(), dto.getHeight_patient(), dto.getWeight_patient(), dto.getAllergy());
	}
	
	public static ConsultaPatientDTO fromEntity(Patient patient) {
		return new ConsultaPatientDTO(patient.getId_patient(), patient.getName_patient(), patient.getBirthday(), patient.getOccupation_patient(), patient.getRg(), patient.getCpf(), patient.getTelephone(), patient.getGoal(), patient.getHeight_patient(), patient.getWeight_patient(), patient.getAllergy());
	}
}
