package com.asjay.trading.model;

public class Volume<B>  {
    private B units;

    public Volume(B units) {
        this.units = units;
    }

    public B getUnits() {
        return units;
    }

    public void setUnits(B units) {
        this.units = units;
    }
}
