package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText editfirst, editsecond;
    Button btnadd, btnsubstract, btnmultiply, btndiv;
    TextView tvresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout);

        editfirst=(EditText) findViewById(R.id.editfirst);
        editsecond=(EditText) findViewById((R.id.editsecond));

        btnadd=(Button) findViewById(R.id.btnadd);
        btnsubstract=(Button) findViewById(R.id.btnsubstract);
        btnmultiply=(Button) findViewById(R.id.btnmultiply);
        btndiv=(Button) findViewById(R.id.btndiv);
        tvresult=(TextView) findViewById(R.id.tvresult);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first,second,result;
                first=Integer.valueOf(editfirst.getText().toString());
                second=Integer.valueOf(editsecond.getText().toString());
                result=first+second;
                tvresult.setText("Your result is"+result);

            }
        });
        btnsubstract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first,second,result;
                first=Integer.valueOf(editfirst.getText().toString());
                second=Integer.valueOf(editsecond.getText().toString());
                result=first-second;
                tvresult.setText("Your result is"+result);
            }
        });

        btnmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first,second,result;
                first=Integer.valueOf(editfirst.getText().toString());
                second=Integer.valueOf(editsecond.getText().toString());
                result=first*second;
                tvresult.setText("Your result is"+result);
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first,second,result;
                first=Integer.valueOf(editfirst.getText().toString());
                second=Integer.valueOf(editsecond.getText().toString());
                result=first/second;
                tvresult.setText("Your result is"+result);
            }
        });

    }
}
