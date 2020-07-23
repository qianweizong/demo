package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/inkstone/test/")
public class TestController {

	@GetMapping(value = "getRepon.do")
	public String getRepon() {
		return "InkStone";
	}
	
}
