package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Museums;
import com.example.demo.repositories.MuseumsRepository;

@RestController
@RequestMapping("museum")
public class MuseumsController {
	
    @Autowired
    private MuseumsRepository museum;
 
    @RequestMapping("/create")
    public int createMuseum(@RequestParam String nameMuseum, @RequestParam String countryMuseum, @RequestParam String imageMuseum, @RequestParam String coordsMuseum, @RequestParam String infoMuseum, @RequestParam String ratingMuseum){
    return museum.createMuseum(nameMuseum, countryMuseum, imageMuseum, coordsMuseum, infoMuseum, ratingMuseum);
    }
 
    @RequestMapping("/id")
    public int deleteMuseum(@RequestParam Integer id){
        return museum.deleteMuseum(id);
    }
 
    @RequestMapping("/getmuseum")
    public Museums getMuseum(@RequestParam Integer id){
        return museum.getMuseum(id);
    }
 
    @RequestMapping("/getmuseums")
    public List<Museums> getMuseums(){
        return museum.getMuseums();
    }
}
