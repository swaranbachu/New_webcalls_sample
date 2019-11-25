package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondscreen);
        et = findViewById(R.id.editText);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter the ID", Toast.LENGTH_LONG).show();
                } else {
                    int id = Integer.parseInt(et.getText().toString());
                    // Toast.makeText(MainActivity.this, "ID"+ id, Toast.LENGTH_LONG).show();

                    Intent myIntent = new Intent(MainActivity.this, Main2Activity.class);
                    myIntent.putExtra("ID",id);
                    startActivity(myIntent);
                }
            }
        });


    }


}