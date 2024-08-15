package com.example.furbiddenfroot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Choose extends AppCompatActivity {
    private Button air,water,land;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
        air = findViewById(R.id.air);
        water = findViewById(R.id.water);
        land = findViewById(R.id.land);
        air.setOnClickListener(view -> openair());
        water.setOnClickListener(view -> openwater());
        land.setOnClickListener(view -> openland());
    }
    public void openair(){
        Intent i6 = new Intent(this,AirEnd.class);
        startActivity(i6);
    }
    public void openwater(){
        Intent i7 = new Intent(this,WaterEnd.class);
        startActivity(i7);
    }
    public void openland(){
        Intent i8 = new Intent(this,LandEnd.class);
        startActivity(i8);
    }
}