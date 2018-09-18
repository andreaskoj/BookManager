package com.example.android.bookmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        SimpleBookManager simpleBookManager = new SimpleBookManager();
        int qty = simpleBookManager.getMaxPrice();
        // Log.d("MyLog", "There is: " + qty + "book/s");
        Log.d("MyLog", "Max price: " + qty );
    }
}
