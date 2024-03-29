package com.google.gwt.sample.userwatcher.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("stockPrices")
public interface StockPriceService extends RemoteService {

  StockPrice[] getPrices(String[] symbols)  throws DelistedException;
}