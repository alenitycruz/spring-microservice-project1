package com.microservices.dto.diet;

import com.microservices.entities.Diet;

public class DietMapper {
	
	public static Diet fromDTO(RegistroDietDTO dto) {
		return new Diet(null, dto.getTitle_diet(), dto.getDescription_diet(), dto.getPurpose(), dto.getSpecialist(),
				dto.getFood());
	}
	
	
	public static ConsultaDietDTO fromEntity(Diet diet) {

		return new ConsultaDietDTO(diet.getId_diet(), diet.getTitle_diet(), diet.getDescription_diet(), diet.getPurpose(), diet.getSpecialist(), diet.getFood());
	}
}
