package com.example.demoexzamenartem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class zastavka extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zastavka);
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(zastavka.this, onboard.class);
            startActivity(intent);
        }, 3000);
    }
}