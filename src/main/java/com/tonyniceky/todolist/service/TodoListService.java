package com.tonyniceky.todolist.service;

import com.tonyniceky.todolist.model.Todo;
import com.tonyniceky.todolist.model.TodoListResponse;
import com.tonyniceky.todolist.repository.MockTodoListRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class TodoListService {
    public List<Todo> getTodo() {

        return MockTodoListRepository.getTodoList();


    }
}
