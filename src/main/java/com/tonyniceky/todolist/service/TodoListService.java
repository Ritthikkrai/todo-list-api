package com.tonyniceky.todolist.service;

import com.tonyniceky.todolist.model.Todo;
import com.tonyniceky.todolist.model.TodoListResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class TodoListService {
    public List<Todo> getTodo() {
        Todo todo = new Todo();
        todo.setTask("Hello");
        Todo todo1 = new Todo();
        todo1.setTask("world");

        // List<type>
        List<Todo> todos = new ArrayList<>();
        todos.add(todo);
        todos.add(todo1);
        return todos;


    }
}
