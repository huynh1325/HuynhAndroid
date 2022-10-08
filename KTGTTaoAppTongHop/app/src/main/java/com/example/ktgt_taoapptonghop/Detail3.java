package com.example.ktgt_taoapptonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail3);

        ImageView imageView = findViewById(R.id.image3);
        TextView textView = findViewById(R.id.tv13);
        TextView textView2 = findViewById(R.id.tv23);
        TextView textView3 = findViewById(R.id.tv33);
        TextView textView4 = findViewById(R.id.tv43);
        TextView textView5 = findViewById(R.id.tv53);
        Button button = findViewById(R.id.btnback3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Detail3.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}