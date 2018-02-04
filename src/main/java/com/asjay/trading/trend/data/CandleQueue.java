package com.asjay.trading.trend.data;

import com.asjay.trading.model.Candle;
import com.asjay.trading.model.money.MonetaryUnit;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.stream.Stream;

public class CandleQueue<B extends MonetaryUnit,S extends MonetaryUnit> {

    Deque<Candle<B,S>> candleList;

    public CandleQueue(List<Candle<B,S>> candleList) {
        this.candleList = new ArrayDeque<Candle<B,S>>();
        Stream<Candle<B,S>> stream = candleList.stream();
        stream.forEachOrdered(candle -> candleList.add(candle));
    }

    private void addLatestCandle(Candle candle){
        this.candleList.add(candle);
    }

    public Candle getLastCandle(){
        return candleList.getLast();
    }

    public Deque<Candle<B,S>> getLastNCandles(int n){
        return candleList; //TODO
    }

}
