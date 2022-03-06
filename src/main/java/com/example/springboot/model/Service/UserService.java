package com.example.springboot.model.Service;

import com.example.springboot.model.Entity.UserData;
import com.example.springboot.model.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Autowired
    private UserRepository repository;

    public UserData saveDetails(UserData userdata){
        return repository.save(userdata);
        repository.

    }

}
