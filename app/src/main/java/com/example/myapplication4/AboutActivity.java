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
    String[] teor_block;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teorver_check);

        button_back = (Button) findViewById(R.id.button_back);
        btn_next = (Button) findViewById(R.id.btn_next);
        textteorver1= (TextView) findViewById(R.id.textteorver1);
        teor_block = getResources().getStringArray(R.array.teor_block);

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AboutActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        textteorver1.setText(teor_block[0]);
        btn_next.setOnClickListener(new View.OnClickListener() {
            int count = 1;
            @Override
            public void onClick(View view) {
                if (count <= 7) {
                    textteorver1.setText(teor_block[count]);
                    count ++;
                }
                else
                {
                    count = 0;
                    textteorver1.setText(teor_block[count]);

                }
            }
        });
        // загружаем текст
        //textteorver1.setText();
    }
}
