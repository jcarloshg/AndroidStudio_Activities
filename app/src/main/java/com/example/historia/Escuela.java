package com.example.historia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.CaseMap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Escuela extends AppCompatActivity {

    Button btn_cafeteria, btn_casa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escuela);

        init_components();

        set_onClick_buttons();
    }

    private void set_onClick_buttons() {
        btn_cafeteria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Cafeteria.class);
                startActivity(intent);
            }
        });
        btn_casa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void init_components() {
        btn_cafeteria = (Button) findViewById(R.id.btn_cafeteria);
        btn_casa = (Button) findViewById(R.id.btn_casa);
    }
}