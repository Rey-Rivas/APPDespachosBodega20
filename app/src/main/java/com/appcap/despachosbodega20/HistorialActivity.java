package com.appcap.despachosbodega20;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HistorialActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.historial);
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
                    return true;

                } else if (item.getItemId() == R.id.opciones){
                    startActivity(new Intent(getApplicationContext(), OpcionesActivity.class));
                    overridePendingTransition(0,0);
                    return true;
                }

                return false;
            }
        });
    }
}