package com.WAAHomework.WAA.Controller;

import com.WAAHomework.WAA.Entity.Post;
import com.WAAHomework.WAA.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/posts")// class level path
public class PostController {
    private final PostService postService;
    @Autowired
    public PostController(PostService postService){
        this.postService=postService;
    }
    @GetMapping("/")
    public List<Post> getAllPosts(){
        return postService.getAllPosts();
    }
    @GetMapping("/{id}")
    public Optional getPostById(@PathVariable long id){
        return postService.getPostById(id);
    }
    @DeleteMapping("/{id}")
    public String deletePostById(@PathVariable long id){
         postService.deletePostById(id);
         return "deleted successfully";
    }

    @PostMapping("/")
    public void createPost(@RequestBody Post post){
        postService.createNewPost(post);
    }
    @PutMapping("/{id}")
    public void updateById(@PathVariable long id, @RequestBody Post post){
        postService.updateById(id,post);
    }

}
