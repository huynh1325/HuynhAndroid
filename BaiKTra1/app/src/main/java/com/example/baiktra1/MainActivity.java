package com.example.baiktra1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcvUser;
    private UserAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvUser = findViewById(R.id.rcvuser);
        userAdapter = new UserAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvUser.setLayoutManager(linearLayoutManager);

        userAdapter.setData(getListUser());
        rcvUser.setAdapter(userAdapter);
    }

    private List<User> getListUser() {
        List<User> list = new ArrayList<>();
        list.add(new User(R.drawable.sontung,R.drawable.star,"Nguyễn Thanh Tùng", "Sơn Tùng M-TP", "Việt Nam","5"));
        list.add(new User(R.drawable.jack,R.drawable.star,"Trịnh Trần Phương Tuấn", "Jack", "Việt Nam","5"));
        list.add(new User(R.drawable.karik,R.drawable.star,"Phạm Hoàng Khoa", "Karik", "Việt Nam","5"));

        return list;
    }
}