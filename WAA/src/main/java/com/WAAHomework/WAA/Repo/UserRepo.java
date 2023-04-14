package com.WAAHomework.WAA.Repo;

import com.WAAHomework.WAA.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {

    @Query("SELECT u FROM User u WHERE size(u.posts) > :n")
    List<User> findUsersWithMoreThanNPosts(@Param("n") int n);

    User findByfirstname(String firstname);

    /*retrieve all users that have more than n posts,
    you can create a query method in the UserRepository
     interface that uses the @Query annotation
     to specify a custom JPQL query:
    * */
}
