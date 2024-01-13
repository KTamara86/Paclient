/*
* File: TodoService.java
* Author: Kukta Tamara
* Copyright: 2024, Kukta Tamara
* Group: SZOFT II/1 E
* Date: 2024-01-12
* Github: 
* Licenc: GNU GPL
*/

import hu.szit.Client;

public class TodoService {
    String url;
    Client client;

    public TodoService() {
        url = "https://jsonplaceholder.typicode.com/todos";
        client = new Client();
    }
    
    public String getTodos() {
        return client.get(url);
    }
}
