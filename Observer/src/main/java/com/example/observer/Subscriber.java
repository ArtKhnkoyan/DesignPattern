package com.example.observer;

import lombok.Data;

@Data
public class Subscriber implements Observer {
    private String name;

    Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(Post post) {
        System.out.println("Dear " + name + " we add a new " + post);
    }
}
