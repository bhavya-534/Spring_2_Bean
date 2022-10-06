package com.spring.two.Repository;

import com.spring.two.Model.User;

import java.util.List;

public interface UserRepository {

    List<User> findData();
}
