package com.lostline.webserv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lostline.webserv.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
