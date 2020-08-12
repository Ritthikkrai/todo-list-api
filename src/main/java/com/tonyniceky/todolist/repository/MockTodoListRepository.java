package com.tonyniceky.todolist.repository;
import com.tonyniceky.todolist.model.Todo;
import java.util.List;

public class MockTodoListRepository {

    private static List<Todo> todoList;

    public static List<Todo> getTodoList() {
        return todoList;
    }
    public static void setTodoList(List<Todo> todoList) {
        MockTodoListRepository.todoList = todoList;
    }
}
