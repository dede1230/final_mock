package com.fpt.hurst.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.fpt.hurst.dto.Cake;
import com.fpt.hurst.service.CakeService;


@Controller
public class ListController {

	@Autowired
	private CakeService cakeService;

    private static final Logger logger = LogManager.getLogger(ListController.class);

	@GetMapping("/cakelist")
	public String index(Model model, @ModelAttribute(name = "cake") Cake cake) {
		List<Cake> cakelist = cakeService.getCakelist();
		model.addAttribute("cakelist", cakelist);
		logger.info(cakeService.getCakelist().size());
		model.addAttribute("cake", cake);
		return "cakelist";
	}

	@GetMapping("/cakelist/{id}")
	public String getCake(@PathVariable("id") int no, Model model) {
		Cake cake = cakeService.getCake(no);
		model.addAttribute("cake", cake);
		logger.info(cake.getName());
		return "singlecake";
	}
	

}