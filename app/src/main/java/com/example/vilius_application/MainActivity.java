package com.example.vilius_application;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    TextView tvMain;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain = findViewById(R.id.tvMain);

    }


    public void onbutton2Click(View view) {
        this.tvMain.setBackgroundColor(Color.parseColor("#CDEFFE"));
    }

    public void onbtnchangeClick(View view) {
        this.tvMain.setText("Programos pabaiga");
    }
}