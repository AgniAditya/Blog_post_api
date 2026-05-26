package com.aditya.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aditya.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer> {

}
