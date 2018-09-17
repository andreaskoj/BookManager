package com.example.android.bookmanager;

import java.util.ArrayList;
import java.util.Collections;

public class SimpleBookManager implements BookManagerInterfaces {

    private ArrayList<Book> bookList = new ArrayList<>();

    public SimpleBookManager() {
        createBook("aaa","title1",100,"0123456789111","mobile devices 1" );
        createBook("bbb","title2",200,"0123456789222","mobile devices 2" );
        createBook("ccc","title3",300,"0123456789333","mobile devices 3" );
        createBook("ddd","title4",400,"0123456789444","mobile devices 4" );
        createBook("eee","title5",500,"0123456789555","mobile devices 5" );
    }

    @Override
    public int count() {
        return bookList.size();
    }

    @Override
    public Book getBook(int index) {
        return bookList.get(index);
    }

    @Override
    public Book createBook() {
        Book InstanceOfBook = new Book();
        bookList.add(InstanceOfBook);
        return InstanceOfBook;
    }
    //this a overloading method to create books with data

    public Book createBook(String author, String title, int price, String isbn, String course) {
        Book InstanceOfBook = new Book( author, title, price, isbn, course );
        bookList.add(InstanceOfBook);
        return InstanceOfBook;
    }

    @Override
    public ArrayList<Book> getAllBooks() {
        return null;
    }

    @Override
    public void removeBook(Book book) {
        bookList.remove(book);
    }

    @Override
    public void moveBook(int from, int to) {
        Collections.swap(bookList, from, to);
    }

    @Override
    public int getMinPrice() {
        int minValue = 0;
        for (int i = 0; i < bookList.size(); i++) {
            Book book = (bookList.get(i));
            if (i == 0) minValue = book.getPrice();
            if (book.getPrice() > minValue) minValue = book.getPrice();
        }
        return minValue;
    }

    @Override
    public int getMaxPrice() {
        int maxValue = 0;
        for (int i = 0; i < bookList.size(); i++) {
            Book book = (bookList.get(i));
            if (book.getPrice() > maxValue) maxValue = book.getPrice();
        }
        return maxValue;
    }

    @Override
    public float getMeanPrice() {
        float sum = 0;

        for (int i = 0; i < bookList.size(); i++) {
            Book book = (bookList.get(i));
            sum = sum + book.getPrice();
        }

        return sum / bookList.size();
    }

    @Override
    public int getTotalCost() {
        int sum = 0;
        for (int i = 0; i < bookList.size(); i++) {
            Book book = (bookList.get(i));
            sum = sum + book.getPrice();
        }
        return sum;
    }

    @Override
    public void saveChanges() {
        // empty method
    }

}

