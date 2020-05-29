package com.ngocvm.example.Day84.Ex1;

import java.util.Comparator;

public class Book implements Comparable<Book> {
    private String title;
    private float price;
    private int rating;
    private String author;

    public Book() {

    }

    public Book(String title, float price, int rating, String author) {
        this.title = title;
        this.price = price;
        this.rating = rating;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return title + " - " + price + " - " + rating + " - " + author;
    }

    @Override
    public int compareTo(Book o) {
        int ret = title.compareTo(o.title);
        if (ret == 0) {
            ret = Float.compare(price, o.price);
            if (ret == 0) {
                ret = Integer.compare(rating, o.rating);
                return ret;
            }
            return ret;
        }
        return ret;
    }
}
