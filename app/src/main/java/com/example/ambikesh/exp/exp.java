package com.example.ambikesh.exp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class exp extends AppCompatActivity {
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exp);
        init();
    }
    public void init()
    {
        Intent i= getIntent();
        String a = i.getStringExtra("k1");
        String b = i.getStringExtra("k2");
        t1.setText(a);
        t2.setText(b);
    }
}
