package com.asjay.trend.indicator;

import com.asjay.model.display.Candle;

import java.util.List;

public class ExponentialMovingAverage {
    private List<IndicatorData> candleList;

    public ExponentialMovingAverage(List<IndicatorData> candleList) {
        this.candleList = candleList;
    }

    public List<IndicatorData> getCandleList() {
        return candleList;
    }

    public void setCandleList(List<IndicatorData> candleList) {
        this.candleList = candleList;
    }

    public void calculate(){

    }
}
