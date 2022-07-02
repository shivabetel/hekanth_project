package com.persistent.MovieTicket.repository;

import com.persistent.MovieTicket.jpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRespository extends JpaRepository<User, String> {
}
