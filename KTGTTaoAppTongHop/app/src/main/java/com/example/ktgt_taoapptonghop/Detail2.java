package com.example.ktgt_taoapptonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);

        ImageView imageView = findViewById(R.id.image2);
        TextView textView = findViewById(R.id.tv12);
        TextView textView2 = findViewById(R.id.tv22);
        TextView textView3 = findViewById(R.id.tv32);
        TextView textView4 = findViewById(R.id.tv42);
        TextView textView5 = findViewById(R.id.tv52);
        TextView textView6 = findViewById(R.id.tv62);
        Button button = findViewById(R.id.btnback2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Detail2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}