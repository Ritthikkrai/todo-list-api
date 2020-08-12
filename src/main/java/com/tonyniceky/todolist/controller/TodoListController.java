package com.tonyniceky.todolist.controller;

import com.tonyniceky.todolist.model.TodoListResponse;
import com.tonyniceky.todolist.service.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class TodoListController {
    @Autowired
    private TodoListService todoListService;


    @GetMapping("/api/todo-list/all")
    public TodoListResponse getTodoList(){
        TodoListResponse response = new TodoListResponse();
        response.setTodoList(todoListService.getTodo());
        return response;
    }
}
