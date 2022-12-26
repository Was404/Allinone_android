package com.example.myapplication4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class OperatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.operatsys_check);

        Button button_back, btn_next;
        button_back = (Button) findViewById(R.id.button_back);
        btn_next = (Button) findViewById(R.id.btn_next);

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OperatActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
