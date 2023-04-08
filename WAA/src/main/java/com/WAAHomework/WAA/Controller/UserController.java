package com.WAAHomework.WAA.Controller;

import com.WAAHomework.WAA.Entity.Post;
import com.WAAHomework.WAA.Entity.User;
import com.WAAHomework.WAA.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(UserService userService){
        this.userService=userService;
    }
    @GetMapping("/")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    @GetMapping("/{id}")
    public User getUserById(@PathVariable long id){
       return userService.getUserById(id);
    }
    @GetMapping("/{id}/posts")
    public List<Post> getPostsByUserId(@PathVariable long id){
        return userService.getPostByUserId(id);
    }
    @PostMapping("/")
    public void createUser(@RequestBody User user){
        userService.createUser(user);
    }
}
