package com.example.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity2 extends AppCompatActivity {

    TextView a1, a2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        a1 = findViewById(R.id.textView);
        a2 = findViewById(R.id.textView2);

        Bundle extra=getIntent().getExtras();
        String text= extra.getString("name");
        String text1=extra.getString("age");
        a1.setText(text);
        a2.setText(text1);
        }
    public void Click(View view) {
        Intent i = new Intent(this, MainActivity3.class);
        i.putExtra("name", "sidhu");
        i.putExtra("age", "21");

        startActivity(i);
    }
}
