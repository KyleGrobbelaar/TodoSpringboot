package com.example.todo_backend.repository;

import com.example.todo_backend.crosscutting.entities.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<TodoItem, Long> {

    TodoItem findTodoItemById(Long id);

    //todo find all items by completion status

}
