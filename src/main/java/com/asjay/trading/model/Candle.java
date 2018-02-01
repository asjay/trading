package com.asjay.trading.model;
import com.asjay.trading.model.money.MonetaryUnit;

public class Candle<B,S> {

    private MonetaryUnit<S> openPrice;
    private MonetaryUnit<S> closePrice;
    private MonetaryUnit<S> highestPrice;
    private MonetaryUnit<S> lowestPrice;
    private MonetaryUnit<S> averagePrice;
    private Period period;
    private Volume<B> volume;

    public Candle(MonetaryUnit openPrice, MonetaryUnit closePrice, MonetaryUnit highestPrice, MonetaryUnit lowestPrice, Period period, Volume volume) {
        this.openPrice = openPrice;
        this.closePrice = closePrice;
        this.highestPrice = highestPrice;
        this.lowestPrice = lowestPrice;
        this.period = period;
        this.volume = volume;
        this.averagePrice = getAveragePrice();
    }

    private MonetaryUnit calculateAveragePrice() {
        return null; //TODO: return the appropriate average price after averaging the open anc close price based on the Monetary Unit.
    }

    public MonetaryUnit getAveragePrice() {
        return averagePrice;
    }

    public MonetaryUnit<S> getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(MonetaryUnit<S> openPrice) {
        this.openPrice = openPrice;
    }

    public MonetaryUnit<S> getClosePrice() {
        return closePrice;
    }

    public void setClosePrice(MonetaryUnit<S> closePrice) {
        this.closePrice = closePrice;
    }

    public MonetaryUnit<S> getHighestPrice() {
        return highestPrice;
    }

    public void setHighestPrice(MonetaryUnit<S> highestPrice) {
        this.highestPrice = highestPrice;
    }

    public MonetaryUnit<S> getLowestPrice() {
        return lowestPrice;
    }

    public void setLowestPrice(MonetaryUnit<S> lowestPrice) {
        this.lowestPrice = lowestPrice;
    }

    public void setAveragePrice(MonetaryUnit<S> averagePrice) {
        this.averagePrice = averagePrice;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    public void setVolume(Volume<B> volume) {
        this.volume = volume;
    }

    public Volume<B> getVolume() {
        return volume;
    }
}
