package com.example.historia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cafeteria extends AppCompatActivity {

    Button btn_salonClases, btn_cine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafeteria);

        init_components();
        set_onClick_buttons();
    }

    private void set_onClick_buttons() {
        btn_salonClases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SalonClase.class);
                startActivity(intent);
            }
        });
        btn_cine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Cine.class);
                startActivity(intent);
            }
        });
    }

    private void init_components() {
        btn_salonClases = (Button) findViewById(R.id.btn_salonClases);
        btn_cine        = (Button) findViewById(R.id.btn_cine);
    }
}