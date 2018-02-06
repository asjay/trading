package com.asjay.trading.model;
import com.asjay.trading.model.money.CurrencyType;

public class Candle<BuyType extends CurrencyType,SellType extends CurrencyType> implements Observable {

    private SellType openPrice;
    private SellType closePrice;
    private SellType highestPrice;
    private SellType lowestPrice;
    private SellType averagePrice;
    private Period period;
    private Volume<BuyType> volume;

    public Candle(SellType openPrice, SellType closePrice, SellType highestPrice, SellType lowestPrice, Period period, Volume<BuyType> volume) {
        this.openPrice = openPrice;
        this.closePrice = closePrice;
        this.highestPrice = highestPrice;
        this.lowestPrice = lowestPrice;
        this.period = period;
        this.volume = volume;
        this.averagePrice = getAveragePrice();
    }

    private CurrencyType calculateAveragePrice() {
        return null; //TODO: return the appropriate average price after averaging the open anc close price based on the Monetary Unit.
    }

    public SellType getAveragePrice() {
        return averagePrice;
    }

    public SellType getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(SellType openPrice) {
        this.openPrice = openPrice;
    }

    public SellType getClosePrice() {
        return closePrice;
    }

    public void setClosePrice(SellType closePrice) {
        this.closePrice = closePrice;
    }

    public SellType getHighestPrice() {
        return highestPrice;
    }

    public void setHighestPrice(SellType highestPrice) {
        this.highestPrice = highestPrice;
    }

    public SellType getLowestPrice() {
        return lowestPrice;
    }

    public void setLowestPrice(SellType lowestPrice) {
        this.lowestPrice = lowestPrice;
    }

    public void setAveragePrice(SellType averagePrice) {
        this.averagePrice = averagePrice;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    public void setVolume(Volume<BuyType> volume) {
        this.volume = volume;
    }

    public Volume<BuyType> getVolume() {
        return volume;
    }

    @Override
    public boolean addObserver(Observer observer) {
        return false;
    }

    @Override
    public boolean removeObserver(Observer observer) {
        return false;
    }

    @Override
    public boolean notifyObservers() {
        return false;
    }
}
