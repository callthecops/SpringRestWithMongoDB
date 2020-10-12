package com.example.PhoneBook.repository;


import com.example.PhoneBook.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,String> {
    User findById(String id);
}
