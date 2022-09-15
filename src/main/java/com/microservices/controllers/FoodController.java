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

import com.microservices.dto.food.ConsultaFoodDTO;
import com.microservices.dto.food.FoodMapper;
import com.microservices.dto.food.RegistroFoodDTO;
import com.microservices.entities.Food;
import com.microservices.services.FoodService;

@RestController
@RequestMapping("v1/food")
public class FoodController {
	
	@Autowired
	private FoodService foodService;
	
	
	@PostMapping
	public ResponseEntity<ConsultaFoodDTO> saveFood(@RequestBody @Valid RegistroFoodDTO dto){
		return ResponseEntity.status(HttpStatus.CREATED).body(FoodMapper.fromEntity(foodService.save(FoodMapper.fromDTO(dto))));
	}
	
	@GetMapping
	public ResponseEntity<Page<ConsultaFoodDTO>> findAllFood(@PageableDefault Pageable pageable){
		return ResponseEntity.ok(foodService.findAll(pageable).map(FoodMapper::fromEntity));
	}
	
	@PutMapping("{id}")
	public ResponseEntity<ConsultaFoodDTO> updateFood(@RequestBody RegistroFoodDTO dto, @PathVariable UUID id){
		try {
			Food food = foodService.editFood(FoodMapper.fromDTO(dto), id);
			return ResponseEntity.ok(FoodMapper.fromEntity(food));
		} catch (RuntimeException ex) {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("{id}") 
	public ResponseEntity<ConsultaFoodDTO> findFoodById(@PathVariable UUID id){

		Food food = foodService.findById(id);
		
		return ResponseEntity.ok(FoodMapper.fromEntity(food));
		
		
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<ConsultaFoodDTO> deleteFood(@PathVariable UUID id){
		
		try {
			foodService.delete(id);
			
			return ResponseEntity.ok().build();
		}catch(RuntimeException ex) {
			return ResponseEntity.notFound().build();
		}
		
	}



}
