package fr.insa.projectintegrator.PickUpURLMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import fr.insa.projectintegrator.PickUpURLMS.service.PickUpURLService;

public class PickUpURLController {
	@Autowired
	private PickUpURLService pUService;
	
	@GetMapping("/")
	public String getConnection() {
		return pUService.TestConnection();
	}

}
