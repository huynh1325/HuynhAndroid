package com.example.projectlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSignIn, btnSignUp;
    EditText etxUser, etxPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSignIn = (Button) findViewById(R.id.btnSignIn);
        btnSignUp = (Button) findViewById(R.id.btnSignUp);
        etxUser = (EditText) findViewById(R.id.etxUser);
        etxPassword = (EditText) findViewById(R.id.etxPassword);

        btnSignUp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent a = new Intent(MainActivity.this, SignUp.class);
                startActivity(a);
            }
        });

        btnSignIn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(etxUser.getText().toString().equals("admin") && etxPassword.getText().toString().equals("admin")){
                    Intent a = new Intent(MainActivity.this, ProfileActivity.class);
                    startActivity(a);
                    Toast.makeText(MainActivity.this, "Đăng nhập thành công!", Toast.LENGTH_LONG).show();
                }
                else
                    Toast.makeText(MainActivity.this, "Sai tài khoản hoặc mật khẩu!", Toast.LENGTH_LONG).show();
            }
        });

    }
}