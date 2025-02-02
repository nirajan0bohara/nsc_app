package com.example.nsc;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class contact_page extends AppCompatActivity {

    Button btnMain, btnHome, btnAbout, btnServices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_page);

        btnMain = findViewById(R.id.btnMain);
        btnHome = findViewById(R.id.btnHome);
        btnAbout = findViewById(R.id.btnAbout);
        btnServices = findViewById(R.id.btnServices);

        btnMain.setOnClickListener(v -> startActivity(new Intent(contact_page.this, MainActivity.class)));
        btnHome.setOnClickListener(v -> startActivity(new Intent(contact_page.this, home_page.class)));
        btnAbout.setOnClickListener(v -> startActivity(new Intent(contact_page.this, about_page.class)));
        btnServices.setOnClickListener(v -> startActivity(new Intent(contact_page.this, service_page.class)));
    }
}
