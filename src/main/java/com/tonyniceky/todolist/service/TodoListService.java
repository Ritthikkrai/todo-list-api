package com.tonyniceky.todolist.service;

import com.tonyniceky.todolist.model.Todo;
import com.tonyniceky.todolist.model.TodoListResponse;
import com.tonyniceky.todolist.repository.MockTodoListRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Service
public class TodoListService {
    public List<Todo> getListOfTodo() {

        return MockTodoListRepository.getTodoList();
    }

    public void addTodo(Todo todo) {
        MockTodoListRepository.addTodoToList(generateId(todo));
    }

    private  Todo generateId(Todo todo) {
        String id = UUID.randomUUID().toString().replace("-", "");
        todo.setId(id);
        return todo;

    }
    public void removeBy(String id) {
        MockTodoListRepository.removeByTask(id);
    }
    public void clearAll(){
        MockTodoListRepository.clearAllTask();
    }
}
