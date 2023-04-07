package com.WAAHomework.WAA.Service;

import com.WAAHomework.WAA.Entity.Post;

import com.WAAHomework.WAA.Repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
@Service
public class PostService {
    private final PostRepo postRepo;
    @Autowired
    public PostService(PostRepo postrepo){
        this.postRepo=postrepo;
    }
    public List getAllPosts(){
        return (List) postRepo.findAll();
    }
    public Optional getPostById(long id){
        return postRepo.findById(id);
    }
    public void deletePostById(long id){
        postRepo.deleteById(id);
    }
    public  void updateById(long id, Post post){

     //postRepo.updateById(id,post);
    }

    public void createNewPost(Post post){
        postRepo.save(post);
    }
}
