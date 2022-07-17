package com.example.a523j;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    NestedScrollView nestedScrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getAllChats();
    }

    void getAllChats(){

        ArrayList<Chat> chat = new ArrayList<>();
        RecyclerView recyclerView = findViewById(R.id.rv);
         nestedScrollView = findViewById(R.id.nestedScrollView);

        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));

        chat.add( new Chat(R.drawable.f, 1, "Temur Xaydarov"));
        chat.add(new Chat(R.drawable.nissan, 0, "Nick Johnson"));
        chat.add(new Chat(R.drawable.volkswagen, 1, "Sarah Trevor"));
        chat.add( new Chat(R.drawable.f, 1, "Temur Xaydarov"));
        chat.add(new Chat(R.drawable.nissan, 0, "Nick Johnson"));
        chat.add(new Chat(R.drawable.volkswagen, 1, "Sarah Trevor"));
        chat.add( new Chat(R.drawable.f, 1, "Temur Xaydarov"));
        chat.add(new Chat(R.drawable.nissan, 0, "Nick Johnson"));
        chat.add(new Chat(R.drawable.volkswagen, 1, "Sarah Trevor"));
        chat.add( new Chat(R.drawable.f, 1, "Temur Xaydarov"));
        chat.add(new Chat(R.drawable.nissan, 0, "Nick Johnson"));
        chat.add(new Chat(R.drawable.volkswagen, 1, "Sarah Trevor"));
        chat.add( new Chat(R.drawable.f, 1, "Temur Xaydarov"));
        chat.add(new Chat(R.drawable.nissan, 0, "Nick Johnson"));
        chat.add(new Chat(R.drawable.volkswagen, 1, "Sarah Trevor"));

        ChatAdapter adapter = new ChatAdapter(chat, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setNestedScrollingEnabled(false);
    }
}