package com.UUIDGenerator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UUIDGenerator.models.Generator;
import com.UUIDGenerator.service.GeneratorService;

@RestController
@RequestMapping("/generator")
public class GeneratorController {

	private final GeneratorService service;
	
	public GeneratorController(GeneratorService service) {
		this.service=service;
	}
	

	@GetMapping("/generateUUID")
	public ResponseEntity<Generator> generate(){
		Generator idGenerate=service.generateUUID();
		
		return ResponseEntity.ok(idGenerate);
	}
	
	
}
