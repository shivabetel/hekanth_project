package com.persistent.MovieTicket.jpa.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "TBL_THEATRE")
@Getter
@Setter
public class Theatre {

    @Id
    private Integer id;
    private String name;
    @OneToMany
    List<Movie> movies;
    @OneToMany
    List<Slot> slots;

}
