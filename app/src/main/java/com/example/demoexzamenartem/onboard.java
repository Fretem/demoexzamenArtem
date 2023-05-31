package com.example.demoexzamenartem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class onboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboard);
    }

    public void run(View run) {
        Intent intent = new Intent(onboard.this, onboard3.class);
        startActivity(intent);
    }

    public void onClickLayout(View run) {
        Intent intent = new Intent(onboard.this, onboard2.class);
        startActivity(intent);
    }
}