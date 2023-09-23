package com.jdc.mappings.model.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jdc.mappings.model.dto.Course;

@Component
public class CourseService {
	
	List<Course> repo;
	
	CourseService(){
		repo=new ArrayList<>();
	}
	
	@Autowired
	CodeGenerator codegen;
	
	@PostConstruct
	public void init() {
		createCourse(new Course("Java Basic", "Basic", "3 months", "300000"));
		createCourse(new Course("Spring", "Advance", "3 months", "300000"));
		createCourse(new Course("OneStop(weekday)", "Intermediate", "6 months", "750000"));
		createCourse(new Course("OneStop(weedend)", "Intermediate", "6 months", "750000"));
	}

	public int createCourse(Course c) {
		int id = codegen.next();
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
