package com.jdc.mappings.model.service;

import org.springframework.stereotype.Component;

@Component
public class CodeGenerator {

	private int id;
	
	public int next() {
		id++;
		return id;
	}
	
}
