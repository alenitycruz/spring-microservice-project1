package com.microservices.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.entities.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, UUID>{

}
