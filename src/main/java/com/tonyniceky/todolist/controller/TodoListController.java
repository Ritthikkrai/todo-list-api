package com.tonyniceky.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class TodoListController {
    @GetMapping("/api/todo-list")
    public String getHello(){
        return "Hello";
    }
}