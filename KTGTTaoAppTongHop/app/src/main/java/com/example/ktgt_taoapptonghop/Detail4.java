package com.example.ktgt_taoapptonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail4);

        ImageView imageView = findViewById(R.id.image4);
        TextView textView = findViewById(R.id.tv14);
        TextView textView2 = findViewById(R.id.tv24);
        TextView textView3 = findViewById(R.id.tv34);
        TextView textView4 = findViewById(R.id.tv44);
        TextView textView5 = findViewById(R.id.tv54);
        Button button = findViewById(R.id.btnback4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Detail4.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}