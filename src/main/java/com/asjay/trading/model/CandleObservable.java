package com.asjay.trading.model;

public interface CandleObservable {
    boolean addObserver(CandleObserver observer);
    boolean removeObserver(CandleObserver observer);
    boolean notifyObservers();
}
