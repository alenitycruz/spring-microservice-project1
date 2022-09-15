package com.microservices.dto.food;

import java.util.UUID;

public class ConsultaFoodDTO {
	
	private UUID id_food;
	
	private Double sugar_g;

	private Double fiber_g;
	
	private Double serving_size_g;
	
	private Double sodium_mg;
	
	private String name;
	
	private Double potassium_mg;
	
	private Double fat_saturated_g;
	
	private Double fat_total_g;
	
	private Double calories;
	
	private Double cholesterol_mg;
	
	private Double protein_g;
	
	private Double carbohydrates_total_g;
	
	public ConsultaFoodDTO() {
		// TODO Auto-generated constructor stub
	}

	public ConsultaFoodDTO(UUID id_food, Double sugar_g, Double fiber_g, Double serving_size_g, Double sodium_mg,
			String name, Double potassium_mg, Double fat_saturated_g, Double fat_total_g, Double calories,
			Double cholesterol_mg, Double protein_g, Double carbohydrates_total_g) {
		super();
		this.id_food = id_food;
		this.sugar_g = sugar_g;
		this.fiber_g = fiber_g;
		this.serving_size_g = serving_size_g;
		this.sodium_mg = sodium_mg;
		this.name = name;
		this.potassium_mg = potassium_mg;
		this.fat_saturated_g = fat_saturated_g;
		this.fat_total_g = fat_total_g;
		this.calories = calories;
		this.cholesterol_mg = cholesterol_mg;
		this.protein_g = protein_g;
		this.carbohydrates_total_g = carbohydrates_total_g;
	}

	public UUID getId_food() {
		return id_food;
	}

	public void setId_food(UUID id_food) {
		this.id_food = id_food;
	}

	public Double getSugar_g() {
		return sugar_g;
	}

	public void setSugar_g(Double sugar_g) {
		this.sugar_g = sugar_g;
	}

	public Double getFiber_g() {
		return fiber_g;
	}

	public void setFiber_g(Double fiber_g) {
		this.fiber_g = fiber_g;
	}

	public Double getServing_size_g() {
		return serving_size_g;
	}

	public void setServing_size_g(Double serving_size_g) {
		this.serving_size_g = serving_size_g;
	}

	public Double getSodium_mg() {
		return sodium_mg;
	}

	public void setSodium_mg(Double sodium_mg) {
		this.sodium_mg = sodium_mg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPotassium_mg() {
		return potassium_mg;
	}

	public void setPotassium_mg(Double potassium_mg) {
		this.potassium_mg = potassium_mg;
	}

	public Double getFat_saturated_g() {
		return fat_saturated_g;
	}

	public void setFat_saturated_g(Double fat_saturated_g) {
		this.fat_saturated_g = fat_saturated_g;
	}

	public Double getFat_total_g() {
		return fat_total_g;
	}

	public void setFat_total_g(Double fat_total_g) {
		this.fat_total_g = fat_total_g;
	}

	public Double getCalories() {
		return calories;
	}

	public void setCalories(Double calories) {
		this.calories = calories;
	}

	public Double getCholesterol_mg() {
		return cholesterol_mg;
	}

	public void setCholesterol_mg(Double cholesterol_mg) {
		this.cholesterol_mg = cholesterol_mg;
	}

	public Double getProtein_g() {
		return protein_g;
	}

	public void setProtein_g(Double protein_g) {
		this.protein_g = protein_g;
	}

	public Double getCarbohydrates_total_g() {
		return carbohydrates_total_g;
	}

	public void setCarbohydrates_total_g(Double carbohydrates_total_g) {
		this.carbohydrates_total_g = carbohydrates_total_g;
	}

	
	
	
}
