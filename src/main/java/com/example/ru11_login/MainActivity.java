package com.example.ru11_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    boolean logon = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (!logon){ //if user did not login yet, open LoginActivity
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        }
    }
}
