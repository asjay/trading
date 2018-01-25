package com.asjay.model.display;
import java.math.BigDecimal;

public class Candle {

    private BigDecimal openPrice;
    private BigDecimal closePrice;
    private BigDecimal highestPrice;
    private BigDecimal lowestPrice;
    private BigDecimal averagePrice;
    private Period period;

    public Candle(BigDecimal openPrice, BigDecimal closePrice, BigDecimal highestPrice, BigDecimal lowestPrice, Period period) {
        this.openPrice = openPrice;
        this.closePrice = closePrice;
        this.highestPrice = highestPrice;
        this.lowestPrice = lowestPrice;
        this.period = period;
        this.averagePrice = getAveragePrice();
    }

    private BigDecimal calculateAveragePrice() {
        return openPrice.add(closePrice).divide(new BigDecimal(2));
    }

    public BigDecimal getAveragePrice() {
        return averagePrice;
    }

    public BigDecimal getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(BigDecimal openPrice) {
        this.openPrice = openPrice;
    }

    public BigDecimal getHighestPrice() {
        return highestPrice;
    }

    public void setHighestPrice(BigDecimal highestPrice) {
        this.highestPrice = highestPrice;
    }

    public BigDecimal getLowestPrice() {
        return lowestPrice;
    }

    public void setLowestPrice(BigDecimal lowestPrice) {
        this.lowestPrice = lowestPrice;
    }

    public BigDecimal getClosePrice() {
        return closePrice;
    }

    public void setClosePrice(BigDecimal closePrice) {
        this.closePrice = closePrice;
    }

    public void setAveragePrice(BigDecimal averagePrice) {
        this.averagePrice = averagePrice;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }
}
