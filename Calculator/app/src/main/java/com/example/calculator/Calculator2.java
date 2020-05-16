package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator2 extends AppCompatActivity implements View.OnClickListener {
    EditText editfirst, editsecond;
    Button btnadd, btnsubstract, btnmultiply, btndiv;
    TextView tvresult;
    float first, second, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout);
        editfirst = (EditText) findViewById(R.id.editfirst);
        editsecond = (EditText) findViewById((R.id.editsecond));

        btnadd = (Button) findViewById(R.id.btnadd);
        btnsubstract = (Button) findViewById(R.id.btnsubstract);
        btnmultiply = (Button) findViewById(R.id.btnmultiply);
        btndiv = (Button) findViewById(R.id.btndiv);
        tvresult = (TextView) findViewById(R.id.tvresult);
        btnadd.setOnClickListener(this);
        btnsubstract.setOnClickListener(this);
        btnmultiply.setOnClickListener(this);
        btndiv.setOnClickListener(this);

    }


    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btnadd:
                first=Float.valueOf(editfirst.getText().toString());
                second=Float.valueOf(editsecond.getText().toString());
                result=first+second;
                tvresult.setText("Your result is"+result);
                break;

            case R.id.btnsubstract:

                first=Float.valueOf(editfirst.getText().toString());
                second=Float.valueOf(editsecond.getText().toString());
                result=first-second;
                tvresult.setText("Your result is"+result);
                break;

            case R.id.btnmultiply:
                first=Float.valueOf(editfirst.getText().toString());
                second=Float.valueOf(editsecond.getText().toString());
                result=first*second;
                tvresult.setText("Your result is"+result);

                break;

            case R.id.btndiv:
                first=Float.valueOf(editfirst.getText().toString());
                second=Float.valueOf(editsecond.getText().toString());
                result=first/second;
                tvresult.setText("Your result is = "+result);
                break;



        }
    }
}
