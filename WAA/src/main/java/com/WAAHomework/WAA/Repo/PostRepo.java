package com.WAAHomework.WAA.Repo;

import com.WAAHomework.WAA.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepo extends JpaRepository<Post,Long> {//automatically generate implementations for basic CRUD operations
    List<Post> findByAuthor(String author);// custom method which return
    // a list of posts based on the author field. the spring data JPA will automatically generate the sql
    //query for this method based on the method name and return type.

    List<Post> findByTitleContainingIgnoreCase(String title);
    /* find all posts that match a given title,
     you can create a query method in the PostRepository
      interface that uses the findByTitleContainingIgnoreCase
       method provided by Spring Data JPA
       This method searches for all posts whose
       title contains the given string, ignoring case.
    * */
}
