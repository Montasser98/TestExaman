package com.example.testexaman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
     EditText t1,t2,t3;
     RadioGroup rg;
     Button b1;
     RadioButton r1,r2,r3,r4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        b1=findViewById(R.id.b1);
        rg=findViewById(R.id.rg);
        r1=findViewById(R.id.r1);
        r2=findViewById(R.id.r2);
        r3=findViewById(R.id.r3);
        r4=findViewById(R.id.r4);


    }

    public void click(View view) {
        float a=Float.valueOf(t2.getText().toString());
        float b=Float.valueOf(t1.getText().toString());
        float c=0;

        if(r1.isChecked()) {
            c=a+b;
        }
        if(r2.isChecked()){
            c=a-b;
        }
        if(r3.isChecked()){
            c=a*b;
        }
        if(r4.isChecked()){
            if(a<b){
            c=a/b;
            }
            else {
                Toast.makeText(MainActivity.this,"C'ant meke this calcule",Toast.LENGTH_LONG).show();

            }
            }
        t3.setText(c+"");
        }

    public void vide(View view) {
        r1.setChecked(true);
        t1.getText().clear();
        t2.getText().clear();
        t3.getText().clear();
        t1.requestFocus();
    }
}
