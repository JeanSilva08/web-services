package com.lostline.webserv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lostline.webserv.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
