package com.example.android.bookmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity
{
    SimpleBookManager sbm;
    Book book;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // create new SimpleBookManager object which has 5 books as default.
        sbm = new SimpleBookManager();
    }

    // Called when the user taps one of the buttons
    public void showDetail(View view)
    {
        // Do something in response to button
        switch (view.getId())
        {
            case R.id.b1:
                book = sbm.getBook(0 );
                break;

            case R.id.b2:
                book = sbm.getBook(1 );
                break;

            case R.id.b3:
                book = sbm.getBook(2 );
                break;

            case R.id.b4:
                book = sbm.getBook(3 );
                break;

            case R.id.b5:
                book = sbm.getBook(4 );
                break;
        }

        TextView textView;

        textView = findViewById(R.id.titleValue);
        textView.setText( book.getTitle() );

        textView = findViewById(R.id.authorValue);
        textView.setText( book.getAuthor() );

        textView = findViewById(R.id.courseValue);
        textView.setText( book.getCourse() );

        textView = findViewById(R.id.priceValue);
        textView.setText( String.valueOf( book.getPrice() ) );

        textView = findViewById(R.id.isbnValue);
        textView.setText( book.getIsbn() );
    }

    public void showSummary(View view)
    {
        Intent intent = new Intent(this, SummaryActivity.class);
        startActivity(intent);
    }
}
