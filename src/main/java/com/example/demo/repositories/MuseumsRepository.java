package com.example.demo.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Museums;

@Component
public class MuseumsRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    public int createMuseum(String nameMuseum, String countryMuseum, String imageMuseum, String coordsMuseum, String infoMuseum, String ratingMuseum){
        return jdbcTemplate.update("INSERT INTO \"MUSEUMS\" (\"NAME\", \"COUNTRY\", \"IMAGE\", \"COORDS\", \"INFO\", \"ESTIMATION\") VALUES (?, ?, ?, ?, ?, ?)", nameMuseum, countryMuseum, imageMuseum, coordsMuseum, infoMuseum, ratingMuseum);
    }

    public int deleteMuseum(Integer id){
        return jdbcTemplate.update("DELETE FROM \"MUSEUMS\" WHERE \"ID\" = ?",id);
    }
    
    public Museums getMuseum(Integer id){
        return jdbcTemplate.queryForObject("SELECT * FROM \"MUSEUMS\" WHERE \"ID\"=?", new MuseumsMapper(), id);
    }
    
    public List<Museums> getMuseum2(String id){
        return jdbcTemplate.query("SELECT * FROM \"MUSEUMS\" WHERE \"COUNTRY\"=?", new MuseumsMapper(), id);
    }

    
    public List<Museums> getMuseumsTop(){
        return jdbcTemplate.query("SELECT * FROM \"MUSEUMS\" ORDER BY \"ESTIMATION\" DESC", new MuseumsMapper());
    }
    
    public List<Museums> getMuseumSortUp(String id){
        return jdbcTemplate.query("SELECT * FROM \"MUSEUMS\" WHERE \"COUNTRY\"=? ORDER BY \"ESTIMATION\" DESC", new MuseumsMapper(), id);
    }
    
    public List<Museums> getMuseumSortUpNull(){
        return jdbcTemplate.query("SELECT * FROM \"MUSEUMS\" ORDER BY \"ESTIMATION\" DESC", new MuseumsMapper());
    }
    
    public List<Museums> getMuseumSortDown(String id){
        return jdbcTemplate.query("SELECT * FROM \"MUSEUMS\" WHERE \"COUNTRY\"=? ORDER BY \"ESTIMATION\"", new MuseumsMapper(), id);
    }
    
    public List<Museums> getMuseumSortDownNull(){
        return jdbcTemplate.query("SELECT * FROM \"MUSEUMS\" ORDER BY \"ESTIMATION\"", new MuseumsMapper());
    }

    public List<Museums> getMuseumSortName(String id){
        return jdbcTemplate.query("SELECT * FROM \"MUSEUMS\" WHERE \"COUNTRY\"=? ORDER BY \"NAME\"", new MuseumsMapper(), id);
    }
 
    public List<Museums> getMuseums(){
        return jdbcTemplate.query("SELECT * FROM \"MUSEUMS\"", new MuseumsMapper());
    }
    
    public List<Museums> getMuseumsNull(String country){
        return jdbcTemplate.query("SELECT * FROM \"MUSEUMS\" WHERE \"COUNTRY\"=?", new MuseumsMapper(), country);
    }
}
