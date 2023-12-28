package com.appcap.despachosbodega20;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.shuhart.stepview.StepView;

import java.util.Arrays;

public class DespachosActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    StepView stepView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_despachos);
        stepView = findViewById(R.id.step_view);
        stepView.setSteps(Arrays.asList(getResources().getStringArray(R.array.steps)));
        Button nextButton = findViewById(R.id.btnNxt);
        Button prevButton = findViewById(R.id.btnPrev);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextStep();
            }
        });

        prevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prevStep();
            }
        });

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.despachos);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId() == R.id.inicio){
                    startActivity(new Intent(getApplicationContext(), InicioActivity.class));
                    overridePendingTransition(0,0);
                    return true;

                } else if(item.getItemId() == R.id.despachos){
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

    private void nextStep() {
        int currentStep = stepView.getCurrentStep();
        if (currentStep < stepView.getStepCount() - 1) {
            stepView.go(currentStep + 1, true);
        }
    }

    private void prevStep() {
        int currentStep = stepView.getCurrentStep();
        if (currentStep > 0) {
            stepView.go(currentStep - 1, true);
        }
    }

}