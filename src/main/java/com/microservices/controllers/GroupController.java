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

import com.microservices.dto.group.ConsultaGroupDTO;
import com.microservices.dto.group.GroupMapper;
import com.microservices.dto.group.RegistroGroupDTO;
import com.microservices.entities.Group;
import com.microservices.services.GroupService;

@RestController
@RequestMapping("/v1/group")
public class GroupController {
	
	@Autowired
	private GroupService groupService;

	@PostMapping
	public ResponseEntity<ConsultaGroupDTO> saveFood(@RequestBody @Valid RegistroGroupDTO dto){
		return ResponseEntity.status(HttpStatus.CREATED).body(GroupMapper.fromEntity(groupService.save(GroupMapper.fromDTO(dto))));
	}
	
	@GetMapping
	public ResponseEntity<Page<ConsultaGroupDTO>> findAllFood(@PageableDefault Pageable pageable){
		return ResponseEntity.ok(groupService.findAll(pageable).map(GroupMapper::fromEntity));
	}
	
	@PutMapping("{id}")
	public ResponseEntity<ConsultaGroupDTO> updateGroup(@RequestBody RegistroGroupDTO dto, @PathVariable UUID id){
		try {
			Group group = groupService.editGroup(GroupMapper.fromDTO(dto), id);
			return ResponseEntity.ok(GroupMapper.fromEntity(group));
		} catch (RuntimeException ex) {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("{id}") 
	public ResponseEntity<ConsultaGroupDTO> findGroupById(@PathVariable UUID id){

		Group group = groupService.findById(id);
		
		return ResponseEntity.ok(GroupMapper.fromEntity(group));
		
		
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<ConsultaGroupDTO> deleteGroup(@PathVariable UUID id){
		
		try {
			groupService.delete(id);
			
			return ResponseEntity.ok().build();
		}catch(RuntimeException ex) {
			return ResponseEntity.notFound().build();
		}
		
	}


}
