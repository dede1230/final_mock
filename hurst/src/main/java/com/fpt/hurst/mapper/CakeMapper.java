package com.fpt.hurst.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.fpt.hurst.dto.Cake;

@Mapper
public interface CakeMapper {

	@Select("select id, name, price, description, information, image, likes, created_at, updated_at\n" + "from CAKE")
	public List<Cake> getCakelist();

}
