package com.WAAHomework.WAA.Repo.RepoFakeDataBase;

import com.WAAHomework.WAA.Entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class UserRepoFD {
    private List<User> users= new ArrayList<>();

    public List<User> findAll(){
        return  users;
    }
    public User findById(long id){
        return users.stream().filter(user -> user.getId()==id).findFirst().orElse(null);
    }
    public void save(User user){
        users.add(user);
    }
}
