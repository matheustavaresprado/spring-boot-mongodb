package com.matheus.springmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.matheus.springmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

	
}
