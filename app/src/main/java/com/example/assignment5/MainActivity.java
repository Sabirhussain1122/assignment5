package com.example.assignment5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Move(View v){
        Intent i = new Intent(MainActivity.this,second1.class);
        i.putExtra("sabir","how are you");
        startActivity(i);
        finish();
    }
}