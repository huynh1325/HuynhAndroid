package com.example.ktgt_taoapptonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView;
        ArrayList<Player> arrayList;
        PlayerAdapter adapter;

        listView = findViewById(R.id.listviewplayer);

        arrayList = new ArrayList<>();
        arrayList.add(new Player("Cristiano Ronaldo", "Manchester United", "Portugal", R.drawable.cr7));
        arrayList.add(new Player("Lionel Mesi", "PSG", "Argentina", R.drawable.m10));
        arrayList.add(new Player("Lisandro Martinez", "Manchester United", "Argentina", R.drawable.martinez));
        arrayList.add(new Player("Ruben Dias", "Manchester City", "Portugal", R.drawable.rubendias));

        adapter = new PlayerAdapter(MainActivity.this, R.layout.layoutplayer, arrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, Detail1.class);
                    startActivity(intent);
                }
            }
        });

    }
}