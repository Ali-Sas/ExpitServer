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
    
    @RequestMapping("/getmuseumcountry")
    public List<Museums> getMuseum2(@RequestParam String countryMuseum){
        return museum.getMuseum2(countryMuseum);
    }
    
    @RequestMapping("/getmuseumsortup")
    public List<Museums> getMuseumSortUp(@RequestParam String countryMuseum){
        return museum.getMuseumSortUp(countryMuseum);
    }
    
    @RequestMapping("/getmuseumsortname")
    public List<Museums> getMuseumSortName(@RequestParam String countryMuseum){
        return museum.getMuseumSortName(countryMuseum);
    }
    
    @RequestMapping("/getmuseumsortdown")
    public List<Museums> getMuseumSortDown(@RequestParam String countryMuseum){
        return museum.getMuseumSortDown(countryMuseum);
    }
    
    @RequestMapping("/getmuseums")
    public List<Museums> getMuseums(){
        return museum.getMuseums();
    }
    
    @RequestMapping("/getmuseumstop")
    public List<Museums> getMuseumsTop(){
        return museum.getMuseumsTop();
    }
}
