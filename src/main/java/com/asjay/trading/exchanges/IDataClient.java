package com.asjay.trading.exchanges;

public interface IDataClient {

     void openChannel();

     void closeChannel();

     void readData();

     void persist();

     void normalizeData();
}
