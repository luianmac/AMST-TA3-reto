package com.example.amst_ta3_reto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;

public class MainActivity extends AppCompatActivity {

    private Button btnGraficoLineal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGraficoLineal = (Button) findViewById(R.id.btnGraficoLineal);
        creacion_fab();
    }

    public void graficoLineal(View view){
        Intent intent = new Intent(this, grafico_lineal.class);
        startActivity(intent);
    }
    public void IrAVideo(View view){
        Intent intent= new Intent(this, VideoYoutube.class);
        startActivity(intent);
    }
    public void IrAMapa(View view){
        Intent intent= new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
    public void IrACalenario(View view){
        Intent intent= new Intent(this, calendario_view.class);
        startActivity(intent);
    }

    public void creacion_fab(){
        ImageView icon = new ImageView(this); // Create an icon
        icon.setImageDrawable( getResources().getDrawable(R.drawable.button_action ));

        FloatingActionButton actionButton = new FloatingActionButton.Builder(this)
                .setContentView(icon)
                .setTheme(5)
                .build();
        SubActionButton.Builder itemBuilder = new SubActionButton.Builder(this);
// repeat many times:
        ImageView itemIcon = new ImageView(this);
        //Button b1 = new Button(this);
        //b1.setBackground(getResources().getDrawable(R.drawable.button_sub_action_dark_selector ));
        itemIcon.setImageDrawable( getResources().getDrawable(R.drawable.button_sub_action_dark_selector ));
        SubActionButton button1 = itemBuilder.setContentView(itemIcon).build();

        ImageView itemIcon2 = new ImageView(this);
        itemIcon.setImageDrawable( getResources().getDrawable(R.drawable.button_sub_action_dark_touch ));
        SubActionButton button2 = itemBuilder.setContentView(itemIcon2).build();

        ImageView itemIcon3 = new ImageView(this);
        itemIcon.setImageDrawable( getResources().getDrawable(R.drawable.button_sub_action_dark_touch ));
        SubActionButton button3 = itemBuilder.setContentView(itemIcon3).build();

        ImageView itemIcon4 = new ImageView(this);
        itemIcon.setImageDrawable( getResources().getDrawable(R.drawable.button_sub_action_dark_touch ));
        SubActionButton button4 = itemBuilder.setContentView(itemIcon4).build();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("button1 pressed");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("button2 pressed");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("button3 pressed");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("button4 pressed");
            }
        });

        FloatingActionMenu actionMenu = new FloatingActionMenu.Builder(this)
                .addSubActionView(button1)
                .addSubActionView(button2)
                .addSubActionView(button3)
                .addSubActionView(button4)
                .attachTo(actionButton)
                .build();

    }
}
