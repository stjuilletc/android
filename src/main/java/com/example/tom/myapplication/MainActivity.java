package com.example.tom.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText a;
    private EditText b;
    private EditText c;
    private Button bouton;
    private TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        res=(TextView) findViewById(R.id.tv);
        a=(EditText) findViewById(R.id.etA);
        b=(EditText) findViewById(R.id.etB);
        c=(EditText) findViewById(R.id.etC);
        bouton = (Button) findViewById(R.id.button);
        bouton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View vue){
                float fa=Float.parseFloat(a.getText().toString());
                float fb=Float.parseFloat(b.getText().toString());
                float fc=Float.parseFloat(c.getText().toString());
                float fres=fb*fc/fa;
                String s=Float.toString(fres);
                res.setText(s);
            }
        });
    }
}
