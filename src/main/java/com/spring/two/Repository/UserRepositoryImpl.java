package com.spring.two.Repository;

import com.spring.two.Model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository{
    public List<User> findData() {
        List<User> list = new ArrayList<User>();
        User user1 = new User("bhavya","Ch");
        User user2 = new User("saiki","M");
        list.add(user1);
        list.add(user2);
        return list;
    }
}
