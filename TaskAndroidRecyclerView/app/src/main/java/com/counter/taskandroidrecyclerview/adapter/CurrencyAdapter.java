package com.counter.taskandroidrecyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.counter.taskandroidrecyclerview.R;

import com.counter.taskandroidrecyclerview.data.Currency;
import java.util.ArrayList;

public class CurrencyAdapter extends RecyclerView.Adapter<CurrencyAdapter.CurrencyViewHolder> {

    ArrayList<Currency> currencyList;
    public CurrencyAdapter (ArrayList<Currency> currencyList){
    this.currencyList = currencyList;
    }
    @NonNull
    @Override
    public CurrencyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.currency_item, parent,false);
        return new CurrencyViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull CurrencyAdapter.CurrencyViewHolder holder, int position) {
        Currency currency1 = currencyList.get(position);
        holder.currencyNameTextView.setText(currency1.getCurrencyName());
        holder.currencyCodeTextView.setText(currency1.getCurrencyCode());
        holder.exchangeRateTextView.setText(String.valueOf(currency1.getExchangeRate()));

    }
    @Override
    public int getItemCount() {
        return currencyList.size();
    }
    public static class CurrencyViewHolder extends RecyclerView.ViewHolder{
        TextView currencyNameTextView;
        TextView exchangeRateTextView, currencyCodeTextView;




        public CurrencyViewHolder(@NonNull View itemView) {
            super(itemView);
            currencyNameTextView = itemView.findViewById(R.id.currencyName);
            exchangeRateTextView = itemView.findViewById(R.id.exchangeRate);
            currencyCodeTextView = itemView.findViewById(R.id.currencyCode);

        }
    }

}
