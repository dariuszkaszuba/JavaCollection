package controller;


import model.Message;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.NoSuchElementException;

public class MessageController {

    private Deque<Message> messages = new ArrayDeque<>();


    public void addMessage(String content, String author) {
        Message m = new Message(content, author);
        messages.addFirst(m);
        System.out.println("Dodano waidomosci");
    }
    public void getMessage(){
        try {
            System.out.println(messages.getLast());
        }catch (NoSuchElementException e){
            System.out.println("Brak wiadomosci");
        }

    }
    public  void deleteMessage(){
        try {
            messages.removeLast();
        }catch (NoSuchElementException e){
            System.out.println("Brak wiadomosci");
        }
    }
    public int getSize(){
        return messages.size();
    }
}
