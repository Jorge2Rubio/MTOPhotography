package com.example.group4proj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Inquiry_form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inquiry_form);

        Toolbar backImg = findViewById(R.id.backBtn_inquiry);
        Button submitBtn = findViewById(R.id.submitBtn);

        backImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Inquiry_form.this, Home_Main.class);
                startActivity(intent);
            }
        });

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Inquiry_form.this, "Thank you for your Inquiry!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
