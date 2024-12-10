package fr.insa.projectintegrator.PickUpURLMS.service;

import org.springframework.beans.factory.annotation.Autowired;

import fr.insa.projectintegrator.PickUpURLMS.repository.PickUpURLRepository;

public class PickUpURLService {
	
	@Autowired
	private PickUpURLRepository repository;
	
	public String TestConnection() {
		return "yolo ! you're well connected with pickUpURLProject !";
	}
	
	

}
