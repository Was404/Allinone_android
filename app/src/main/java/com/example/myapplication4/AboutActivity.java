package com.example.myapplication4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {

    Button button_back, btn_next;
    TextView textteorver1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teorver_check);

        button_back = (Button) findViewById(R.id.button_back);
        btn_next = (Button) findViewById(R.id.btn_next);
        textteorver1= (TextView) findViewById(R.id.textteorver1);

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AboutActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int count = 0;
                if (count==0) {
                    textteorver1.setText(R.string.teor_block2);
                    count += 1;
                }
                if (count==1)
                {
                    textteorver1.setText(R.string.teor_block3);
                }
            }
        });
        // загружаем текст
        //textteorver1.setText();
    }
}
