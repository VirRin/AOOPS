package com.example.furbiddenfroot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Forest extends AppCompatActivity {
public Button b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forest);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b2.setOnClickListener(view -> Screen3());
        b3.setOnClickListener(view -> No());
    }
    public void Screen3(){
        Intent  i2 = new Intent(this,forestYes.class);
        startActivity(i2);
    }
    public void No(){
        Intent i3 = new Intent(this,ActNo.class);
        startActivity(i3);
    }
}