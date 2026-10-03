package com.example.spinner;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    Spinner spinnerCourse;

    TextView txtResult;

    String[] courses={
            "Select Course",
            "MCA",
            "BCA",
            "B.TECH",
            "MBA",
            "M.TECH"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerCourse=findViewById(R.id.spinnerCourse);
        txtResult=findViewById(R.id.txtResult);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,courses);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCourse.setAdapter(adapter);

        //Event Handling
        spinnerCourse.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedCourse = courses[position];

                txtResult.setText("Selected Course" + selectedCourse);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                txtResult.setText("No Course Selected");
            }
        }

        );
    }
}
