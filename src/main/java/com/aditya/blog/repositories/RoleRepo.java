package com.aditya.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aditya.blog.entities.Role;

public interface RoleRepo extends JpaRepository<Role, Integer> {

}
