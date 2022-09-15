package com.microservices.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.entities.Diet;

@Repository
public interface DietRepository extends JpaRepository<Diet, UUID> {


}
