package com.microservices.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "diet")
public class Diet implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_diet")
	private UUID id_diet;
	
	@Column(length = 255)
	private String title_diet;
	
	@Column(length = 255)
	private String description_diet;
	
	@Column(length = 255)
	private String purpose;
	
	@ManyToOne
	@JoinColumn(name = "id_specialist")
	private Specialist specialist;
	
	@ManyToMany
    @JoinTable(name = "food_diet", joinColumns = @JoinColumn(name = "id_diet"), inverseJoinColumns = @JoinColumn(name = "id_food"))
	private List<Food> food = new ArrayList<>();
	
	public Diet() {
		// TODO Auto-generated constructor stub
	}
	

	public Diet(UUID id_diet, String title_diet, String description_diet, String purpose, Specialist specialist,
			List<Food> food) {
		super();
		this.id_diet = id_diet;
		this.title_diet = title_diet;
		this.description_diet = description_diet;
		this.purpose = purpose;
		this.specialist = specialist;
		this.food = food;
	}




	public UUID getId_diet() {
		return id_diet;
	}


	public void setId_diet(UUID id_diet) {
		this.id_diet = id_diet;
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

	public void setFoods(List<Food> food) {
		this.food = food;
	}


	@Override
	public String toString() {
		return "Diet [id_diet=" + id_diet + ", title_diet=" + title_diet + ", description_diet=" + description_diet
				+ ", purpose=" + purpose + ", specialist=" + specialist + ", foods=" + food + "]";
	}



	
	

}
