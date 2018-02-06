package com.asjay.trading.trend.indicator;

import com.asjay.trading.model.Candle;
import com.asjay.trading.model.Observer;
import com.asjay.trading.model.money.CurrencyType;
import sun.util.resources.cldr.ext.CurrencyNames_ug;

public class ParabolicSAR<BuyType extends CurrencyType, SellType extends CurrencyType>
        implements Observer<Candle<BuyType, SellType>> {
    @Override
    public void onUpdate() {

    }
}
