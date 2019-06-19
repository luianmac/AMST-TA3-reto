package com.example.amst_ta3_reto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnGraficoLineal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGraficoLineal = (Button) findViewById(R.id.btnGraficoLineal);
    }

    public void graficoLineal(View view){
        Intent intent = new Intent(this, grafico_lineal.class);
        startActivity(intent);
    }
}
