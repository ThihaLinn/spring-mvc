package com.jdc.mappings.model.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.jdc.mappings.model.dto.Course;

public class CourseService {
	
	List<Course> repo;
	
	CourseService(){
		repo=new ArrayList<>();
	}
	
	@Autowired
	CodeGenerator codegen;

	public int createCourse(Course c) {
		int id = codegen.createCode();
		c.setId(id);
		repo.add(c);
		return id;
	}
	
	public void findById(int id) {
		repo.stream().filter(c-> c.getId()==id).findAny().orElse(null);
	}
	
	public List<Course> findAll(){
		var list = List.copyOf(repo);
		return list;
	}
	
}
