package com.jdc.mappings.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jdc.mappings.model.service.CourseService;

@Controller
@RequestMapping("course")
public class CourseController {
	
	@Autowired
	CourseService service;

	@GetMapping
	public String index(Map<String,Object> model) {
		
		model.put("list",service.findAll());
		System.out.println(model);
		
		return "course-list";
	}
	
}
