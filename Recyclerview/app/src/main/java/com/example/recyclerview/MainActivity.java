package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcvUser;
    private UserAdapter mUserAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvUser = findViewById(R.id.rcv_user);
        mUserAdapter = new UserAdapter(this);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,3);
        rcvUser.setLayoutManager(gridLayoutManager);

        mUserAdapter.setData(getListUser());
        rcvUser.setAdapter(mUserAdapter);
    }

    private List<User> getListUser() {
        List<User> list = new ArrayList<>();
        list.add(new User(R.drawable.pikachu,"Pikachu"));
        list.add(new User(R.drawable.pulpapedia,"Pulpapedia"));
        list.add(new User(R.drawable.pikachu,"Pikachu"));
        list.add(new User(R.drawable.pulpapedia,"Pulpapedia"));
        list.add(new User(R.drawable.pikachu,"Pikachu"));

        return list;
    }
}