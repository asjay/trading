package com.asjay.trend.indicator.data;

import com.asjay.model.display.Candle;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.stream.Stream;


public class CandleQueue {

    Deque<Candle> candleList;

    public CandleQueue(List<Candle> candleList) {
        this.candleList = new ArrayDeque<Candle>();
        Stream<Candle> stream = candleList.stream();
        stream.forEachOrdered(candle -> candleList.add(candle));
    }

    private void addLatestCandle(Candle candle){
        this.candleList.add(candle);
    }

    public Candle getLastCandle(){
        return candleList.getLast();
    }

    public Deque<Candle> getLastNCandles(int n){
        return candleList; //TODO
    }
}
