package com.asjay.trading.model.display;

import com.asjay.trading.model.money.MonetaryUnit;

public class Volume  {
    private MonetaryUnit units;

    public Volume(MonetaryUnit units) {
        this.units = units;
    }

    public MonetaryUnit getUnits() {
        return units;
    }

    public void setUnits(MonetaryUnit units) {
        this.units = units;
    }
}
