package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText name = findViewById(R.id.Name);
        EditText age = findViewById(R.id.Age);

    Button next = findViewById(R.id.p2button);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (name.getText().toString().isEmpty() || age.getText().toString().isEmpty()) {
                    Toast.makeText(getBaseContext(), "Must fill in all!",
                            Toast.LENGTH_LONG).show();
                    // Do nothing...
                } else {
                    final Intent i = new Intent(MainActivity.this, MainActivity2.class);
                    String n = name.getText().toString();
                    String a = age.getText().toString();
                    i.putExtra("name", n);
                    i.putExtra("age", a);
                    startActivity(i);
                }
            }
        });
    }
}