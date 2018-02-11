package com.asjay.trading.data;

import org.apache.http.HttpHeaders;

public class HttpClientImpl {

    private static HttpClientImpl instance = null;

    public HttpClientImpl getClientInstance(){
        if(instance==null){
            instance = new HttpClientImpl();
        }
        return instance;
    }

    private HttpClientImpl(){

    }
//this is a commit
    public T getRequest (String uri, String scheme, String requestType, HttpHeaders[] headers, String... parameters){

    }
}
