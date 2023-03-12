package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void btnSubmit(View view){
            EditText editTextName1;
            editTextName1 = findViewById(R.id.editTextName1);
            String name = editTextName1.getText().toString();
            EditText editTextName2;
            editTextName2 = findViewById(R.id.editTextName2);
            String gender = editTextName2.getText().toString();
            EditText editTextName3;
            editTextName3 = findViewById(R.id.editTextName3);
            String reg = editTextName3.getText().toString();
            EditText editTextName4;
            editTextName4 = findViewById(R.id.editTextName4);
            String college = editTextName4.getText().toString();
            EditText editTextName5;
            editTextName5 = findViewById(R.id.editTextName5);
            String address = editTextName5.getText().toString();
            EditText editTextName6;
            editTextName6 = findViewById(R.id.editTextName6);
            String branch = editTextName6.getText().toString();
            EditText editTextName7;
            editTextName7 = findViewById(R.id.editTextName7);
            String cgpa = editTextName7.getText().toString();
            Intent intent = new Intent(MainActivity.this, secondactivity.class);
            intent.putExtra("name",name);
            intent.putExtra("gender",gender);
            intent.putExtra("reg",reg);
            intent.putExtra("college",college);
            intent.putExtra("address",address);
            intent.putExtra("branch",branch);
            intent.putExtra("cgpa",cgpa);
            startActivity(intent);
    }
}