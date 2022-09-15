package com.microservices.dto.specialist;

import com.microservices.entities.Specialist;

public class SpecialistMapper {
	
	public static Specialist fromDTO(RegistroSpecialistDTO dto) {
		return new Specialist(null, dto.getName_specialist(), dto.getOccupation_specialist(), dto.getCrn_crm());
	}

	public static ConsultaSpecialistDTO fromEntity(Specialist specialist) {
		return new ConsultaSpecialistDTO(specialist.getId_specialist(), specialist.getName_specialist(), specialist.getOccupation_specialist(), specialist.getCrn_crm());
	}
}
