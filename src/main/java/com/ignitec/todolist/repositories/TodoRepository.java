package com.ignitec.todolist.repositories;

import com.ignitec.todolist.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
