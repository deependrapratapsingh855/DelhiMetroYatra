package com.example.delhimetroyatra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Route extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route);
    }
    @Override
    public void onBackPressed() {
        Intent i=new Intent(Route.this,Home.class);
        startActivity(i);
        finish();
    }
}