package com.viniciuscamargo.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.viniciuscamargo.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
