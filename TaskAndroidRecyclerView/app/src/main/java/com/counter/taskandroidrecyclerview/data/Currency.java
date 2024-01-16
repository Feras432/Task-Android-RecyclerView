package com.counter.taskandroidrecyclerview.data;

import java.util.ArrayList;

public class Currency {
    public String currencyCode, currencyName;
    public double exchangeRate;

    public Currency(String currencyCode, String currencyName, double exchangeRate) {
        this.currencyCode = currencyCode;
        this.currencyName = currencyName;
        this.exchangeRate = exchangeRate;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }
}
