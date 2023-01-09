package com.example.myapplication4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class OperatActivity extends AppCompatActivity {

    Button button_back, btn_next;
    String[] operatsys_lec;
    TextView textoperat1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.operatsys_check);

        textoperat1 = (TextView) findViewById(R.id.textoperat1);
        button_back = (Button) findViewById(R.id.button_back);
        btn_next = (Button) findViewById(R.id.btn_next);
        operatsys_lec = getResources().getStringArray(R.array.operatsys_lec);

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OperatActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        textoperat1.setText(operatsys_lec[0]);

        btn_next.setOnClickListener(new View.OnClickListener() {
            int count = 1;
            @Override
            public void onClick(View view) {
                if (count <= 7) {
                    textoperat1.setText(operatsys_lec[count]);
                    count ++;
                }
                else
                {
                    count = 0;
                    textoperat1.setText(operatsys_lec[count]);

                }
            }
        });
    }
}
