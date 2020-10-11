package com.example.PhoneBook.repository;

import com.example.PhoneBook.model.Details;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailsRepository extends MongoRepository<Details, String> {
}
