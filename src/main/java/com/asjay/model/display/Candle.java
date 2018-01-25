package com.asjay.model.display;
import java.math.BigDecimal;

public class Candle {

    private BigDecimal openPrice;
    private BigDecimal closePrice;
    private BigDecimal averagePrice;
    private Period period;

    public Candle(BigDecimal openPrice, BigDecimal closePrice, Period period) {
        this.openPrice = openPrice;
        this.closePrice = closePrice;
        this.period = period;
        this.averagePrice=getAveragePrice();
    }

    private BigDecimal getAveragePrice() {
        return openPrice.add(closePrice).divide(new BigDecimal(2));
    }

    public BigDecimal getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(BigDecimal openPrice) {
        this.openPrice = openPrice;
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
