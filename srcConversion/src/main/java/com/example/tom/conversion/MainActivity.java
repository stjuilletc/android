package com.example.tom.conversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup rg1;
    private int num1=0;
    private RadioGroup rg2;
    private int num2=0;
    private EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et= (EditText) findViewById(R.id.editText);
        et.setText("0");
        rg1=(RadioGroup) findViewById(R.id.group1);
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.cl1:
                        num1 = 1;
                        break;
                    case R.id.litre1:
                        num1 = 3;
                        break;
                    case R.id.dl1:
                        num1 = 2;
                        break;
                    case R.id.ml1:
                        num1=0;
                        break;

                }
            }
        });

        rg2=(RadioGroup) findViewById(R.id.group2);
        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.cl2:
                        num2 = 1;
                        break;
                    case R.id.litre2:
                        num2 = 3;
                        break;
                    case R.id.dl2:
                        num2 = 2;
                        break;
                    case R.id.ml2:
                        num2=0;
                        break;

                }
            }
        });

    }


    public void resultat(View view) {
        TextView t = (TextView) findViewById(R.id.textView2) ;
        double f=Double.parseDouble(et.getText().toString());
        t.setText(Double.toString(f*Math.pow(10,num1-num2)));
    }
}
