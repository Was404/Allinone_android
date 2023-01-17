package com.example.myapplication4;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ThemeUtils;

public class SettigsActivity extends AppCompatActivity {
    TextView mygithub;
    Button button_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        mygithub = (TextView) findViewById(R.id.mygithub);
        button_back = (Button) findViewById(R.id.button_back);

        String textToFirsturl = "Project on github";
        SpannableString ss = new SpannableString(textToFirsturl);
        ss.setSpan(new URLSpan(String.valueOf(mygithub)), 0, mygithub.length(),
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        mygithub.setText(ss);

        String dynamicUrl = "https://github.com/Was404/Allinone_android";
        String linkedText = String.format(
                "<a href=\"%s\">https://github.com/Was404/Allinone_android</a> ", dynamicUrl);
        mygithub.setText(Html.fromHtml(linkedText));
        mygithub.setMovementMethod(LinkMovementMethod.getInstance());

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettigsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
