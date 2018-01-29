package com.example.ambikesh.exp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void exp(View view)
    {
        et1=findViewById(R.id.t1);
        et2=findViewById(R.id.t2);
        Intent i = new Intent(MainActivity.this,exp.class);
        Bundle b = new Bundle();
        i.putExtra("k1",et1.getText().toString());
        i.putExtra("k2",et2.getText().toString());
        startActivity(i);
    }
}
