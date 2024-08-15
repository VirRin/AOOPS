package com.example.furbiddenfroot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class forestYes extends AppCompatActivity {
private Button b4,b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forest_yes);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b4.setOnClickListener(view -> Screen4());
        b5.setOnClickListener(view -> No());
    }
    public void Screen4(){
        Intent i4 = new Intent(this,Choose.class);
        startActivity(i4);
    }
    public void No(){
        Intent i5 = new Intent(this,ActNo.class);
        startActivity(i5);
    }
}