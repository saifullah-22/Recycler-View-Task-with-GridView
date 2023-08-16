package com.example.recyclerviewlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private Button btn;

    private EditText username, password;


    private static final String CORRECT_USERNAME = "Saifullah Anwar";
    private static final String CORRECT_PASSWORD = "password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        btn = findViewById(R.id.btn);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        btn.setOnClickListener(v -> {

            String value = username.getText().toString();
            String value1 = password.getText().toString();


            // Check if the entered username and password match the predefined values
            if (value.equals(CORRECT_USERNAME) && value1.equals(CORRECT_PASSWORD)) {
                // Login successful, display a toast message
                Toast.makeText(MainActivity2.this, "Login successful", Toast.LENGTH_SHORT).show();

                Intent myIntent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(myIntent);

            } else {
                // Login failed, display a toast message
                Toast.makeText(MainActivity2.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
            }




        });



    }
}








