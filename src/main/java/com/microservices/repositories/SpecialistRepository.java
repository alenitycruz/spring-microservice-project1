package com.microservices.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.entities.Specialist;

@Repository
public interface SpecialistRepository extends JpaRepository<Specialist, UUID> {


}
