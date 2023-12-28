package com.appcap.despachosbodega20;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class OpcionesActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.opciones);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId() == R.id.inicio){
                    startActivity(new Intent(getApplicationContext(), InicioActivity.class));
                    overridePendingTransition(0,0);
                    return true;

                } else if(item.getItemId() == R.id.despachos){
                    startActivity(new Intent(getApplicationContext(), DespachosActivity.class));
                    overridePendingTransition(0,0);
                    return true;

                } else if (item.getItemId() == R.id.historial){
                    startActivity(new Intent(getApplicationContext(), HistorialActivity.class));
                    overridePendingTransition(0,0);
                    return true;

                } else if (item.getItemId() == R.id.opciones){
                    return true;
                }

                return false;
            }
        });
    }
    public void problemas(View view) {
        Intent i = new Intent(this, ProblemasActivity.class);
        startActivity(i);
    }

    public void logout(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

}