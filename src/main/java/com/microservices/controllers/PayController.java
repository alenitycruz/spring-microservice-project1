package com.microservices.controllers;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.dto.pay.ConsultaPayDTO;
import com.microservices.dto.pay.PayMapper;
import com.microservices.dto.pay.RegistroPayDTO;
import com.microservices.entities.Pay;
import com.microservices.services.PayService;

@RestController
@RequestMapping("/v1/pay")
public class PayController {

	@Autowired
	private PayService payService;
	
	@PostMapping
	public ResponseEntity<ConsultaPayDTO> saveFood(@RequestBody @Valid RegistroPayDTO dto){
		return ResponseEntity.status(HttpStatus.CREATED).body(PayMapper.fromEntity(payService.save(PayMapper.fromDTO(dto))));
	}
	
	@GetMapping
	public ResponseEntity<Page<ConsultaPayDTO>> findAllFood(@PageableDefault Pageable pageable){
		return ResponseEntity.ok(payService.findAll(pageable).map(PayMapper::fromEntity));
	}
	
	@PutMapping("{id}")
	public ResponseEntity<ConsultaPayDTO> updatePatient(@RequestBody RegistroPayDTO dto, @PathVariable UUID id){
		try {
			Pay pay = payService.editPay(PayMapper.fromDTO(dto), id);
			return ResponseEntity.ok(PayMapper.fromEntity(pay));
		} catch (RuntimeException ex) {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("{id}") 
	public ResponseEntity<ConsultaPayDTO> findPayById(@PathVariable UUID id){

		Pay pay = payService.findById(id);
		
		return ResponseEntity.ok(PayMapper.fromEntity(pay));
		
		
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<ConsultaPayDTO> deletePay(@PathVariable UUID id){
		
		try {
			payService.delete(id);
			
			return ResponseEntity.ok().build();
		}catch(RuntimeException ex) {
			return ResponseEntity.notFound().build();
		}
		
	}


}
