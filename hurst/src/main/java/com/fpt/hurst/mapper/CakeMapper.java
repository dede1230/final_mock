package com.fpt.hurst.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;

import com.fpt.hurst.dto.Cake;

@Mapper
public interface CakeMapper {

	@Select("select id, name, price, description, information, image, likes, created_at, updated_at\n" + "from CAKE")
	@Result(property = "createAt", column = "created_at")
	@Result(property = "updateAt", column = "updated_at")
	public List<Cake> getCakelist();

	@Select("select id, name, price, description, information, image, likes, created_at, updated_at\n" + "from CAKE\n" + "where id = #{id}")
	@Result(property = "createAt", column = "created_at")
	@Result(property = "updateAt", column = "updated_at")
	public Cake getCakeById(int id);

}
