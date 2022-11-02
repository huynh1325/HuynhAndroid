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

public class DrinkActivity extends AppCompatActivity {

    private RecyclerView rcvDrink;
    private DrinkAdapter drinkAdapter;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
        rcvDrink = findViewById(R.id.rcvdrink);
        button = (Button) findViewById(R.id.btnbackdrink);
        drinkAdapter = new DrinkAdapter(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvDrink.setLayoutManager(linearLayoutManager);

        drinkAdapter.setData(getListDrink());
        rcvDrink.setAdapter(drinkAdapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DrinkActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private List<Drink> getListDrink() {
        List<Drink> listDrink = new ArrayList<>();

        listDrink.add(new Drink(R.drawable.truyenthong, "Trà sữa truyền thống","26 cành"));
        listDrink.add(new Drink(R.drawable.thaixanh, "Trà sữa thái xanh","24 cành"));
        listDrink.add(new Drink(R.drawable.khoaimon, "Trà sữa khoai môn","30 cành"));
        listDrink.add(new Drink(R.drawable.gao, "Trà sữa gạo","25 cành"));

        return listDrink;
    }
}
