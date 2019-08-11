package com.example.observer;

import java.util.ArrayList;
import java.util.List;

public class WebSite implements Observable {
    private List<Observer> subscribers = new ArrayList<>();
    private List<Post> posts = new ArrayList<>();

    void addPosts(Post post) {
        posts.add(post);
        notifyObservers();
    }

    @Override
    public void addObservable(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObservable(Observer observer) {
        int index = subscribers.indexOf(observer);
        if (index >= 0) {
            subscribers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        subscribers.forEach(observer -> observer.handleEvent(posts.get(posts.size() - 1)));
    }
}
