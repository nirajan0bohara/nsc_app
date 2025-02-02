package com.example.nsc;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class service_page extends AppCompatActivity {
    Button btnMain, btnHome, btnAbout, btnContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.service_page);

        btnMain = findViewById(R.id.btnMain);
        btnHome = findViewById(R.id.btnHome);
        btnAbout = findViewById(R.id.btnAbout);
        btnContact = findViewById(R.id.btnContact);

        btnMain.setOnClickListener(v -> startActivity(new Intent(service_page.this, MainActivity.class)));
        btnHome.setOnClickListener(v -> startActivity(new Intent(service_page.this, home_page.class)));
        btnAbout.setOnClickListener(v -> startActivity(new Intent(service_page.this, about_page.class)));
        btnContact.setOnClickListener(v -> startActivity(new Intent(service_page.this, contact_page.class)));
    }
}
