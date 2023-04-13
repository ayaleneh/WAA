package com.WAAHomework.WAA.Controller;

import com.WAAHomework.WAA.Config.JwtUtils;
import com.WAAHomework.WAA.Entity.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    private JwtUtils jwtUtils;
    private BCryptPasswordEncoder passwordEncoder;

    public AuthController(JwtUtils jwtUtils, BCryptPasswordEncoder passwordEncoder){
        this.jwtUtils =jwtUtils;
        this.passwordEncoder=passwordEncoder;
    }
    @PostMapping("/login")
    public String login(@RequestBody User user){
        // Validate user credentials (replace this with a real authentication service)
        if (user.getName().equals("testuser") && passwordEncoder.matches(user.getPassword(), "$2a$10$2IevDskxEeSmy7Sy41Xl7.PSxoMoDznoGumq4vr0kOWOI9X0uV7qC")) {
            return jwtUtils.generateToken(user.getName());
        } else {
            throw new RuntimeException("Invalid username or password");
        }
    }
}
