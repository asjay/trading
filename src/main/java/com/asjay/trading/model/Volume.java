package com.asjay.trading.model;

import com.asjay.trading.model.money.MonetaryUnit;

public class Volume<B>  {
    private MonetaryUnit<B> units;

    public Volume(MonetaryUnit<B> units) {
        this.units = units;
    }

    public MonetaryUnit<B> getUnits() {
        return units;
    }

    public void setUnits(MonetaryUnit<B> units) {
        this.units = units;
    }
}
