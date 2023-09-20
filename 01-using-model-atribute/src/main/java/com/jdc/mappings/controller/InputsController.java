package com.jdc.mappings.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("inputs")
public class InputsController {
	
	@GetMapping
	public void index() {
		
	}

	@GetMapping("{type}/search/{id:\\d+}")
	public String findById(
			@PathVariable String type,
			@PathVariable Integer id,
			ModelMap model
			) {
		 model.addAttribute("type",type);
		 model.addAttribute("id",id);
		
		return "inputs";
	}
	
	@GetMapping("{date:\\d{4}\\-\\d{2}\\-\\d{2}}")
	public String generateDate(
			@PathVariable 
			LocalDate date,
			Model model
			) {
		
		model.addAttribute("date",date);
		System.out.println(date);
		
		return "inputs";
	}
	
	@GetMapping("{level:Basic|imtermediate|Advance}")
	public String usingEnum(
			@PathVariable Level level,
			Model model
			) {
		
		model.addAttribute("level",level);
		
		return "inputs";
	}
	
	@GetMapping("matrix/{product}")
	public String userMatrix(
			@PathVariable ("pd") String product,
			@MatrixVariable ("p") String price,
			@MatrixVariable ("b") String brand,
			Model model
			) {
		
		var message = "Product : %s , Price : %s ,Brand : %s".formatted(product,price,brand);
		
		model.addAttribute("message",message);
		
		return "inputs";
	}
	
	@GetMapping("request")
	public String requestParam(
			@RequestParam ("p") String produt,
			@RequestParam (value="w",required = true,defaultValue = "34") String width,
			@RequestParam (value="l",required = true,defaultValue = "41") String length,
			Model model 
			) {
		
		var answer = "Product : %s  width : %s length : %s".formatted(produt,width,length);
		
		model.addAttribute("answer",answer);
		
		return "inputs";
	}
	
	
}
