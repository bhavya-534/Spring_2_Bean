package com.spring.two;

import com.spring.two.Repository.UserRepository;
import com.spring.two.Repository.UserRepositoryImpl;
import com.spring.two.Service.UserService;
import com.spring.two.Service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    //Setter Injection - If you are using this please hide the "parametrized constructor" in service
    // because it has default Constructor for creating object, here issue with overriding

//    @Bean(name = "userService")
//    public UserService setterService()
//    {
//        UserService service = new UserServiceImpl();
//        service.setData(getUserRepositoryImpl());
//        return service;
//    }


    //Constructor Injection

    @Bean(name = "userService")
    public UserService constructorService()
    {
        return new UserServiceImpl(getUserRepositoryImpl());

    }

    @Bean(name = "userRepository")
    public UserRepository getUserRepositoryImpl() {
        return new UserRepositoryImpl();
    }
}
