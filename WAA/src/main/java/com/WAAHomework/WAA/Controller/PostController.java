package com.WAAHomework.WAA.Controller;

import com.WAAHomework.WAA.Entity.Post;
import com.WAAHomework.WAA.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    private PostService postService;
    @Autowired
    public PostController(PostService postService){
        this.postService=postService;
    }
    @GetMapping("/")
    public List<Post> getAllPosts(){
        return postService.getAllPosts();
    }
    @GetMapping("/{id}")
    public Post getPostById(@PathVariable long id){
        return postService.getPostById(id);
    }
    @DeleteMapping("/{id}")
    public String deletePostById(@PathVariable long id){
         postService.deletePostById(id);
         return "deleted successfully";
    }
//    @PostMapping("/{id}")
    @PostMapping("/")
    public ResponseEntity<?> createNewPost(@RequestBody Post post){
        postService.createNewPost(post);
        return ResponseEntity.ok().build();
    }
}
