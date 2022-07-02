package com.persistent.MovieTicket.jpa.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "TBL_SLOT")
@Getter
@Setter
public class Slot {

    @Id
   private Integer id;
    private Date showDate;
    private String showTime;

}
