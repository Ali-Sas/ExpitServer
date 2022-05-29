package com.example.demo.entity;

public class Museums {
	public Integer id;
	public String nameMuseum, countryMuseum, imageMuseum, coordsMuseum, infoMuseum;
	
    public Integer getId() {
        return id;
    }
 
    public void setId(Integer id) {
        this.id = id;
    }
    
    public void setNameMuseum(String name) {
        this.nameMuseum = name;
    }
    
    public String nameMuseum() {
        return nameMuseum;
    }
    
    public void setCountryMuseum(String country) {
        this.countryMuseum = country;
    }
    
    public String countryMuseum() {
        return countryMuseum;
    }
    
    public void setImageMuseum(String image) {
        this.imageMuseum = image;
    }
    
    public String imageMuseum() {
        return imageMuseum;
    }
    
    public void setCoordsMuseum(String coords) {
        this.coordsMuseum = coords;
    }
    
    public String coordsMuseum() {
        return coordsMuseum;
    }
    
    public void setInfoMuseum(String info) {
        this.infoMuseum = info;
    }
    
    public String infoMuseum() {
        return infoMuseum;
    }

}
