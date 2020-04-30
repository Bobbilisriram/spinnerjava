package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Spinner s;
    Button b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s=findViewById(R.id.spinner);
        b=findViewById(R.id.button);
        ArrayAdapter a=ArrayAdapter.createFromResource(this,R.array.options,android.R.layout.simple_spinner_item);
        a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(a);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String b=s.getSelectedItem().toString();
                Log.i("clicked",b);
            }
        });










    }

    }




