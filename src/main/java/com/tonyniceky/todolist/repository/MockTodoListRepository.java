package com.tonyniceky.todolist.repository;
import com.tonyniceky.todolist.model.Todo;

import java.util.ArrayList;
import java.util.List;

public class MockTodoListRepository {

    private static List<Todo> todoList;

    public static List<Todo> getTodoList() {
        if (todoList == null || todoList.isEmpty()){
           todoList = new ArrayList<>();
        }
        return todoList;
    }
    public static void addTodoToList(Todo todo) {
        if (todoList == null || todoList.isEmpty()) {
            todoList = new ArrayList<>();
        }
        todoList.add(todo);
    }
}
