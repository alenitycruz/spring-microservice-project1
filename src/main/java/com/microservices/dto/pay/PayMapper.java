package com.microservices.dto.pay;

import com.microservices.entities.Pay;

public class PayMapper {

	public static Pay fromDTO(RegistroPayDTO dto) {
		return new Pay(null, dto.getPrice_diet(), dto.isIsdebt(), dto.getPatient());
	}
	
	public static ConsultaPayDTO fromEntity(Pay pay) {
		return new ConsultaPayDTO(pay.getId_pay(), pay.getPrice_diet(), pay.isIsdebt(),  pay.getPatient());
	}
}
