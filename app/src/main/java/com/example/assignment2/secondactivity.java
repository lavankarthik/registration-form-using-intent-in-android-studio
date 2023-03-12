package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.TextView;
import android.widget.TextView;
import android.widget.TextView;
import android.widget.TextView;
import android.widget.TextView;
import android.widget.TextView;

public class secondactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);

        String name = getIntent().getExtras().getString("name");
        TextView textViewName1 = findViewById(R.id.textViewName1);
        textViewName1.setText(name);
        String gender = getIntent().getExtras().getString("gender");
        TextView textViewName2 = findViewById(R.id.textViewName2);
        textViewName2.setText(gender);
        String reg = getIntent().getExtras().getString("reg");
        TextView textViewName3 = findViewById(R.id.textViewName3);
        textViewName3.setText("intern id: " +reg);
        String college = getIntent().getExtras().getString("college");
        TextView textViewName4 = findViewById(R.id.textViewName4);
        textViewName4.setText("Student of " +college);
        String address = getIntent().getExtras().getString("address");
        TextView textViewName5 = findViewById(R.id.textViewName5);
        textViewName5.setText(address);
        String branch = getIntent().getExtras().getString("branch");
        TextView textViewName6 = findViewById(R.id.textViewName6);
        textViewName6.setText(branch);
        String cgpa = getIntent().getExtras().getString("cgpa");
        TextView textViewName7 = findViewById(R.id.textViewName7);
        textViewName7.setText("CGPA: " +cgpa);

    }
}