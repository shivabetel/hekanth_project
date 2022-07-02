package com.persistent.MovieTicket.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerRequest {

    String userId;
    String firstName;
    String lastName;
    String mobileNumber;
    String password;
    String confirmPassword;
}
