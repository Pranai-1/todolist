package com.pranai.example.practiceweb1.todolist;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface TodoRepository extends JpaRepository<Todo, Integer> {
 public List<Todo> findByUsername(String username);
}
