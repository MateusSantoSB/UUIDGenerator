package com.UUIDGenerator.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.UUIDGenerator.models.Generator;

@Service
public class GeneratorService {

	 
	public Generator generateUUID() {
		UUID uuid=UUID.randomUUID();
		Generator idGenerate=new Generator();
		idGenerate.setId(uuid);
		return idGenerate;
	}
	
	
}
