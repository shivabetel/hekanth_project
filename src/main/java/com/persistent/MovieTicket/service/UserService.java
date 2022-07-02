package com.persistent.MovieTicket.service;

import com.persistent.MovieTicket.jpa.entities.User;
import com.persistent.MovieTicket.repository.UserRespository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    UserRespository userRespository;

    public UserService(UserRespository userRespository) {
        this.userRespository = userRespository;
    }

    public User save(User user){
        return  this.userRespository.save(user);
    }

    public Optional<User> getUserById(String userId){
        return this.userRespository.findById(userId);
    }
}
