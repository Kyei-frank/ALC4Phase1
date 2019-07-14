package com.example.alc4phase1;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btnAbout = findViewById(R.id.alcButton);
        Button btnProfile = findViewById(R.id.profileButton);

        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent  intent = new Intent(MainActivity.this, ActivityB.class);
                startActivity(intent);

            }

        });

        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ActivityC.class );
                startActivity(intent) ;
            }
        });

    }
}
