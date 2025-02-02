package com.example.nsc;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class about_page extends AppCompatActivity {
    Button btnMain, btnHome, btnServices, btnContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_page);

        btnMain = findViewById(R.id.btnMain);
        btnHome = findViewById(R.id.btnHome);
        btnServices = findViewById(R.id.btnServices);
        btnContact = findViewById(R.id.btnContact);

        btnMain.setOnClickListener(v -> startActivity(new Intent(about_page.this, MainActivity.class)));
        btnHome.setOnClickListener(v -> startActivity(new Intent(about_page.this, home_page.class)));
        btnServices.setOnClickListener(v -> startActivity(new Intent(about_page.this, service_page.class)));
        btnContact.setOnClickListener(v -> startActivity(new Intent(about_page.this, contact_page.class)));
    }
}
