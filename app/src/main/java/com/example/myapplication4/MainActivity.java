package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button button_menu, button_teorver, button_opersys, button_chema;
    ImageButton settings_btn;
    LinearLayout layout1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_menu = (Button) findViewById(R.id.button_menu);
        button_teorver = (Button) findViewById(R.id.button_teorver);
        button_opersys = (Button) findViewById(R.id.button_opersys);
        settings_btn = (ImageButton) findViewById(R.id.settings_btn);
        button_chema = (Button) findViewById(R.id.button_shema);
        final Animation anim_tranclate = AnimationUtils.loadAnimation(this, R.anim.anim_tranclate);


        button_teorver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });

        button_opersys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OperatActivity.class);
                startActivity(intent);
            }
        });

        settings_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SettigsActivity.class);
                startActivity(intent);
            }
        });

        button_chema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CircuitryActivity.class);
                startActivity(intent);
            }
        });

        button_menu.setOnClickListener(new View.OnClickListener() {
            boolean press = true;
            @Override
            public void onClick(View view) {
                if (press){
                    button_teorver.setVisibility(View.GONE);
                    button_opersys.setVisibility(View.GONE);
                    button_chema.setVisibility(View.GONE);
                    button_teorver.startAnimation(anim_tranclate);
                    button_opersys.startAnimation(anim_tranclate);
                    button_chema.startAnimation(anim_tranclate);
                    press = false;
                }
                else{
                    button_teorver.setVisibility(View.VISIBLE);
                    button_opersys.setVisibility(View.VISIBLE);
                    button_chema.setVisibility(View.VISIBLE);
                    press = true;
                }
            }
        });

    }
}