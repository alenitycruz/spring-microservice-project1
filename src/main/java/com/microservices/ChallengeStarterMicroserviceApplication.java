package com.microservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.microservices.entities.Diet;
import com.microservices.entities.Food;
import com.microservices.entities.Group;
import com.microservices.entities.Patient;
import com.microservices.entities.Pay;
import com.microservices.entities.Specialist;
import com.microservices.repositories.DietRepository;
import com.microservices.repositories.FoodRepository;
import com.microservices.repositories.GroupRepository;
import com.microservices.repositories.PatientRepository;
import com.microservices.repositories.PayRepository;
import com.microservices.repositories.SpecialistRepository;

@SpringBootApplication
public class ChallengeStarterMicroserviceApplication implements CommandLineRunner {
	
	
	@Autowired
	private FoodRepository foodRepository;
	
	@Autowired
	private SpecialistRepository specialistRepository;
	
	@Autowired
	private PatientRepository patientRepository;
	
	@Autowired
	private DietRepository dietRepository;
	
	@Autowired
	private GroupRepository groupRepository;
	
	@Autowired
	private PayRepository payRepository;
	


	public static void main(String[] args) {
		SpringApplication.run(ChallengeStarterMicroserviceApplication.class, args);
	}



	@SuppressWarnings("unused")
	@Override
	public void run(String... args) throws Exception {
		
		
		Food f1 = new Food(null, 111.0, 111.0, 111.0, 111.0, "salada defrutas", 111.0, 111.0, 111.0, 111.0, 111.0, 111.0, 111.0);
		Food f2 = new Food(null, 211.0, 211.0, 211.0, 211.0, "queijo ricota", 211.0, 211.0, 211.0, 211.0, 211.0, 211.0, 211.0);
		Food f3 = new Food(null, 311.0, 311.0, 311.0, 311.0, "salada de vegetais", 311.0, 311.0, 311.0, 311.0, 311.0, 311.0, 311.0);
		Food f4 = new Food(null, 411.0, 111.0, 111.0, 111.0, "feijao", 111.0, 111.0, 111.0, 111.0, 111.0, 111.0, 111.0);
		Food f5 = new Food(null, 511.0, 511.0, 511.0, 511.0, "peito de peru", 511.0, 511.0, 511.0, 511.0, 511.0, 511.0, 511.0);
		foodRepository.saveAll(List.of(f1,f2,f3,f4,f5));
		
		Specialist s1 = new Specialist(null, "Dr Robert Rey", "Nutrologo", "55223");
		Specialist s2 = new Specialist(null, "Dra Roberta Close", "Nutricionista", "77799");
		specialistRepository.saveAll(List.of(s1,s2));
		
				
		Diet d1 = new Diet(null, "Dieta Paleolitica", "Dieta baseada em alimentos naturais de baixo teor calorico", "Emagrecimento", s2, List.of(f1, f2));
		Diet d2 = new Diet(null, "Dieta CarboProtein", "Dieta focada em alimentos que fonecam caboidratos e proteinas", "Ganho de massa muscular", s1, List.of(f2, f4, f5));
		dietRepository.saveAll(List.of(d1,d2));
		
		Patient p1 = new Patient(null, "Alessandra Cruz", "27/08/1987", "Estagiaria", "6412390", "01356073450", "(81)994963663", "Emagrecimento", 1.58, 83.0, "Sem alergias");
		Patient p2 = new Patient(null, "Jose Carlos", "27/04/1990", "Programador Junior", "8888888", "1111111111", "(11)994963663", "Ganho de masa muscular", 1.58, 83.0, "Sem alergias");
		patientRepository.saveAll(List.of(p1, p2));
		
		Group g1 = new Group(null, "Emagrecimento", "Grupo para pessoas acima do peso ideal", "Emagrecimento", List.of(p1), d1);
		Group g2 = new Group(null, "Ganha Volume", "Grupo para pessoas focadas em ganho de massa muscular", "Ganho de Masa Muscular", List.of(p2), d2);
		groupRepository.saveAll(List.of(g1, g2));
		
		Pay pay1 = new Pay(null, 300.0, false, p1);
		Pay pay2 = new Pay(null, 800.0, false, p2);
		payRepository.saveAll(List.of(pay1, pay2));
		
	}	

	

}
