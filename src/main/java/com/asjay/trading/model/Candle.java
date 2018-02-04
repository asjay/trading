package com.asjay.trading.model;
import com.asjay.trading.model.money.MonetaryUnit;

public class Candle<B extends MonetaryUnit,S extends  MonetaryUnit> {

    private S openPrice;
    private S closePrice;
    private S highestPrice;
    private S lowestPrice;
    private S averagePrice;
    private Period period;
    private Volume<B> volume;

    public Candle(S openPrice, S closePrice, S highestPrice, S lowestPrice, Period period, Volume<B> volume) {
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

    public S getAveragePrice() {
        return averagePrice;
    }

    public S getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(S openPrice) {
        this.openPrice = openPrice;
    }

    public S getClosePrice() {
        return closePrice;
    }

    public void setClosePrice(S closePrice) {
        this.closePrice = closePrice;
    }

    public S getHighestPrice() {
        return highestPrice;
    }

    public void setHighestPrice(S highestPrice) {
        this.highestPrice = highestPrice;
    }

    public S getLowestPrice() {
        return lowestPrice;
    }

    public void setLowestPrice(S lowestPrice) {
        this.lowestPrice = lowestPrice;
    }

    public void setAveragePrice(S averagePrice) {
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
