package com.WAAHomework.WAA.Repo;

import com.WAAHomework.WAA.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
public class UserRepo {
    private List<User> users= new ArrayList<>();

    public List<User> findAll(){
        return  users;
    }
    public User findById(long id){
        return users.stream().filter(user -> user.getId()==id).findFirst().orElse(null);
    }
    public void save(User user){
        users.add(user);
    }
}
