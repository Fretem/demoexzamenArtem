package com.example.demoexzamenartem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class codeizemail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_codeizemail);
        getSupportActionBar().hide();


        EditText edit1 = (EditText)  findViewById(R.id.editTextNumber4);
        EditText edit2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText edit3 = (EditText)  findViewById(R.id.editTextNumber3);
        EditText edit4 = (EditText) findViewById(R.id.editTextNumber);
        String test = "1234";
        final String[] s1 = {"", "", "", ""};


        edit1.addTextChangedListener(new TextWatcher() {


            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int count, int after) {
                if (s.length() == 1) {
                    s1[0] = edit1.getText().toString();
                    edit2.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }




        });

        edit2.addTextChangedListener(new TextWatcher() {


            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int count, int after) {
                if (s.length() == 1) {
                    s1[0] = edit2.getText().toString();
                    edit3.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }




        });



        edit3.addTextChangedListener(new TextWatcher() {


            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int count, int after) {
                if (s.length() == 1) {
                    s1[0] = edit3.getText().toString();
                    edit4.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }




        });


       edit4.addTextChangedListener(new TextWatcher() {
           @Override
           public void beforeTextChanged(CharSequence s, int start, int before, int after) {

           }

           @Override
           public void onTextChanged(CharSequence s, int start, int before, int after) {
            if(s.length()==1){
                s1[3] = edit4.getText().toString();

                String s_all = s1[0]+ s1[1] + s1[2] + s1[3];
                Log.i("string", (String) s_all);
                if (s_all.equals(test)) {
                    Intent intent = new Intent(codeizemail.this, createpassword.class);
                    startActivity(intent);
                }
                else if (!s_all.equals(test)) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "неправильный пароль",
                            Toast.LENGTH_SHORT);
                    toast.show();
                }

            }
           }

           @Override
           public void afterTextChanged(Editable editable) {

           }
       });




    }

            public void run(View run) {
                Intent intent = new Intent(codeizemail.this, vhodandregestrachia.class);
                startActivity(intent);
            }
}



