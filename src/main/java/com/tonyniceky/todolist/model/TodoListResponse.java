package com.tonyniceky.todolist.model;


import java.util.List;

public class TodoListResponse {
    private List<Todo> todoListResponse;

    public List<Todo> getTodoListResponse() {
        return todoListResponse;
    }

    public void setTodoListResponse(List<Todo> todoListResponse) {
        this.todoListResponse = todoListResponse;
    }
}
