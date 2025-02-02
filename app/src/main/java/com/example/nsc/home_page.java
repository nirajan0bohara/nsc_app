package com.example.nsc;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class home_page extends AppCompatActivity {

    Button btnMain, btnAbout, btnServices, btnContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        btnMain = findViewById(R.id.btnMain);
        btnAbout = findViewById(R.id.btnAbout);
        btnServices = findViewById(R.id.btnServices);
        btnContact = findViewById(R.id.btnContact);

        btnMain.setOnClickListener(v -> startActivity(new Intent(home_page.this, MainActivity.class)));
        btnAbout.setOnClickListener(v -> startActivity(new Intent(home_page.this, about_page.class)));
        btnServices.setOnClickListener(v -> startActivity(new Intent(home_page.this, service_page.class)));
        btnContact.setOnClickListener(v -> startActivity(new Intent(home_page.this, contact_page.class)));
    }
}
