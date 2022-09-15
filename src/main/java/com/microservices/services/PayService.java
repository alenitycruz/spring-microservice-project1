package com.microservices.services;

import java.util.Optional;
import java.util.UUID;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.microservices.entities.Pay;
import com.microservices.repositories.PayRepository;

@Service
public class PayService {
	
	@Autowired
	private PayRepository payRepository;
	
	public Pay save(Pay pay) {
		return payRepository.save(pay);
	}

	public Page<Pay> findAll(Pageable pageable){
		return payRepository.findAll(pageable);
	}
	
	public Pay findById(UUID id) {
		Optional<Pay> optional = payRepository.findById(id);
		return optional.orElseThrow(() -> new EntityNotFoundException("Pay not found"));
	}
	
	public Pay editPay(Pay pay, UUID id) {
		Pay optional = this.findById(id);
		
		pay.setId_pay(optional.getId_pay());
		
		return payRepository.save(pay);
	}
	
	public void delete(UUID id) {
		Pay PayOriginal = this.findById(id);

		payRepository.delete(PayOriginal);
	}
	
	
}
