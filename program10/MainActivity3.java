package com.example.intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    TextView a3, a4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        a3 = findViewById(R.id.textView3);
        a4 = findViewById(R.id.textView4);

        String text = getIntent().getStringExtra("name");
        String text1 = getIntent().getStringExtra("age");

        a3.setText(text);
        a4.setText(text1);
    }
}
