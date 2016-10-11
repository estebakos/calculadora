package com.calculadora.implementation.calc.controller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import com.calculadora.R;
import com.calculadora.implementation.calc.bussinessLayer.CalcBl;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, Switch.OnCheckedChangeListener {

    private EditText etFirstNumber, etSecondNumber;
    //private Button btnCalc;
    private CalcBl calcBl;
    private Switch swAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFirstNumber = (EditText) findViewById(R.id.etFirstNumber);
        etSecondNumber = (EditText) findViewById(R.id.etSecondNumber);
        swAdd = (Switch) findViewById(R.id.swAdd);
        swAdd.setOnCheckedChangeListener(this);


        //btnCalc = (Button) findViewById(R.id.btnCalc);
        //btnCalc.setOnClickListener(this);
        calcBl = new CalcBl();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnCalc:
                break;
            default:
                break;
        }
    }

    private void calc(View v) {
        int result = calcBl.add(etFirstNumber.getText().toString(), etSecondNumber.getText().toString());
        switch (result) {
            case 0:
                break;
            default:
                Toast.makeText(this, getString(R.string.str_result_label) + result, Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()) {
            case R.id.swAdd:
                if (isChecked) {
                    Toast.makeText(this, getString(R.string.str_is_checked), Toast.LENGTH_SHORT).show();
                }
                break;
            default:
                break;
        }
    }
}
