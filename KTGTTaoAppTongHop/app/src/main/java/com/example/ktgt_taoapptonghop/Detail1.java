package com.example.ktgt_taoapptonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail1);

        ImageView imageView = findViewById(R.id.image);
        TextView textView = findViewById(R.id.tv1);
        TextView textView2 = findViewById(R.id.tv2);
        TextView textView3 = findViewById(R.id.tv3);
        TextView textView4 = findViewById(R.id.tv4);
        TextView textView5 = findViewById(R.id.tv5);
        TextView textView6 = findViewById(R.id.tv6);
        TextView textView7 = findViewById(R.id.tv7);
        Button button = findViewById(R.id.btnback);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Detail1.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}