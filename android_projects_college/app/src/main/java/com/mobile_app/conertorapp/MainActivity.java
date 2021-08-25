package com.mobile_app.conertorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button convertBtn = findViewById(R.id.convertBtn);
        final EditText inputField=findViewById(R.id.input);
        final TextView convertor_output = findViewById(R.id.result);

        final View.OnClickListener convertorListener=(v)->{
            if(!(inputField.getHint().equals("Input"))){
                convertor_output.setText("hi");
            }

        };
        convertBtn.setOnClickListener(convertorListener);
    }

}