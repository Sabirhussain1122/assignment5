package com.example.assignment5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class second1 extends AppCompatActivity {
    TextView t1;
    String name="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second1);
        Bundle bundle=getIntent().getExtras();
        if (bundle!=null){
            name=bundle.getString("sabir");
        }
        t1=findViewById(R.id.textview1);
        t1.setText(name);
    }
}