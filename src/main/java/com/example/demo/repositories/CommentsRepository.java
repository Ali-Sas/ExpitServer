package com.example.demo.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Comments;

@Component
public class CommentsRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    public int createComment(String firstName, String lastName, String comment, Double estimationMuseum, Integer museumId, String date){
        return jdbcTemplate.update("INSERT INTO \"COMMENTS\" (\"FIRSTNAME\", \"LASTNAME\", \"COMMENT\", \"ESTIMATION\", \"MUSEUM_ID\", \"DATE\") VALUES (?, ?, ?, ?, ?, ?)", firstName, lastName, comment, estimationMuseum, museumId, date);
    }

    public int deleteComment(Integer id){
        return jdbcTemplate.update("DELETE FROM \"COMMENTS\" WHERE \"ID\" = ?",id);
    }
 
	public List<Comments> getComment(Integer id){
        return jdbcTemplate.query("SELECT * FROM \"COMMENTS\" WHERE \"MUSEUM_ID\"=?", new CommentsMapper(), id);
    }
 
    public List<Comments> getComments(){
        return jdbcTemplate.query("SELECT * FROM \"COMMENTS\" ORDER BY \"DATE\"", new CommentsMapper());
    }
}
