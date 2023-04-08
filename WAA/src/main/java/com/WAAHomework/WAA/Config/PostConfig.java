//package com.WAAHomework.WAA.Config;
//
//import com.WAAHomework.WAA.Entity.Post;
//import com.WAAHomework.WAA.Entity.User;
//import com.WAAHomework.WAA.Repo.PostRepo;
//import com.WAAHomework.WAA.Repo.UserRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//
//@Component
//public class PostConfig implements CommandLineRunner {///*DataInitializer*/
//
//    private final UserRepo userRepository;
//    private final PostRepo postRepository;
//   @Autowired
//    public PostConfig(UserRepo userRepository, PostRepo postRepository) {
//        this.userRepository = userRepository;
//        this.postRepository = postRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//       Post post1= new Post(10L,"First Post","Content of Post 1","John Doe");
//        Post post2= new Post(11L,"Second Post","Content of Post 2","John Doe");
//        Post post3= new Post(12L,"third Post","Content of Post 3","John Doe");
//        User user1 = new User(1L,"John Doe", List.of(post1,post2,post3));
//        postRepository.saveAll(List.of(post1,post2,post3));
//        userRepository.save(user1);
//    }
//}
