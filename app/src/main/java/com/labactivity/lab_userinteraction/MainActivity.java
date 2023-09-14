package com.labactivity.lab_userinteraction;

import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;
import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity {
    Button btn_pink;
    Button btn_sage;
    Button btn_blue;
    RadioButton rd_mars;
    RadioButton rd_venus;
    RadioButton rd_jupiter;
    ConstraintLayout mylayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_pink = findViewById(R.id.btn_pink);
        btn_sage = findViewById(R.id.btn_sage);
        btn_blue = findViewById(R.id.btn_blue);
        mylayout = findViewById(R.id.mylayout);

        btn_pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"You click the PINK button", Toast.LENGTH_LONG).show();
            }
        });

        btn_sage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"You click the SAGE button", Toast.LENGTH_LONG).show();
            }
        });

        btn_blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "You click the BLUE button", Toast.LENGTH_LONG).show();
            }
        });

        rd_mars = findViewById(R.id.rd_mars);
        rd_venus = findViewById(R.id.rd_venus);
        rd_jupiter = findViewById(R.id.rd_jupiter);

        rd_mars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rd_venus.setChecked(false);
                rd_jupiter.setChecked(false);
            }
        });

        rd_venus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rd_mars.setChecked(false);
                rd_jupiter.setChecked(false);
            }
        });

        rd_jupiter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rd_mars.setChecked(false);
                rd_venus.setChecked(false);
            }
        });

    }
}