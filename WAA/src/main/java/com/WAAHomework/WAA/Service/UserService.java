package com.WAAHomework.WAA.Service;

import com.WAAHomework.WAA.Entity.User;
import com.WAAHomework.WAA.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class UserService {
    private final UserRepo userRepo;

    public UserService(UserRepo userRepo){
        this.userRepo=userRepo;
    }
    public List<User> getAllUsers(){
        return userRepo.findAll();
    }
}
