package com.example.demoexzamenartem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class vhodandregestrachia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vhodandregestrachia);
    }
    public void run(View run) {
        Intent intent = new Intent(vhodandregestrachia.this, vhodandregestrachia.class);
        startActivity(intent);
    }
    public void onClickLayout(View run) {
        Intent intent = new Intent(vhodandregestrachia.this, vhodandregestrachia.class);
        startActivity(intent);
    }
}