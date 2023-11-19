package com.capstone.realestateapp.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "favorites")
public class FavoritesData {
	
	@Id
	private String id;
	
	private List<FavoritesPropertyData> favorites;
}

@Data
class FavoritesPropertyData {
	
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
class FavoritesSeller {
	private String sellerName;
	private Long sellerMobile;
	private String sellerEmail;
}

@Data
class FavoritesFeatures {
    private int bhk;
    private int baths;
    private int parking;
}

@Data
class FavoritesLocation {
	private String state;
	private String city;
	private Integer pincode;
	private String address;
}