package com.WAAHomework.WAA.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "post")
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private String author;

    @ManyToOne(fetch = FetchType.LAZY)

    private User user;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable
    private List<Comment> commentList= new ArrayList<>();

    public void addComment(Comment comment){
        commentList.add(comment);
        comment.setPost(this);
    }
}
