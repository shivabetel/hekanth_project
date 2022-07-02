package com.persistent.MovieTicket.jpa.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "TBL_USER")
@Getter
@Setter
public class User {
    @Column(name = "USER_ID")
    @Id
    String userId;
    @Column(name = "FIRST_NAME")
    String firstName;
    @Column(name = "LAST_NAME")
    String lastName;

    @Column(name = "MOBILE_NUMBER", unique = true)
    String mobileNumber;

    String password;
}
