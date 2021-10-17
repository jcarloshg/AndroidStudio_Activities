package com.example.historia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_escuela, btn_cafeteria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init_components();
        set_onClick_buttons();
    }

    private void set_onClick_buttons() {
        btn_escuela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Escuela.class);
                startActivity(intent);
            }
        });
        btn_cafeteria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Cafeteria.class);
                startActivity(intent);
            }
        });
    }

    private void init_components() {
        btn_escuela = (Button) findViewById(R.id.btn_escuela);
        btn_cafeteria = (Button) findViewById(R.id.btn_cafeteria);
    }
}