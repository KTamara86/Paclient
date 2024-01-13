/*
* File: Paclient.java
* Author: Kukta Tamara
* Copyright: 2024, Kukta Tamara
* Group: SZOFT II/1 E
* Date: 2024-01-12
* Github: 
* Licenc: GNU GPL
*/

import java.util.ArrayList;

import hu.szit.Convert;

public class Paclient {
    public Paclient() {
        TodoService todoService = new TodoService();
        String todos = todoService.getTodos();
    
        ArrayList<Todo> todoList = Convert.toListObject(todos, Todo.class);
        for(Todo todo: todoList) {
            System.out.println(todo.title);
        }
    }    
}
