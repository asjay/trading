package com.asjay.trend.indicator;

import com.asjay.model.display.Candle;
import com.asjay.model.display.Period;

import java.math.BigDecimal;
import java.util.List;

public class SimpleMovingAverage {


    private List<Candle> candleList;

    public SimpleMovingAverage(int noOfPeriods, List<Candle> candleList) {
        this.candleList = candleList;
    }

    public List<Candle> getCandleList() {
        return candleList;
    }

    public void setPeriodList(List<Candle> candleList) {
        this.candleList = candleList;
    }

    public double calculate(){
        int periods = candleList.size();
        BigDecimal movingPrice = new BigDecimal(0);
        for(Candle candle: candleList){
            movingPrice.add(candle.getClosePrice());
        }

        double sma = movingPrice.doubleValue()/periods;
        return sma;
    }
}
