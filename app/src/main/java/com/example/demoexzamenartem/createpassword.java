package com.example.demoexzamenartem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class createpassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createpassword);
        getSupportActionBar().hide();

    }
    public void run(View run) {
        Intent intent = new Intent(createpassword.this, exzamen.class);
        startActivity(intent);
    }
    public void onClickLayout(View run) {
        Intent intent = new Intent(createpassword.this, exzamen.class);
        startActivity(intent);
    }
}