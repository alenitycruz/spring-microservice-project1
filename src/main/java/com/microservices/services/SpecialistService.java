package com.microservices.services;

import java.util.Optional;
import java.util.UUID;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.microservices.entities.Specialist;
import com.microservices.repositories.SpecialistRepository;

@Service
public class SpecialistService {
	
	@Autowired
	private SpecialistRepository specialistRepository;
	
	public Specialist save(Specialist specialist) {
		return specialistRepository.save(specialist);
	}

	public Page<Specialist> findAll(Pageable pageable){
		return specialistRepository.findAll(pageable);
	}
	
	public Specialist findById(UUID id) {
		Optional<Specialist> optional = specialistRepository.findById(id);
		return optional.orElseThrow(() -> new EntityNotFoundException("Specialist not found"));
	}
	
	public Specialist editSpecialist(Specialist specialist, UUID id) {
		Specialist optional = this.findById(id);
		
		specialist.setId_specialist(optional.getId_specialist());
		
		return specialistRepository.save(specialist);
	}
	
	public void delete(UUID id) {
		Specialist specialistOriginal = this.findById(id);

		specialistRepository.delete(specialistOriginal);
	}
}
