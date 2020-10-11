package com.example.PhoneBook.dbconnector;

import com.example.PhoneBook.model.Details;
import com.example.PhoneBook.model.User;
import com.example.PhoneBook.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner {

    private UserRepository userRepository;

    public DbSeeder(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        User andrei = new User("Andrei", new Details("123456", "07550991234", "andrei@yahoo.com", 22));
        User maria = new User("Maria", new Details("654234", "07550991234", "maria@yahoo.com", 22));
        User vasile = new User("Vasile", new Details("7658", "07550991234", "vasile@yahoo.com", 22));


        //this drops all users
        this.userRepository.deleteAll();

        //this adds all user back;
        List<User> userList = Arrays.asList(andrei, maria, vasile);
        this.userRepository.saveAll(userList);

    }
}

