package com.asjay.trend.indicator;

import com.asjay.trend.indicator.data.CandleQueue;

import java.util.List;

public class ExponentialMovingAverage {
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
        double smoothingFactor = 2/(1+periods);
        this.ema = (candleList.getLastCandle().getClosePrice().doubleValue()*smoothingFactor)+(previousEMA*(1-smoothingFactor));
        return ema;
    }
}
