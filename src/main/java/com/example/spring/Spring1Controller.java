package com.example.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Spring1Controller{
	@RequestMapping("/")
	public String Index(){
		return "hello";
	}
}