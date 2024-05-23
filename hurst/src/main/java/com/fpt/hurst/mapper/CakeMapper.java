package com.fpt.hurst.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import com.fpt.hurst.dto.Cake;
import com.fpt.hurst.mapper.provider.CakeProvider;

@Mapper
public interface CakeMapper {

	@SelectProvider(type = CakeProvider.class, method = "getCakelist")
	@Result(property = "createAt", column = "created_at")
	@Result(property = "updateAt", column = "updated_at")
	public List<Cake> getCakelist(Cake cake);

	@SelectProvider(type = CakeProvider.class, method = "getCakeById")
	@Result(property = "createAt", column = "created_at")
	@Result(property = "updateAt", column = "updated_at")
	public Cake getCakeById(int id);

}
