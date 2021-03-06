package com.example.android.bookmanager;

import java.util.ArrayList;

public interface BookManagerInterfaces {

    public int count();

    public Book getBook(int index);

    public Book createBook();

    public ArrayList<Book> getAllBooks();

    public void removeBook(Book book);

    public void moveBook(int from, int to);

    public int getMinPrice();

    public int getMaxPrice();

    public float getMeanPrice();

    public int getTotalCost();

    public void saveChanges();
}