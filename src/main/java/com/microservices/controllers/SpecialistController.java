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

import com.microservices.dto.specialist.ConsultaSpecialistDTO;
import com.microservices.dto.specialist.RegistroSpecialistDTO;
import com.microservices.dto.specialist.SpecialistMapper;
import com.microservices.entities.Specialist;
import com.microservices.services.SpecialistService;

@RestController
@RequestMapping("/v1/specialist")
public class SpecialistController {

	@Autowired
	private SpecialistService specialistService;
	
	@PostMapping
	public ResponseEntity<ConsultaSpecialistDTO> saveFood(@RequestBody @Valid RegistroSpecialistDTO dto){
		return ResponseEntity.status(HttpStatus.CREATED).body(SpecialistMapper.fromEntity(specialistService.save(SpecialistMapper.fromDTO(dto))));
	}
	
	@GetMapping
	public ResponseEntity<Page<ConsultaSpecialistDTO>> findAllFood(@PageableDefault Pageable pageable){
		return ResponseEntity.ok(specialistService.findAll(pageable).map(SpecialistMapper::fromEntity));
	}
	
	@PutMapping("{id}")
	public ResponseEntity<ConsultaSpecialistDTO> updateSpecialist(@RequestBody RegistroSpecialistDTO dto, @PathVariable UUID id){
		try {
			Specialist specialist = specialistService.editSpecialist(SpecialistMapper.fromDTO(dto), id);
			return ResponseEntity.ok(SpecialistMapper.fromEntity(specialist));
		} catch (RuntimeException ex) {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("{id}") 
	public ResponseEntity<ConsultaSpecialistDTO> findSpecialistById(@PathVariable UUID id){

		Specialist specialist = specialistService.findById(id);
		
		return ResponseEntity.ok(SpecialistMapper.fromEntity(specialist));
		
		
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<ConsultaSpecialistDTO> deleteSpecialist(@PathVariable UUID id){
		
		try {
			specialistService.delete(id);
			
			return ResponseEntity.ok().build();
		}catch(RuntimeException ex) {
			return ResponseEntity.notFound().build();
		}
		
	}



}
