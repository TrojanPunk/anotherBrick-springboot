package com.capstone.realestateapp.models;

import org.springframework.data.annotation.Id;
import java.util.List;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "PropertyDetails")
public class PropertyDetails {
	
	@Id
	private String id;
	
	private String propertyName;
	private Seller seller;
	private double ratings;
	private String category;
	private int price;
	private Location location;
	private Features features;
	private List<String> images;
	private int area;
}

@Data
class Seller {
	private String sellerName;
	private Long sellerMobile;
	private String sellerEmail;
}

@Data
class Features {
    private int bhk;
    private int baths;
    private int parking;
}

@Data
class Location {
	private String state;
	private String city;
	private Integer pincode;
	private String address;
}