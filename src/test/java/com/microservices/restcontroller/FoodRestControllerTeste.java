package com.microservices.restcontroller;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import com.microservices.dto.food.ConsultaFoodDTO;

import io.restassured.RestAssured;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class FoodRestControllerTeste {

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
		.get("/v1/food")
		.then()
		.statusCode(200)
		.extract().response().body().prettyPrint();
	}
	
	@Test
	void whenCreateThenCheckIsCreated() {
		var createDTO = new ConsultaFoodDTO();
		createDTO.setName("morango");;
		
		RestAssured.given()
		.when()
		.contentType(MediaType.APPLICATION_JSON_VALUE)
		.body(createDTO)
		.post("/v1/food")
		.then()
		.statusCode(HttpStatus.CREATED.value())
		.body("name", Matchers.equalTo("morango"));
		
	}
}
