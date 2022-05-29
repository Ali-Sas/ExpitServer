package com.example.demo.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.entity.Museums;


public class MuseumsMapper implements RowMapper<Museums>{

    public Museums mapRow(ResultSet rs, int rowNum) throws SQLException {
    	Museums museums = new Museums();
        museums.setId(rs.getInt("id"));
        museums.setNameMuseum(rs.getString("name"));
        museums.setCountryMuseum(rs.getString("country"));
        museums.setImageMuseum(rs.getString("image"));
        museums.setCoordsMuseum(rs.getString("coords"));
        museums.setInfoMuseum(rs.getString("info"));
        return museums;
    }

}
