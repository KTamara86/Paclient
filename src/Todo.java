/*
* File: Todo.java
* Author: Kukta Tamara
* Copyright: 2024, Kukta Tamara
* Group: SZOFT II/1 E
* Date: 2024-01-12
* Github: https://github.com/KTamara86/Paclient.git
* Licenc: GNU GPL
*/

public class Todo {
    int userId;
    int id;
    String title;
    boolean completed;

    public Todo(int userId, int id, String title, boolean completed) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.completed = completed;
    }
    
}