package com.lostline.webserv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.lostline.webserv.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
