package com.mahesh.exampercent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import com.mahesh.exampercent.arithmetic.Arithmetic;

public class MainActivity extends AppCompatActivity {
    private EditText name, android_mark, iot_mark, webapi_mark;
    private Button btnCalculate;
    private TextView tvText;
    String fullname;
    int android, iot, webapi, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Binding  or add reference to the variable
        name = findViewById(R.id.name);
        android_mark = findViewById(R.id.android_mark);
        iot_mark = findViewById(R.id.iot_mark);
        webapi_mark = findViewById(R.id.webapi_mark);
        btnCalculate = findViewById(R.id.btnCalculate);
        tvText = findViewById(R.id.tvText);


//        Adding click listener on button
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(name.getText().toString())) {
                    name.setError("Enter Full Name");
                    name.requestFocus();
                    return;
                } else if (TextUtils.isEmpty(android_mark.getText().toString())) {
                    android_mark.setError("Enter Android mark");
                    android_mark.requestFocus();
                    return;
                } else if (TextUtils.isEmpty(iot_mark.getText().toString())) {
                    iot_mark.setError("Enter iot mark");
                    iot_mark.requestFocus();
                    return;
                } else if (TextUtils.isEmpty(webapi_mark.getText().toString())) {
                    webapi_mark.setError("Enter webapi mark");
                    webapi_mark.requestFocus();
                    return;
                }

                fullname = name.getText().toString();
                android = Integer.parseInt(android_mark.getText().toString());
                iot = Integer.parseInt(iot_mark.getText().toString());
                webapi = Integer.parseInt(webapi_mark.getText().toString());
                Arithmetic arithmetic = new Arithmetic(android, iot, webapi);
                result = arithmetic.percent();
                tvText.append("Full Name: " + fullname + " Percentage is: " + result + "\n");

//                to clear
                name.setText("");
                android_mark.setText("");
                iot_mark.setText("");
                webapi_mark.setText("");
            }
        });

    }


}
