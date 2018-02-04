package com.asjay.trading.model;

public class Period {
    // periods are times in milliseconds since epoch
    private long openTime;
    private long closeTime;
    private long granularityInSeconds;

    public Period(long openTime, long closeTime) {
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.granularityInSeconds = this.closeTime-this.openTime;
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

    public long getGranularityInSeconds() {
        return granularityInSeconds;
    }

    public void setGranularityInSeconds(long granularityInSeconds) {
        this.granularityInSeconds = granularityInSeconds;
    }
}
