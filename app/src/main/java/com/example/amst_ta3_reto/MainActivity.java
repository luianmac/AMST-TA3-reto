package com.example.amst_ta3_reto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void IrAVideo(View view){
        Intent intent= new Intent(this, VideoYoutube.class);
        startActivity(intent);
    }
}
