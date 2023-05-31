package com.example.demoexzamenartem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class onboard2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboard2);

    }
    public void run(View run) {
        Intent intent = new Intent(onboard2.this, onboard3.class);
        startActivity(intent);
    }
    public void onClickLayout(View run) {
        Intent intent = new Intent(onboard2.this, onboard3.class);
        startActivity(intent);
    }
}