package com.example.demo.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.entity.Comments;

public class CommentsMapper implements RowMapper<Comments>{
    public Comments mapRow(ResultSet rs, int rowNum) throws SQLException {
    	Comments comments = new Comments();
        comments.setId(rs.getInt("id"));
        comments.setFirstName(rs.getString("firstName"));
        comments.setLastName(rs.getString("lastName"));
        comments.setComment(rs.getString("comment"));
        comments.setEstimationMuseum(rs.getDouble("estimation"));
        comments.setIdMuseum(rs.getInt("museum_id"));
        comments.setDate(rs.getString("date"));
        return comments;
    }

}
