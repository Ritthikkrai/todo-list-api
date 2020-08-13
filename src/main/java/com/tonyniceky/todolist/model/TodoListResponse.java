package com.tonyniceky.todolist.model;

import java.util.List;

public class TodoListResponse {
    private List<Todo> todoList;

    public List<Todo> getTodoList() {
        return todoList;
    }

    public void setTodoList(List<Todo> todoList) {
        this.todoList = todoList;
    }
}
