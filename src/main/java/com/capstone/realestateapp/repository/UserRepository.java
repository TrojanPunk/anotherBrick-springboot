package com.capstone.realestateapp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.capstone.realestateapp.models.PropertyDetails;
import com.capstone.realestateapp.models.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	@Query("{ 'username': ?0, 'password': ?1 }")
	User findUser(String username, String password);
}
