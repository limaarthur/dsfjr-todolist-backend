package com.ignitec.todolist.services;

import com.ignitec.todolist.entities.Todo;
import com.ignitec.todolist.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> createTodo(Todo todo) {
        todoRepository.save(todo);
        return listTodo();
    }

    public List<Todo> listTodo() {
        todoRepository.findAll();
        return listTodo();
    }

    public List<Todo> updateTodo(Todo todo) {
        todoRepository.save(todo);
        return listTodo();
    }

    public List<Todo> deleteTodo(Long id) {
        todoRepository.deleteById(id);
        return listTodo();
    }
}
