package com.fpt.hurst.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fpt.hurst.dto.Cake;
import com.fpt.hurst.mapper.CakeMapper;

@Service
public class CakeService {

	@Autowired
	private CakeMapper cakeMapper;

	public List<Cake> getCakelist(Cake cake) {
		return cakeMapper.getCakelist(cake);
	}

	public Cake getCake(int id) {
		return cakeMapper.getCakeById(id);
	}

}
