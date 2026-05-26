package com.aditya.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aditya.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
