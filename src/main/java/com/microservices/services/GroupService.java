package com.microservices.services;

import java.util.Optional;
import java.util.UUID;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.microservices.entities.Group;
import com.microservices.repositories.GroupRepository;

@Service
public class GroupService {
	
	@Autowired
	private GroupRepository groupRepository;
	
	public Group save(Group group) {
		return groupRepository.save(group);
	}
	
	public Page<Group> findAll(Pageable pageable) {
		return groupRepository.findAll(pageable);
	}
	
	public Group findById(UUID id){
		Optional<Group> optional = groupRepository.findById(id);
		return optional.orElseThrow(() -> new EntityNotFoundException("Group not found"));
	}
	
	public Group editGroup(Group group, UUID id) {
		Group optional = this.findById(id);
		
		group.setId_group(optional.getId_group());
		
		return groupRepository.save(group);
	}
	
	public void delete(UUID id) {
		Group groupOriginal = this.findById(id);

		groupRepository.delete(groupOriginal);

	}
}
