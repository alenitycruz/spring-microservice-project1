package com.microservices.services;

import java.util.Optional;
import java.util.UUID;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.microservices.entities.Food;
import com.microservices.repositories.FoodRepository;

@Service
public class FoodService {
	
	@Autowired
	private FoodRepository foodRepository;
	
	public Food save(Food food) {
		return foodRepository.save(food);
	}
	
	public Page<Food> findAll(Pageable pageable){
		return foodRepository.findAll(pageable);
	}

	public Food  findById(UUID id){
		Optional<Food> optional = foodRepository.findById(id);
		return optional.orElseThrow(() -> new EntityNotFoundException("Value not found"));
	}
	
	public Food editFood(Food food, UUID id) {
		Food optional = this.findById(id);
		
		food.setId_food(optional.getId_food());
		
		return foodRepository.save(food);
	}
	
	public void delete(UUID id) {
		Food foodOriginal = this.findById(id);

		foodRepository.delete(foodOriginal);
	}
}
