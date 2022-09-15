package com.microservices.controllers;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.dto.patient.ConsultaPatientDTO;
import com.microservices.dto.patient.PatientMapper;
import com.microservices.dto.patient.RegistroPatientDTO;
import com.microservices.entities.Patient;
import com.microservices.services.PatientService;

@RestController
@RequestMapping("/v1/patient")
public class PatientController {
	
	@Autowired
	private PatientService patientService;

	@PostMapping
	public ResponseEntity<ConsultaPatientDTO> saveFood(@RequestBody @Valid RegistroPatientDTO dto){
		return ResponseEntity.status(HttpStatus.CREATED).body(PatientMapper.fromEntity(patientService.save(PatientMapper.fromDTO(dto))));
	}
	
	@GetMapping
	public ResponseEntity<Page<ConsultaPatientDTO>> findAllFood(@PageableDefault Pageable pageable){
		return ResponseEntity.ok(patientService.findAll(pageable).map(PatientMapper::fromEntity));
	}
	
	@PutMapping("{id}")
	public ResponseEntity<ConsultaPatientDTO> updatePatient(@RequestBody RegistroPatientDTO dto, @PathVariable UUID id){
		try {
			Patient patient = patientService.editPatient(PatientMapper.fromDTO(dto), id);
			return ResponseEntity.ok(PatientMapper.fromEntity(patient));
		} catch (RuntimeException ex) {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("{id}") 
	public ResponseEntity<ConsultaPatientDTO> findPatientById(@PathVariable UUID id){

		Patient patient = patientService.findById(id);
		
		return ResponseEntity.ok(PatientMapper.fromEntity(patient));
		
		
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<ConsultaPatientDTO> deletePatient(@PathVariable UUID id){
		
		try {
			patientService.delete(id);
			
			return ResponseEntity.ok().build();
		}catch(RuntimeException ex) {
			return ResponseEntity.notFound().build();
		}
		
	}


}
