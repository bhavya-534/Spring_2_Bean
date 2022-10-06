package com.spring.two.Service;

import com.spring.two.Model.User;
import com.spring.two.Repository.UserRepository;
import com.spring.two.Repository.UserRepositoryImpl;

import java.util.List;

public class UserServiceImpl implements UserService{

    private UserRepository repository;

    //Setter Injection - Beans

    public void setData(UserRepository repository)
    {
        System.out.println("With the help of Setter Injection");
        this.repository = repository;
    }

    public List<User> manipulateData() {
        System.out.println("Beans are working...");
        return repository.findData();
    }

    // Constructor Injection - Beans
    public UserServiceImpl(UserRepository repository) {
        System.out.println("With the help of Constructor Injection");
        this.repository = repository;
    }



}
