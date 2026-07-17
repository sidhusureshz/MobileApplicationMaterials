package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button b;

    TextView t1, t2, t3;

    EditText e1, e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        t1 = findViewById(R.id.textView7);
        t2 = findViewById(R.id.textView4);
        t3 = findViewById(R.id.textView5);

        b = findViewById(R.id.button);

        e1 = findViewById(R.id.editTextText);
        e2 = findViewById(R.id.editTextText2);

        b.setOnClickListener(v -> {

            String n = e1.getText().toString();
            String p = e2.getText().toString();

            if (n.equals("sidhu") && p.equals("12345")) {

                Toast.makeText(MainActivity.this,
                        "Login Successful",
                        Toast.LENGTH_SHORT).show();

            } else {

                Toast.makeText(MainActivity.this,
                        "Invalid Credentials",
                        Toast.LENGTH_SHORT).show();

            }
        });
    }
}
