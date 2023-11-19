package com.capstone.realestateapp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.capstone.realestateapp.models.PropertyDetails;

@Repository
	public interface PropertyRepository extends MongoRepository<PropertyDetails, String> {
		@Query("{ 'category': ?0, 'area': { $lte: ?1 }, 'price': { $gte: ?2, $lte: ?3 } }")
		List<PropertyDetails> findFilteredData(String category, int area, int minPrice, int maxPrice);
}