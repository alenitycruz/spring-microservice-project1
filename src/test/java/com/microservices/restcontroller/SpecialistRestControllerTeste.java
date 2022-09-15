package com.microservices.restcontroller;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import com.microservices.dto.specialist.ConsultaSpecialistDTO;

import io.restassured.RestAssured;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpecialistRestControllerTeste {

	@LocalServerPort
	private int randomPort;
	
	@BeforeEach
	public void setUpTest() {
		System.out.println(randomPort);
		RestAssured.port = randomPort;
	}
	
	@Test
	void whenFindAllThenCheckResult() {
		RestAssured.given()
		.when()
		.get("/v1/specialist")
		.then()
		.statusCode(200)
		.extract().response().body().prettyPrint();
	}
	
	@Test
	void whenCreateThenCheckIsCreated() {
		var createDTO = new ConsultaSpecialistDTO();
		createDTO.setOccupation_specialist("Nutrologo");;
		
		RestAssured.given()
		.when()
		.contentType(MediaType.APPLICATION_JSON_VALUE)
		.body(createDTO)
		.post("/v1/specialist")
		.then()
		.statusCode(HttpStatus.CREATED.value())
		.body("occupation_specialist", Matchers.equalTo("Nutrologo"));
		
	}
}
