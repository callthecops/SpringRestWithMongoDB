package com.example.PhoneBook.repository;

import com.example.PhoneBook.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository implements MongoRepository<User,String> {

}
