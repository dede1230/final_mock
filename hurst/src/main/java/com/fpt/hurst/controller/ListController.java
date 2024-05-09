package com.fpt.hurst.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.fpt.hurst.service.CakeService;

@Controller
public class ListController {

	@Autowired
	private CakeService cakeList;

    private static final Logger logger = LogManager.getLogger(ListController.class);

	@GetMapping("/cakelist")
	public String index() {
		logger.info(cakeList.getCakelist().size());
		return "cakelist";
	}
}