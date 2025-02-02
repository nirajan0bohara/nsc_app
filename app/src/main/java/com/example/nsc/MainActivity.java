package com.example.nsc;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnHome, btnAbout, btnServices, btnContact, btnVisitURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHome = findViewById(R.id.btnHome);
        btnAbout = findViewById(R.id.btnAbout);
        btnServices = findViewById(R.id.btnServices);
        btnContact = findViewById(R.id.btnContact);
        btnVisitURL = findViewById(R.id.btnVisitURL);

        btnHome.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, home_page.class)));
        btnAbout.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, about_page.class)));
        btnServices.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, service_page.class)));
        btnContact.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, contact_page.class)));

        btnVisitURL.setOnClickListener(v -> {
            String url = "https://newsummit.edu.np/";
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        });
    }
}
