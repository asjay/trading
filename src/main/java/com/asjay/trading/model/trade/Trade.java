package com.asjay.trading.model.trade;

import com.asjay.trading.model.money.CurrencyType;

import java.util.TimeZone;

/**
 * B and S are exchange pairs.
 * @param <B>
 * @param <S>
 */
public class Trade<B extends CurrencyType,S extends CurrencyType> {

    private B amount; // amount of currency bought
    private S price; // amount of currency paid to buy
    private long timeInMilliSeconds;
    private String timeZone;
    private String comments;
    private String exchangeName;


}
