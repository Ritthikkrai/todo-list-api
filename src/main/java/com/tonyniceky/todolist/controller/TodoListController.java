package com.tonyniceky.todolist.controller;

import com.tonyniceky.todolist.model.Todo;
import com.tonyniceky.todolist.model.TodoListResponse;
import com.tonyniceky.todolist.service.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
public class TodoListController {

    @Autowired
    private TodoListService todoListService;

    @GetMapping("/api/todo-list")
    public TodoListResponse getTodoList(){

        TodoListResponse response = new TodoListResponse();
        response.setTodoList(todoListService.getListOfTodo());
        return response;
    }
    @PostMapping(value = "/api/todo-list/create", consumes = "application/json", produces = "application/json")
    public ResponseEntity create(@RequestBody Todo newTask) {
        TodoListService todoListService = new TodoListService();
        todoListService.addTodo(newTask);
        return ResponseEntity.ok().build();
    }
    @GetMapping(value = "/api/todo-list/remove", params = "id")
    public ResponseEntity removeTodo(@RequestParam String id) {
        todoListService.removeBy(id);
        return ResponseEntity.ok().build();
    }
    @GetMapping(value = "/api/todo-list/clear")
    public ResponseEntity clearTodo() {
        todoListService.clearAll();
        return ResponseEntity.ok().build();
    }
}
