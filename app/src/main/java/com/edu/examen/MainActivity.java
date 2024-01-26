package com.edu.examen;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText firstPartialEditText;
    private EditText secondPartialEditText;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstPartialEditText = findViewById(R.id.firstPartialEditText);
        secondPartialEditText = findViewById(R.id.secondPartialEditText);
        resultTextView = findViewById(R.id.resultTextView);
    }

    public void calculateResult(View view) {
        String firstPartialStr = firstPartialEditText.getText().toString();
        String secondPartialStr = secondPartialEditText.getText().toString();

        if (!firstPartialStr.isEmpty() && !secondPartialStr.isEmpty()) {
            double firstPartial = Double.parseDouble(firstPartialStr);
            double secondPartial = Double.parseDouble(secondPartialStr);

            double result = (firstPartial + secondPartial) / 2;
            resultTextView.setText("Resultado: " + result);
        } else {
            resultTextView.setText("Es obligatorio ingresar las calificaciones.");
        }
    }
}
