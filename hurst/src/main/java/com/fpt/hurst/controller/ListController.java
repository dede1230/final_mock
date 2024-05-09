package com.fpt.hurst.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.fpt.hurst.service.CakeService;

@Controller

public class ListController {

	@Autowired
	private CakeService cakeList;

	@GetMapping("/cakelist")
	public String index() {
		return "cakelist";
	}
}