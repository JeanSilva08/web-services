package com.lostline.webserv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lostline.webserv.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
