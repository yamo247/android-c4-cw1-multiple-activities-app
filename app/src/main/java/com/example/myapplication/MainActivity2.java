package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {

    @Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main2);

    TextView name = findViewById(R.id.finalname);
    Bundle uname = getIntent().getExtras();
    String username = uname.getString("name");
    name.setText(username);

    TextView age = findViewById(R.id.finalage);
    Bundle uage = getIntent().getExtras();
    String userage = uage.getString("age");
    age.setText(userage);

}
}

