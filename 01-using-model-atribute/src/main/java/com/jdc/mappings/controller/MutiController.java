package com.jdc.mappings.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("multi")
public class MutiController {

	
	/*
	 URL => multi
	*/
	@RequestMapping
	public void index() {
		
	}
	
	/*
	 URL => multi/action1
	*/
	@RequestMapping("action1")
	public String action1(ModelMap model) {
		model.put("message", "action1");
		return "multi";
	}
	
	/*
	 URL => multi/action1?id=(?)
	*/
	@GetMapping(value="action1",params = "id")
	public String action1WithParam(ModelMap model) {
		model.put("message", "action1 with param");
		return "multi";
	}
	
	/*
	 URL => multi/action2
	*/
	@RequestMapping("action2")
	public String action2(ModelMap model) {
		model.put("message", "action2");
		return "multi";
	}
	
	/*
	 URL => multi/(any)
	*/
	@RequestMapping("**")
	public String wildCard(ModelMap model) {
		model.put("message", "wild card");
		return "multi";
	}
	
	/*
	 URL => multi/(any)
	*/
	@RequestMapping("{:\\d+}")
	public String digit(ModelMap model) {
		model.put("message", "digit");
		return "multi";
	}
	
	
}
