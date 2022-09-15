package com.microservices.services;

import java.util.Optional;
import java.util.UUID;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.microservices.entities.Diet;
import com.microservices.repositories.DietRepository;

@Service
public class DietService {
	
	@Autowired
	private DietRepository dietRepository;
	
	public Diet save(Diet diet) {

		return dietRepository.save(diet);
	}
	
	public Page<Diet> findAll(Pageable pageable){
		return dietRepository.findAll(pageable);
	}

	public Diet findById(UUID id) {
		Optional<Diet> optional = dietRepository.findById(id);
		
		return optional.orElseThrow(() -> new EntityNotFoundException("Diet not found"));
		
	}
	
	public Diet editDiet(Diet diet, UUID id) {
		Diet optional = this.findById(id);
		
		diet.setId_diet(optional.getId_diet());
		
		return dietRepository.save(diet);
		
	}
	
	public void delete(UUID id) {
		Diet dietOriginal = this.findById(id);

		dietRepository.delete(dietOriginal);
	}
	
	
}
