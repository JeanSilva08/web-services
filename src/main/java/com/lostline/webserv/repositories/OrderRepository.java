package com.lostline.webserv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lostline.webserv.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
