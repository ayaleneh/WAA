package com.WAAHomework.WAA.Service;

import com.WAAHomework.WAA.Aspect.ExecutionTime;
import com.WAAHomework.WAA.Entity.Post;
import com.WAAHomework.WAA.Entity.User;

import com.WAAHomework.WAA.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepo userRepo;
  @Autowired
    public UserService(UserRepo userRepo){
        this.userRepo=userRepo;
    }
    public List<User> getAllUsers(){
    return  userRepo.findAll();
    }
    @ExecutionTime
    public User getUserById(long id){
      return userRepo.findById(id).orElse(null);
    }
    public void createUser(User user){
      userRepo.save(user);
    }
    public List<Post> getPostByUserId(long id){
      User user=userRepo.findById(id).orElse(null);
      if (user!=null){
          return user.getPosts();
      }
      return null;
    }
    //userRepository.deleteById(userId);when you delete a user, all related posts and comments will also be deleted:
}
