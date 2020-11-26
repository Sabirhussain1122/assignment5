package com.example.assignment5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class sendresultback extends AppCompatActivity {
    EditText ed3;
    Button btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sendresultback);
        ed3=findViewById(R.id.edittext3);
        btn3=findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value=ed3.getText().toString().trim();

               // return result
                Intent returnIntent=new Intent();
                returnIntent.putExtra("sabirhussain",value);
                setResult(RESULT_OK,returnIntent);
                finish();

            }
        });
    }
}