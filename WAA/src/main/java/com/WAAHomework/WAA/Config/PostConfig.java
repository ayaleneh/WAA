package com.WAAHomework.WAA.Config;

import com.WAAHomework.WAA.Entity.Post;
import com.WAAHomework.WAA.Entity.User;
import com.WAAHomework.WAA.Repo.PostRepo;
import com.WAAHomework.WAA.Repo.UserRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
public class PostConfig {
    @Bean
    CommandLineRunner commandLineRunner(PostRepo postRepo, UserRepo userRepo){
        return args->{
            Post a= new Post(1,"title1", "Content of Post a","Author of A");
            Post b= new Post(2,"title2", "Content of Post b","Author of A");
            Post c= new Post(3,"title3", "Content of Post c","Author of A");
            Post d= new Post(4,"title4", "Content of Post d","Author of D");
            User user1= new User(10,"Author A",List.of(a,b,c,d));
            User user2 =new User(11,"Author D",List.of(d));
            postRepo.saveAll(List.of(a,b,c,d));
            userRepo.saveAll(List.of(user1,user2));
        };
    }
}