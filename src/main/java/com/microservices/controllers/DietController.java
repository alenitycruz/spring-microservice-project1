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

import com.microservices.dto.diet.ConsultaDietDTO;
import com.microservices.dto.diet.DietMapper;
import com.microservices.dto.diet.RegistroDietDTO;
import com.microservices.entities.Diet;
import com.microservices.services.DietService;

@RestController
@RequestMapping("/v1/diet")
public class DietController {
	
	@Autowired
	private DietService dietService;
	
	@PostMapping
	public ResponseEntity<ConsultaDietDTO> saveFood(@RequestBody @Valid RegistroDietDTO dto){
		return ResponseEntity.status(HttpStatus.CREATED).body(DietMapper.fromEntity(dietService.save(DietMapper.fromDTO(dto))));
	}
	
	@GetMapping
	public ResponseEntity<Page<ConsultaDietDTO>> findAllFood(@PageableDefault Pageable pageable){
		return ResponseEntity.ok(dietService.findAll(pageable).map(DietMapper::fromEntity));
	}
	
	
	
	@PutMapping("{id}")
	public ResponseEntity<ConsultaDietDTO> updateDiet(@RequestBody RegistroDietDTO dto, @PathVariable UUID id){
		try {
			Diet diet = dietService.editDiet(DietMapper.fromDTO(dto), id);
			return ResponseEntity.ok(DietMapper.fromEntity(diet));
		} catch (RuntimeException ex) {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("{id}") 
	public ResponseEntity<ConsultaDietDTO> findDietById(@PathVariable UUID id){

		Diet diet = dietService.findById(id);
		
		return ResponseEntity.ok(DietMapper.fromEntity(diet));
		
		
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<ConsultaDietDTO> deleteDiet(@PathVariable UUID id){
		
		try {
			dietService.delete(id);
			
			return ResponseEntity.ok().build();
		}catch(RuntimeException ex) {
			return ResponseEntity.notFound().build();
		}
		
	}



}
