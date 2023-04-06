package com.WAAHomework.WAA.Service;

import com.WAAHomework.WAA.Entity.Post;
import com.WAAHomework.WAA.Repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class PostService {
    private PostRepo postRepo;
    @Autowired
    public PostService(PostRepo postrepo){
        this.postRepo=postrepo;
    }
    public List<Post> getAllPosts(){
        return postRepo.findAll();
    }
    public Post getPostById(long id){
        return postRepo.findById(id);
    }
    public void deletePostById(long id){
        postRepo.deleteById(id);
    }
    public void createNewPost(Post post){
        postRepo.save(post);
    }
}
