package com.javastudy.ch04.classdefinition;

public class Product {
    private String name;
    private int price;
    private String manufacturer;
    private String description;

  
    public Product(String name, int price, String manufacturer, String description) {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.description = description;
    }


    public String getName() {
    	return name; 
    	}
    public void setName(String name) { 
    	this.name = name; 
    	}
    
    public int getPrice() { 
    	return price; 
    	}
    public void setPrice(int price) {
    	this.price = price; 
    	}
    
    public String getManufacturer() {
    	return manufacturer; 
    	}
    public void setManufacturer(String manufacturer) {
    	this.manufacturer = manufacturer; 
    	}
    
    public String getDescription() {
    	return description; 
    	}
    public void setDescription(String description) {
    	this.description = description; 
    	}
    
    @Override
    public String toString() {
        return name + "(" + price + "), 제조사 : " + manufacturer + ", 상품설명 : " + description;
    }
}
