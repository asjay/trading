package com.asjay.trading.trend.indicator;

import com.asjay.trading.model.CandleObserver;
import com.asjay.trading.trend.data.CandleQueue;

public class ExponentialMovingAverage implements CandleObserver{
    private CandleQueue candleList;
    private int periods;
    private double previousEMA;
    private double ema;


    public ExponentialMovingAverage(CandleQueue candleList, double previousEMA) {
        this.candleList = candleList;
        this.previousEMA=previousEMA;
    }

    public CandleQueue getCandleList() {
        return candleList;
    }

    public void setCandleList(CandleQueue candleList) {
        this.candleList = candleList;
    }

    public double calculate(){
        return 0L;
    }

    @Override
    public void update() {

    }
}
