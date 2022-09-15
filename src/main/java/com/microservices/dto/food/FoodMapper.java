package com.microservices.dto.food;

import com.microservices.entities.Food;

public class FoodMapper {

	public static Food fromDTO(RegistroFoodDTO dto) {
		return new Food(null, dto.getSugar_g(), dto.getFiber_g(), dto.getServing_size_g(), dto.getSodium_mg(), dto.getName(), dto.getPotassium_mg(), dto.getFat_saturated_g(), dto.getFat_total_g(), dto.getCalories(), dto.getCholesterol_mg(), dto.getProtein_g(), dto.getCarbohydrates_total_g());
	}
	
	public static ConsultaFoodDTO fromEntity(Food food) {
		return new ConsultaFoodDTO(food.getId_food(), food.getSugar_g(), food.getFiber_g(), food.getServing_size_g(), food.getSodium_mg(), food.getName(),
				food.getPotassium_mg(), food.getFat_saturated_g(), food.getFat_total_g(), food.getCalories(), food.getCholesterol_mg(),
				food.getProtein_g(), food.getCarbohydrates_total_g());
	}
}
