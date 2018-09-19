package com.example.android.bookmanager;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

import java.text.NumberFormat;

public class SummaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary_activity);

        // create new SimpleBookManager object which has 5 books as default.
        SimpleBookManager sbm = new SimpleBookManager();


        // pass data to the views
        TextView textView = findViewById(R.id.countValue);
        textView.setText(String.valueOf(sbm.count()));

        textView = findViewById(R.id.costValue);
        textView.setText(NumberFormat.getCurrencyInstance().format(sbm.getTotalCost()));

        textView = findViewById(R.id.mostExpensiveValue);
        textView.setText(NumberFormat.getCurrencyInstance().format(sbm.getMaxPrice()));

        textView = findViewById(R.id.leastExpensiveValue);
        textView.setText(NumberFormat.getCurrencyInstance().format(sbm.getMinPrice()));

        textView = findViewById(R.id.avgPriceValue);
        textView.setText(NumberFormat.getCurrencyInstance().format(sbm.getMeanPrice()));
    }
}
