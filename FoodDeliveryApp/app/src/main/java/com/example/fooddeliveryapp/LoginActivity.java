package com.example.fooddeliveryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {



    String fb2 = "https://www.facebook.com/";
    String wp2 = "https://web.whatsapp.com/";
    String ig2 = "https://www.instagram.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView btn = findViewById(R.id.btnlogin);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
            }
        });
        Button facebook;
        Button ig;
        Button wp;

        facebook = findViewById(R.id.btnFacebook);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri linkFb = Uri.parse(fb2);
                Intent i = new Intent(Intent.ACTION_VIEW,linkFb);
                startActivity(i);
            }
        });

        wp = findViewById(R.id.btnWhats);
        wp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri link = Uri.parse(wp2);
                Intent i = new Intent(Intent.ACTION_VIEW,link);
                startActivity(i);
            }
        });

        ig = findViewById(R.id.btnInstagram);
        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri linkFb = Uri.parse(ig2);
                Intent i = new Intent(Intent.ACTION_VIEW,linkFb);
                startActivity(i);
            }
        });
    }
}