package com.microservices.dto.diet;

import java.util.List;

import com.microservices.entities.Food;
import com.microservices.entities.Specialist;

public class RegistroDietDTO {

	private String title_diet;
	
	private String description_diet;
	
	private String purpose;
	
	private Specialist specialist;
	
	private List<Food> food;
	
	public RegistroDietDTO() {
		// TODO Auto-generated constructor stub
	}

	public RegistroDietDTO(String title_diet, String description_diet, String purpose, Specialist specialist,
			List<Food> food) {
		super();
		this.title_diet = title_diet;
		this.description_diet = description_diet;
		this.purpose = purpose;
		this.specialist = specialist;
		this.food = food;
	}

	public String getTitle_diet() {
		return title_diet;
	}

	public void setTitle_diet(String title_diet) {
		this.title_diet = title_diet;
	}

	public String getDescription_diet() {
		return description_diet;
	}

	public void setDescription_diet(String description_diet) {
		this.description_diet = description_diet;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public Specialist getSpecialist() {
		return specialist;
	}

	public void setSpecialist(Specialist specialist) {
		this.specialist = specialist;
	}

	public List<Food> getFood() {
		return food;
	}

	public void setFood(List<Food> food) {
		this.food = food;
	}
	
	
}
