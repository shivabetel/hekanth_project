package com.persistent.MovieTicket.controller;


import com.persistent.MovieTicket.dtos.CustomerRequest;
import com.persistent.MovieTicket.exception.ResourceNotFoundException;
import com.persistent.MovieTicket.jpa.entities.User;
import com.persistent.MovieTicket.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserController {

    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestBody CustomerRequest request){
        //TODO validate if password and confirm password are same
        //TODO check if the userId(request.getUserId()) already exists, if exists throw error
        User customer = new User();
        if(request != null){
            customer.setUserId(request.getUserId());
            customer.setFirstName(request.getFirstName());
            customer.setLastName((request.getLastName()));
            customer.setMobileNumber(request.getMobileNumber());
            customer.setPassword(request.getPassword());
        }
       return userService.save(customer);
    }

    @PutMapping("/{userId}")
    public void  updateCustomerById(@RequestBody CustomerRequest request, @PathVariable String userId){
        Optional<User> userOptional = this.userService.getUserById(userId);
        if(userOptional.isPresent()){
          User user =  userOptional.get();
            user.setFirstName(request.getFirstName());
            user.setLastName(request.getLastName());
            user.setMobileNumber(request.getMobileNumber());
          this.userService.save(user);

        }else {
            throw new ResourceNotFoundException("User not found");
        }
    }
}
