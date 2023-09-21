package com.cs407.lab2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_activity);

        TextView resultTextView = findViewById(R.id.resultTextView);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            double result = extras.getDouble("result");
            resultTextView.setText("Result: " + result);
        }
    }
}
