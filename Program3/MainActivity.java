package com.example.myapplication3;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText n1, n2;
    Button sum, sub, mul, div;
    TextView re;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Initialize Views
        n1 = findViewById(R.id.editTextText);
        n2 = findViewById(R.id.editTextText2);

        div = findViewById(R.id.button);      // Divide (/)
        sub = findViewById(R.id.button2);     // Subtract (-)
        sum = findViewById(R.id.button3);     // Add (+)
        mul = findViewById(R.id.button4);     // Multiply (*)

        re = findViewById(R.id.textView);

        // Addition
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f1 = Integer.parseInt(n1.getText().toString());
                int f2 = Integer.parseInt(n2.getText().toString());

                int cal = f1 + f2;
                re.setText("Sum = " + cal);
            }
        });

        // Subtraction
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f1 = Integer.parseInt(n1.getText().toString());
                int f2 = Integer.parseInt(n2.getText().toString());

                int cal = f1 - f2;
                re.setText("Subtraction = " + cal);
            }
        });

        // Multiplication
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f1 = Integer.parseInt(n1.getText().toString());
                int f2 = Integer.parseInt(n2.getText().toString());

                int cal = f1 * f2;
                re.setText("Multiplication = " + cal);
            }
        });

        // Division
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f1 = Integer.parseInt(n1.getText().toString());
                int f2 = Integer.parseInt(n2.getText().toString());

                if (f2 != 0) {
                    int cal = f1 / f2;
                    re.setText("Division = " + cal);
                } else {
                    re.setText("Cannot divide by zero");
                }
            }
        });
    }
}
