package com.fpt.hurst.mapper.provider;

import org.apache.ibatis.jdbc.SQL;

import com.fpt.hurst.dto.Cake;

public class CakeProvider {
    
    public String getCakelist(Cake cake) {
        return  new SQL() {{
            SELECT("id, name, price, description, information, image, likes, created_at, updated_at");
            FROM("CAKE");
            if (cake.getName() != null) {
                WHERE("name like concat('%', #{name}, '%')");
            }

        }}.toString();
    }
    
    public String getCakeById(Integer id) {
        return new SQL() {{
            SELECT("id, name, price, description, information, image, likes, created_at, updated_at");
            FROM("CAKE");
            if (id != null) {
                WHERE("id = #{id}");
            }
        }}.toString();
    }
}
