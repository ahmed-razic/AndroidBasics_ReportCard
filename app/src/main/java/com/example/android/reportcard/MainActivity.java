package com.example.android.reportcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ReportCard studentAhmedRazic = new ReportCard("Ahmed", "Razic", 10001568, "III-2");

        studentAhmedRazic.setMathGrade('A');
        studentAhmedRazic.setBiologyGrade('A');
        studentAhmedRazic.setBosnianGrade('A');
        studentAhmedRazic.setChemistryGrade('B');
        studentAhmedRazic.setPhysicsGrade('C');

        TextView text = findViewById(R.id.textView);
        text.setText(studentAhmedRazic.toString());
        Toast.makeText(this, "Bosnian language grade: " + studentAhmedRazic.getBosnianGrade(), Toast.LENGTH_LONG).show();


        ReportCard studentIbrahimRazic = new ReportCard("Ibrahim", "Razic", 101225588,
                "X-3", 'A', 'B', 'C', 'B', 'A');

        TextView text2 = findViewById(R.id.textView2);
        text2.setText(studentIbrahimRazic.toString());
    }
}