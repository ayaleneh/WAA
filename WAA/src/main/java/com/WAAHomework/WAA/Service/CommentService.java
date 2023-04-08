package com.WAAHomework.WAA.Service;

import com.WAAHomework.WAA.Entity.Comment;
import com.WAAHomework.WAA.Repo.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {

    private final CommentRepo commentRepo;
    @Autowired
    public CommentService(CommentRepo commentRepo){
        this.commentRepo=commentRepo;
    }
    public Comment save(Comment comment){
        return commentRepo.save(comment);
    }
    public List<Comment> findAll(){
        return commentRepo.findAll();
    }
    public Optional<Comment> findById(Long id){
        return commentRepo.findById(id);
    }
    public void deleteById(Long id){
        commentRepo.deleteById(id);
    }

}
