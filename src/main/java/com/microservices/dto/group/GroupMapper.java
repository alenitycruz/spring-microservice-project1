package com.microservices.dto.group;

import com.microservices.entities.Group;

public class GroupMapper {
	
	public static Group fromDTO(RegistroGroupDTO dto) {
		return new Group(null, dto.getTitle(), dto.getDescription(), dto.getPurpose(), dto.getPatient(), dto.getDiet());
	}
	
	public static ConsultaGroupDTO fromEntity(Group group) {
		return new ConsultaGroupDTO(group.getId_group(), group.getTitle(), group.getDescription(), group.getPurpose(), group.getPatient(), group.getDiet());
	}

}
