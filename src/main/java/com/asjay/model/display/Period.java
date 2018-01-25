package com.asjay.model.display;

public class Period {

    private long openTime;
    private long closeTime;

    public Period(long openTime, long closeTime) {
        this.openTime = openTime;
        this.closeTime = closeTime;
    }

    public long getOpenTime() {
        return openTime;
    }

    public void setOpenTime(long openTime) {
        this.openTime = openTime;
    }

    public long getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(long closeTime) {
        this.closeTime = closeTime;
    }
}
