package com.counter.taskandroidrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.counter.taskandroidrecyclerview.adapter.CurrencyAdapter;
import com.counter.taskandroidrecyclerview.data.Currency;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    RecyclerView currencyRecyclerView;
    ArrayList<Currency> currency = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        currencyRecyclerView = findViewById(R.id.currencyRecyclerView);
        currencyRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        CurrencyAdapter currencyAdapter = new CurrencyAdapter(currency);


        currencyRecyclerView.setAdapter(currencyAdapter);
        addCurrency();


    }
    private void addCurrency(){
        Currency currency1 = new Currency("KWD", "Kuwaiti Dinar", 15);
        currency.add(currency1);
        Currency currency2 = new Currency("USD", "US Dollar", 48.79);
        currency.add(currency2);
        Currency currency3 = new Currency("GBP", "British Pound", 38.58);
        currency.add(currency3);
    }

}