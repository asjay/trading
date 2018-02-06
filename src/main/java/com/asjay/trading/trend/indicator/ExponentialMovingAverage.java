package com.asjay.trading.trend.indicator;

import com.asjay.trading.model.Candle;
import com.asjay.trading.model.Observer;
import com.asjay.trading.model.money.CurrencyType;
import com.asjay.trading.trend.data.CandleQueue;

public class ExponentialMovingAverage<BuyType extends CurrencyType, SellType extends CurrencyType>
        implements Observer<Candle<BuyType, SellType>> {
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
    public void onUpdate() {

    }
}
