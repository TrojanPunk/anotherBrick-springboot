package com.capstone.realestateapp.controllers;

import java.util.Optional;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.realestateapp.models.FavoritesData;
import com.capstone.realestateapp.models.PropertyDetails;
import com.capstone.realestateapp.repository.FavoritesRepository;

import lombok.Data;

@CrossOrigin(origins = "*")
@RestController
public class FavoritesController {
	
	private FavoritesRepository repository;
	
	@PutMapping("/postfavoritedata")
	public String updateUserFavorite(@RequestBody FavoritesData favoritesData) {
		repository.save(favoritesData);
		return "Updated favorites with ID to favorites: " + favoritesData.getId();
	}
	
	@GetMapping("/getfavuser/{id}")
	public Optional<FavoritesData> findById(@PathVariable String id) {
		return repository.findById(id);
	}
	
	
	@PostMapping("/postfavdata")
	public String saveUserFavorite(@RequestBody FavoritesData favoritesData) {
		repository.save(favoritesData);
		return "Added favorite with ID to favorites: " + favoritesData.getId();
	}
}
