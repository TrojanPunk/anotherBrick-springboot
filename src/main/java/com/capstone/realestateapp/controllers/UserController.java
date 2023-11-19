package com.capstone.realestateapp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.realestateapp.models.PropertyDetails;
import com.capstone.realestateapp.models.User;
import com.capstone.realestateapp.repository.UserRepository;

@CrossOrigin(origins = "*")
@RestController
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	@GetMapping("/usersignin")
	public User getUser(@RequestParam String username, @RequestParam String password) {
	    return repository.findUser(username, password);
	}
	
	@GetMapping("/usersignin/{id}")
	public Optional<User> findById(@PathVariable String id) {
		return repository.findById(id);
	}	
	
	@PostMapping("/usersignup")
	public String saveProperty(@RequestBody User user) {
		repository.save(user);
		return "Added user with ID: " + user.getId();
	}
	
	@PutMapping("/putfav/{id}")
	public String updateProperty(@RequestBody User user) {
		repository.save(user);
		return "Updated user with ID: " + user.getId();
	}
}