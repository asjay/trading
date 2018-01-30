package com.asjay.trading.trading.exchanges;

public interface IDataClient {

     void openChannel();

     void closeChannel();

     void readData();

     void persist();

     void normalizeData();
}
