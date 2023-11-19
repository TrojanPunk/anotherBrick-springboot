package com.capstone.realestateapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.capstone.realestateapp.models.FavoritesData;

public interface FavoritesRepository extends MongoRepository<FavoritesData, String> {
}
