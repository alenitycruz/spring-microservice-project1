package com.microservices.services;

import java.util.Optional;
import java.util.UUID;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.microservices.entities.Patient;
import com.microservices.repositories.PatientRepository;

@Service
public class PatientService {
	
	@Autowired
	private PatientRepository patientRepository;
	
	public Patient save(Patient patient) {
		return patientRepository.save(patient);
	}

	public Page<Patient> findAll(Pageable pageable){
		return patientRepository.findAll(pageable);
	}
	
	public Patient findById(UUID id){
		Optional<Patient> optional = patientRepository.findById(id);
		return optional.orElseThrow(() -> new EntityNotFoundException("Patient not found"));
	}
	
	public Patient editPatient(Patient patient, UUID id) {
		Patient optional = this.findById(id);
		
		patient.setId_patient(optional.getId_patient());
		
		return patientRepository.save(patient);
	}
	
	public void delete(UUID id) {
		Patient patientOriginal = this.findById(id);

		patientRepository.delete(patientOriginal);
	}
	

}
