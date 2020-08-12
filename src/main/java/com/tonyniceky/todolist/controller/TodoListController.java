package com.tonyniceky.todolist.controller;

import com.tonyniceky.todolist.model.Todo;
import com.tonyniceky.todolist.model.TodoListResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController()
public class TodoListController {

    @GetMapping("/api/todo-list")
    public TodoListResponse getTodoList(){
        Todo todo = new Todo();
        todo.setTask("Hello");
        Todo todo1 = new Todo();
        todo1.setTask("world");

        // List<type>
        List<Todo> todos = new ArrayList<>();
        todos.add(todo);
        todos.add(todo1);

        TodoListResponse responseBody = new TodoListResponse();
        responseBody.setTodoListResponse(todos);
        return responseBody;
    }
}
