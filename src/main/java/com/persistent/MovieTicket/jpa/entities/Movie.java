package com.persistent.MovieTicket.jpa.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_MOVIE")
@Getter
@Setter
public class Movie {
    @Id
    Integer id;
    String movieName;
}
