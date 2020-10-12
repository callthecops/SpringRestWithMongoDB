package com.example.PhoneBook.repository;


import com.example.PhoneBook.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    User findUserById(String id);

    //filtering by age using mongo query language.
    @Query(value = "{details.age:?0}")
    List<User> findByAge(int age);


}
