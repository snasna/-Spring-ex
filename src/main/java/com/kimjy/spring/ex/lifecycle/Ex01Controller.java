package com.kimjy.spring.ex.lifecycle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/lifecycle/ex01")
public class Ex01Controller {

	// 문자열 response 만들기
	@RequestMapping("/1")
	@ResponseBody
	public String stringResponse() {
		return "에제 1번 문자열 담는 response";
	}
	// map json response
	// 과일이름 : 가격
	@RequestMapping("/2")
	@ResponseBody
	public Map<String, Integer> MapREsponse() {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("apple", 1500);
		map.put("banana", 3000);
		map.put("orange", 1000);
		
		return map;
	}
}
