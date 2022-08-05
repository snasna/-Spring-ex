package com.kimjy.spring.ex.lifecycle.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ex02Controller {
	
	@RequestMapping("/lifecycle/ex02/1")
	public String ex02view() {
		
		return "lifecycle/ex02";
	}
	
}
