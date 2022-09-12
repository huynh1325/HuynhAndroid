package com.example.listview;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.listview.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ListView lvCafe;
    Button btnThem, btnSua, btnXoa;
    EditText edtDrinks;
    ArrayList<String> arrayDrinks;

    int vitri = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvCafe = (ListView) findViewById(R.id.listviewCafe);
        btnThem = (Button) findViewById(R.id.btnThem);
        btnSua = (Button) findViewById(R.id.btnSua);
        btnXoa = (Button) findViewById(R.id.btnXoa);
        edtDrinks = (EditText) findViewById(R.id.edt);
        arrayDrinks = new ArrayList<>();

        arrayDrinks.add("Cà phê đen");
        arrayDrinks.add("Cà phê sữa");
        arrayDrinks.add("Bạc xỉu");
        arrayDrinks.add("Bò húc");
        arrayDrinks.add("Sting");

        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,arrayDrinks);

        lvCafe.setAdapter(adapter);

        lvCafe.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, arrayDrinks.get(i), Toast.LENGTH_SHORT).show();
            }
        });

        lvCafe.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, ManHinhActivity.class);
                startActivity(intent);
                return false;
            }
        });

        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mon = edtDrinks.getText().toString();
                arrayDrinks.add(mon);
                adapter.notifyDataSetChanged();
            }
        });

        lvCafe.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                edtDrinks.setText(arrayDrinks.get(i));
                vitri = i;
            }
        });

        btnSua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayDrinks.set(vitri, edtDrinks.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });

        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayDrinks.remove(vitri);
                adapter.notifyDataSetChanged();
            }
        });
    }
}