package com.labactivity.lab_userinteraction;

import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
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
    ImageView bg_onlights;
    ImageView bg_offlights;
    Button btn_switch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_pink = findViewById(R.id.btn_pink);
        btn_sage = findViewById(R.id.btn_sage);
        btn_blue = findViewById(R.id.btn_blue);
        mylayout = findViewById(R.id.mylayout);
        rd_mars = findViewById(R.id.rd_mars);
        rd_venus = findViewById(R.id.rd_venus);
        rd_jupiter = findViewById(R.id.rd_jupiter);
        bg_onlights = findViewById(R.id.bg_onlights);
        btn_switch = findViewById(R.id.btn_switch);
        

        btn_pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"You click the PINK button", Toast.LENGTH_SHORT).show();
            }
        });

        btn_sage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"You click the SAGE button", Toast.LENGTH_SHORT).show();
            }
        });

        btn_blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "You click the BLUE button", Toast.LENGTH_SHORT).show();
            }
        });

        rd_mars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rd_venus.setChecked(false);
                rd_jupiter.setChecked(false);
                Snackbar.make(mylayout,"Your Answer is Wrong. Mars isn't the largest planet. Keep going!", Snackbar.LENGTH_INDEFINITE)
                        .setAction("Close", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                            }
                        }).show();
            }
        });

        rd_venus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rd_mars.setChecked(false);
                rd_jupiter.setChecked(false);
                Snackbar.make(mylayout, "Your Answer is Wrong. Venus isn't the largest planet. Keep going!", Snackbar.LENGTH_INDEFINITE)
                        .setAction("Close", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                            }
                        }).show();
            }
        });

        rd_jupiter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rd_mars.setChecked(false);
                rd_venus.setChecked(false);
                Snackbar.make(mylayout, "Your Answer is Correct. Jupiter is indeed the largest planet. Great Job!", Snackbar.LENGTH_INDEFINITE)
                        .setAction("Close", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                            }
                        }).show();
            }
        });

        btn_switch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSwitchDialog();
            }
        });
        
    }

    private boolean isLampOn = false;
    private void showSwitchDialog() {

        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle("Attention!")
                .setMessage("Would you like to turn the night lamp on or off?")
                .setNegativeButton("Off", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // If the lamp is on, turn it off
                        if (isLampOn) {
                            bg_onlights.setImageResource(R.drawable.bg_onlights);
                            isLampOn = false;
                        }
                    }
                })
                .setPositiveButton("On", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // If the lamp is off, turn it on
                        if (!isLampOn) {
                            bg_onlights.setImageResource(R.drawable.bg_offlights);
                            isLampOn = true;
                        }
                    }
                }).show();
    }
}