package com.jdc.mappings.model.service;

import org.springframework.stereotype.Component;

@Component
public class CodeGenerator {

	private int id;
	
	public int createCode() {
		
		id++;
		
		return id;
	}
	
}
