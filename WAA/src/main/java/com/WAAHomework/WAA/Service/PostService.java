package com.WAAHomework.WAA.Service;

import com.WAAHomework.WAA.Entity.Comment;
import com.WAAHomework.WAA.Entity.Post;

import com.WAAHomework.WAA.Repo.PostRepo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PostService {
    private final PostRepo postRepo;
    private final  CommentService commentService;
    @Autowired
    public PostService(PostRepo postrepo, CommentService commentService){
        this.postRepo=postrepo;
        this.commentService=commentService;
    }
    public List<Post> getAllPosts(){
        return  postRepo.findAll();
    }
    public Optional<Post> getPostById(long id){
        return postRepo.findById(id);
    }
    public void deletePostById(long id){
        postRepo.deleteById(id);
    }
    public  void updateById(long id,Post post){
        for (Post postU:postRepo.findAll()){
        if (postU.getId()==id)
            postRepo.save(post);
        }
    }
    public void addCommentToPost(Long postId, Comment comment){
        Optional<Post> optionalPost= postRepo.findById(postId);
        if (optionalPost.isPresent()){
            Post post= optionalPost.get();
            post.addComment(comment);
            postRepo.save(post);
        }
        else{
            throw new EntityNotFoundException("Post with id "+postId+" not found");
        }
    }
    public void createNewPost(Post post){
        postRepo.save(post);
    }
    public List<Post> getPostsByAuthor(String author){
        return postRepo.findByAuthor(author);
    }
    public int getNumberOfCommentsByPostId(long postId){
        Optional<Post> postOptional =postRepo.findById(postId);
        if (!postOptional.isPresent()){
           throw new IllegalArgumentException("Post not found");
        }
        Post post=postOptional.get();
        return post.getCommentList().size();
    }
}
