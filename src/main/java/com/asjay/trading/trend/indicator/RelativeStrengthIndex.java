package com.asjay.trading.trend.indicator;

import com.asjay.trading.model.Candle;
import com.asjay.trading.trend.data.CandleQueue;

import java.math.BigDecimal;
import java.util.Deque;

public class RelativeStrengthIndex
{
    private static int period; //this will be set by default to 14 periods.
    private int minCalculationPeriod = 250;
    private int maxCalculationPeriod = 500;
    private double index;
    private BigDecimal averageGain;
    private BigDecimal averageLoss;
    private CandleQueue candleQueue; // atleast last 250 period candles needed of data before calculating RSI, this is done to be accurate on the RSI value;

    public RelativeStrengthIndex(BigDecimal averageGain, BigDecimal averageLoss, int period) {
        this.period = period;
        this.averageGain = averageGain;
        this.averageLoss = averageLoss;
        this.index = calculateIndex();
    }

    public double getIndex() {
        return index;
    }

    public BigDecimal getAverageGain() {
        return averageGain;
    }

    public void setAverageGain(BigDecimal averageGain) {
        this.averageGain = averageGain;
    }

    public BigDecimal getAverageLoss() {
        return averageLoss;
    }

    public void setAverageLoss(BigDecimal averageLoss) {
        this.averageLoss = averageLoss;
    }

    public double calculateIndex(){


        //how to calculate

        //first average gain = sum of average gains of last 14 periods/14
        //first average loss = summ of average losses for last 14 periods/14

        //subsequent caluculations --

        // average gain = (pervious average gain * 13 + current gain)/14
        // average loss = (previous average loss * 13 + current loss)/14

        Deque<Candle> candles = candleQueue.getLastNCandles(500);

        double rs;
        rs = averageGain.doubleValue()/averageLoss.doubleValue();
        this.index = 0L; // this is initial value. This will be calculated using the formula.
        index = (100 - (100/ 1 + rs));
        return index;
    }
}
