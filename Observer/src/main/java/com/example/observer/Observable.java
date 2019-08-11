package com.example.observer;

public interface Observable {

    void addObservable(Observer observable);

    void removeObservable(Observer observable);

    void notifyObservers();
}
