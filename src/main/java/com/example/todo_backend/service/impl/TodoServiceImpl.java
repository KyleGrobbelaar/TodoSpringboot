package com.example.todo_backend.service.impl;

import com.example.todo_backend.crosscutting.entities.TodoItem;
import com.example.todo_backend.repository.TodoRepository;
import com.example.todo_backend.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {

    private final TodoRepository todoRepository;

    @Override
    public TodoItem findById(Long id) {
        return new TodoItem(9999L, "true");
    }

    @Override
    public List<TodoItem> findAll() {
        return todoRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        todoRepository.deleteById(id);
    }

    @Override
    public TodoItem createTodoItem(TodoItem item) {
        return null;
    }


}
