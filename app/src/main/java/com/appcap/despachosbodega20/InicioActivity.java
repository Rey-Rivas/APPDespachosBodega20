package com.appcap.despachosbodega20;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.shuhart.stepview.StepView;

import java.util.Arrays;

public class InicioActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    StepView stepView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        stepView = findViewById(R.id.step_view);
        stepView.setSteps(Arrays.asList(getResources().getStringArray(R.array.steps)));

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.inicio);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId() == R.id.inicio){
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
                    startActivity(new Intent(getApplicationContext(), OpcionesActivity.class));
                    overridePendingTransition(0,0);
                    return true;
                }

                return false;
            }
        });
    }
    public void detail(View view) {
        Intent i = new Intent(this, DetalleDespachosActivity.class);
        startActivity(i);
    }

}