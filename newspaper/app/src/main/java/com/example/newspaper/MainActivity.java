package com.example.newspaper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
















































































































































































    
    RecyclerView recyclerView;
    List<Book> bookList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        bookList = new ArrayList<>();
        bookList.add(new Book(R.drawable.guardian, "The Guardian", "Dan Brown"));
        bookList.add(new Book(R.drawable.wallstreet, "The Wall Street Journal", "Paula Hawkins"));
        bookList.add(new Book(R.drawable.washington, "The Washington Post", "J. K. Rowling"));
        bookList.add(new Book(R.drawable.newyorktimes, "The New York Times", "Suzanne Collins"));
        bookList.add(new Book(R.drawable.dailymail, "Daily Mail", "J. R. R. Tolkien"));

        BookAdapter adapter = new BookAdapter(bookList);
        recyclerView.setAdapter(adapter);
    }
}
