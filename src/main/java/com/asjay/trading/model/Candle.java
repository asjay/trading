package com.asjay.trading.model;
import com.asjay.trading.model.money.MonetaryUnit;

public class Candle {

    private MonetaryUnit openPrice;
    private MonetaryUnit closePrice;
    private MonetaryUnit highestPrice;
    private MonetaryUnit lowestPrice;
    private MonetaryUnit averagePrice;
    private Period period;
    private Volume volume;

    public Candle(MonetaryUnit openPrice, MonetaryUnit closePrice, MonetaryUnit highestPrice, MonetaryUnit lowestPrice, Period period, Volume volume) {
        this.openPrice = openPrice;
        this.closePrice = closePrice;
        this.highestPrice = highestPrice;
        this.lowestPrice = lowestPrice;
        this.period = period;
        this.volume = volume;
        this.averagePrice = getAveragePrice();
    }

    public Volume getVolume() {
        return volume;
    }

    public void setVolume(Volume volume) {
        this.volume = volume;
    }

    private MonetaryUnit calculateAveragePrice() {
        return null; //TODO: return the appropriate average price after averaging the open anc close price based on the Monetary Unit.
    }

    public MonetaryUnit getAveragePrice() {
        return averagePrice;
    }

    public MonetaryUnit getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(MonetaryUnit openPrice) {
        this.openPrice = openPrice;
    }

    public MonetaryUnit getHighestPrice() {
        return highestPrice;
    }

    public void setHighestPrice(MonetaryUnit highestPrice) {
        this.highestPrice = highestPrice;
    }

    public MonetaryUnit getLowestPrice() {
        return lowestPrice;
    }

    public void setLowestPrice(MonetaryUnit lowestPrice) {
        this.lowestPrice = lowestPrice;
    }

    public MonetaryUnit getClosePrice() {
        return closePrice;
    }

    public void setClosePrice(MonetaryUnit closePrice) {
        this.closePrice = closePrice;
    }

    public void setAveragePrice(MonetaryUnit averagePrice) {
        this.averagePrice = averagePrice;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }
}
