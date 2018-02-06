package com.asjay.trading.model;

public interface Observable<T> {
    boolean addObserver(Observer<T> observer);
    boolean removeObserver(Observer<T> observer);
    boolean notifyObservers();
}
