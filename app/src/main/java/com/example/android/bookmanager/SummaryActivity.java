package com.example.android.bookmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SummaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary_activity);

        // create new SimpleBookManager object which has 5 books as default.
        SimpleBookManager sbm = new SimpleBookManager();

        TextView textView = findViewById(R.id.countValue);
        textView.setText( sbm.count() + " books in your library");

        textView = findViewById(R.id.costValue);
        textView.setText( "" + sbm.getTotalCost() );

        textView = findViewById(R.id.mostExpensiveValue);
        textView.setText( "" + sbm.getMaxPrice() );

        textView = findViewById(R.id.leastExpensiveValue);
        textView.setText( "" + sbm.getMinPrice() );

        textView = findViewById(R.id.avgPriceValue);
        textView.setText( "" + sbm.getMeanPrice() );
    }
}
