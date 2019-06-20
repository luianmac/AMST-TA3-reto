package com.example.amst_ta3_reto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
<<<<<<< HEAD
import android.widget.Button;
=======
>>>>>>> 397013eecee7d048446aa132f73a8513c25ccbcf

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
    public void IrAVideo(View view){
        Intent intent= new Intent(this, VideoYoutube.class);
        startActivity(intent);
    }
}
