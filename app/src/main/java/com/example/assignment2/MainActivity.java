package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView view1;
    TextView view2;
    EditText num1;
    EditText num2;
    Button btnadd;
    Button btnsub;
    private double val1 = Double.NaN;
    private double val2;
    private double results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view1 = findViewById(R.id.txtView);
        view2 = findViewById(R.id.txtView2);
        num1 = findViewById(R.id.txtNum1);
        num2 = findViewById(R.id.txtNum2);
        btnadd = findViewById(R.id.btnadd);
        btnsub = findViewById(R.id.btnsub);

        btnadd.setOnClickListener(this);
        btnsub.setOnClickListener(this);


    }

    public void calculate(){
        if (num1.getText().toString().trim().isEmpty() || num2.getText().toString().trim().isEmpty()) {
            Toast.makeText(MainActivity.this, "Input text", Toast.LENGTH_SHORT).show();
        } else {

            val1 = Double.parseDouble(num1.getText().toString());
            val2 = Double.parseDouble(num2.getText().toString());
            }
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnadd:
                calculate();
                results = val1 + val2;
                Toast.makeText(MainActivity.this, "Sum is " + String.valueOf(results), Toast.LENGTH_LONG).show();
                break;
            case R.id.btnsub:
                calculate();
                results = val1 - val2;
                Toast.makeText(MainActivity.this, "Difference is " + String.valueOf(results), Toast.LENGTH_LONG).show();
                break;
        }
    }
}