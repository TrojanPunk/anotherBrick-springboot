package com.capstone.realestateapp.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "PropertyDetails")
public class PropertyFilterData {
	
	private String category;
	private int price;
	private int maxPrice;
	private int minPrice;
	private int area;
}
