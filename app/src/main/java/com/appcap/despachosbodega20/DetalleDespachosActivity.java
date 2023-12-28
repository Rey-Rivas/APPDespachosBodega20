package com.appcap.despachosbodega20;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.shuhart.stepview.StepView;

import java.util.Arrays;

public class DetalleDespachosActivity extends AppCompatActivity {
    StepView stepView, stepDetail;
    ImageButton backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_despachos);
        stepView = findViewById(R.id.step_view);
        stepView.setSteps(Arrays.asList(getResources().getStringArray(R.array.steps)));
        stepDetail = findViewById(R.id.detail_view);
        stepDetail.setSteps(Arrays.asList(getResources().getStringArray(R.array.detailled_steps)));


        backButton = findViewById(R.id.backBtn);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implement your custom back button logic here
                // For example, finish the current activity
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        // Add your custom logic or leave it empty to use the default behavior
    }
}