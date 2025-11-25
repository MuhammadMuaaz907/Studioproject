package com.example.newspaper;

public class Book {
    int imageResId;
    String title;
    String author;

    public Book(int imageResId, String title, String author) {
        this.imageResId = imageResId;
        this.title = title;
        this.author = author;
    }

    public int getImageResId() { return imageResId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
}
