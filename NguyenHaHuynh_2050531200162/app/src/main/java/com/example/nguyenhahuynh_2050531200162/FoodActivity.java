package com.example.nguyenhahuynh_2050531200162;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FoodActivity extends AppCompatActivity {

    private RecyclerView rcvFood;
    private FoodAdapter foodAdapter;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        button = (Button) findViewById(R.id.btnbackfood);
        rcvFood = findViewById(R.id.rcvfood);
        foodAdapter = new FoodAdapter(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvFood.setLayoutManager(linearLayoutManager);

        foodAdapter.setData(getListFood());
        rcvFood.setAdapter(foodAdapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoodActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private List<Food> getListFood() {
        List<Food> listFood = new ArrayList<>();

        listFood.add(new Food(R.drawable.cavienchien, "Cá viên chiên","26 cành"));
        listFood.add(new Food(R.drawable.ocnhoicabasa, "Ốc nhồi cá basa","24 cành"));
        listFood.add(new Food(R.drawable.khoaitaychien, "Khoai tây chiên","30 cành"));
        listFood.add(new Food(R.drawable.xucxich, "Xúc xích Đức","25 cành"));

        return listFood;
    }
}