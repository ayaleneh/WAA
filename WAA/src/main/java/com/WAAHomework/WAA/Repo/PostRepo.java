package com.WAAHomework.WAA.Repo;
import com.WAAHomework.WAA.Entity.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class PostRepo {
    private List<Post> posts= new ArrayList<>();
    public PostRepo(){
        posts.add(new Post(1,"Post 1","Content of first post","Author of first post"));
        posts.add(new Post(2,"Post 2","Content of second post","Author of second post"));
        posts.add(new Post(3,"Post 3","Content of third post","Author of third post"));
    }
    public List<Post> findAll(){
        return posts;
    }
    public Post findById(long id){
        for (Post post:posts){
            if (post.getId()==id){
                return post;
            }
        }
        return null;
    }
    public void deleteById(long id){
        posts.removeIf(post -> post.getId()==id);
    }
    public void updateById(long id, Post updatedPost){

        for (Post post:posts){
            if (post.getId()== id){
                post=updatedPost;
            }
        }
    }
    public void save(Post post){
        posts.add(post);
    }
}
