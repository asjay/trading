package com.asjay.trend.indicator;

import com.asjay.model.display.Candle;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.stream.Stream;


public class IndicatorData {

    Deque<Candle> candleList;

    public IndicatorData(List<Candle> candleList) {
        this.candleList = new ArrayDeque<Candle>();
        Stream<Candle> stream = candleList.stream();
        stream.forEachOrdered(candle -> candleList.add(candle));
    }

    private void addLatestCandle(Candle candle){
        this.candleList.add(candle);
    }

    private Deque<Candle> getLastNCandles(int n){
        return candleList; //TODO
    }
}
