package com.example.android.bookmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView titleTextView = (TextView) findViewById(R.id.title);
        titleTextView.setText("Head First Android Development: A Brain-Friendly Guide");

        TextView authorTextView = (TextView) findViewById(R.id.author);
        authorTextView.setText("Dawn Griffiths");

        TextView courseTextView = (TextView) findViewById(R.id.course);
        courseTextView.setText("Android apps");

        TextView priceTextView = (TextView) findViewById(R.id.price);
        priceTextView.setText("$30");

        TextView isbnTextView = (TextView) findViewById(R.id.isbn);
        isbnTextView.setText("1449362184");

    }
}
