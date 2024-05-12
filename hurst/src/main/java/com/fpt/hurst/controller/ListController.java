package com.fpt.hurst.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fpt.hurst.dto.Cake;
import com.fpt.hurst.service.CakeService;

@Controller
public class ListController {

	@Autowired
	private CakeService cakeService;

    private static final Logger logger = LogManager.getLogger(ListController.class);

	@GetMapping("/cakelist")
	public String index(Model model) {
		
		List<Cake> cakelist = cakeService.getCakelist();
		model.addAttribute("cakelist", cakelist);
		logger.info("cakelist size: " + cakelist.size());
		return "cakelist";
	}
}