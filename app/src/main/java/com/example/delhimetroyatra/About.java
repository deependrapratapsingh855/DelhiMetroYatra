package com.example.delhimetroyatra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

    }
    @Override
    public void onBackPressed() {
        Intent i=new Intent(About.this,Home.class);
        startActivity(i);
        finish();
    }
}