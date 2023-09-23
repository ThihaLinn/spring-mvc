package com.jdc.mappings.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Course {

	int id;
	String name;
	String level;
	String duration;
	String fees;
	public Course(String name, String level, String duration, String fees) {
		super();
		this.name = name;
		this.level = level;
		this.duration = duration;
		this.fees = fees;
	}
	
	

}
