package com.fpt.hurst.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fpt.hurst.dto.Cake;

@Mapper
public interface CakeMapper {

	public List<Cake> getCakeList(Cake cake);

	public Cake getCakeById(int id);

}
