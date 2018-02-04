package com.asjay.trading.trend.indicator;

import com.asjay.trading.model.Candle;
import com.asjay.trading.model.CandleObserver;

import java.math.BigDecimal;
import java.util.List;

public class SimpleMovingAverage implements CandleObserver{


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
        }
        double sma = movingPrice.doubleValue()/periods;
        return sma;
    }

    @Override
    public void update() {

    }
}
