package com.darshanthakral.currencyconversion;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {

    Button euro, pound, dollar, yen, dinar, crypto, ruble, ausdollar, candollar;
    TextView textView;
    EditText editText;

    public static final double eu = 0.011, po = 0.0097, dlr = 0.013, yn = 1.47, dinr = 0.0041, ru = 1.01, ausdlr = 0.017, candlr = 0.017, btc = 0.00000024;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        euro = findViewById(R.id.euro);
        pound = findViewById(R.id.pound);
        dollar = findViewById(R.id.dollar);
        yen = findViewById(R.id.yen);
        dinar = findViewById(R.id.dinar);

        crypto = findViewById(R.id.crypto);

        ruble = findViewById(R.id.ruble);
        ausdollar = findViewById(R.id.ausdollar);
        candollar = findViewById(R.id.candollar);

        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);


        euro.setOnClickListener(v -> {

            String str = editText.getText().toString(); //Make sure that value cam from edit text is string

            if (TextUtils.isEmpty(str)) {
                editText.setError("Empty user input!");
            } else {

                double num, result;

                num = Double.parseDouble(str); // converts the string into double value
                textView.setText(null);

                result = num * eu;

                DecimalFormat decimalFormat = new DecimalFormat("#.000000"); // Gives answer up to 2 decimal places.
                textView.setText("" + decimalFormat.format(result)); //Display
            }
        });

        pound.setOnClickListener(vb ->{

            String str = editText.getText().toString(); //Make sure that value cam from edit text is string

            if (TextUtils.isEmpty(str)) {
                editText.setError("Empty user input!");
            } else {

                double num, result;

                num = Double.parseDouble(str); // converts the string into double value
                textView.setText(null);

                result = num * po;

                DecimalFormat decimalFormat = new DecimalFormat("#.000000"); // Gives answer up to 2 decimal places.
                textView.setText("" + decimalFormat.format(result)); //Display
            }

        });

        dollar.setOnClickListener(v -> {

            String str = editText.getText().toString(); //Make sure that value cam from edit text is string

            if (TextUtils.isEmpty(str)) {
                editText.setError("Empty user input!");
            } else {

                double num, result;

                num = Double.parseDouble(str); // converts the string into double value
                textView.setText(null);

                result = num * dlr;

                DecimalFormat decimalFormat = new DecimalFormat("#.000000"); // Gives answer up to 2 decimal places.
                textView.setText("" + decimalFormat.format(result)); //Display
            }

        });

        yen.setOnClickListener(v -> {

            String str = editText.getText().toString(); //Make sure that value cam from edit text is string

            if (TextUtils.isEmpty(str)) {
                editText.setError("Empty user input!");
            } else {

                double num, result;

                num = Double.parseDouble(str); // converts the string into double value
                textView.setText(null);

                result = num * yn;

                DecimalFormat decimalFormat = new DecimalFormat("#.000000"); // Gives answer up to 2 decimal places.
                textView.setText("" + decimalFormat.format(result)); //Display
            }

        });

        dinar.setOnClickListener(v -> {

            String str = editText.getText().toString(); //Make sure that value cam from edit text is string

            if (TextUtils.isEmpty(str)) {
                editText.setError("Empty user input!");
            } else {

                double num, result;

                num = Double.parseDouble(str); // converts the string into double value
                textView.setText(null);

                result = num * dinr;

                DecimalFormat decimalFormat = new DecimalFormat("#.000000"); // Gives answer up to 2 decimal places.
                textView.setText("" + decimalFormat.format(result)); //Display
            }

        });

        ruble.setOnClickListener(v -> {

            String str = editText.getText().toString(); //Make sure that value cam from edit text is string

            if (TextUtils.isEmpty(str)) {
                editText.setError("Empty user input!");
            } else {

                double num, result;

                num = Double.parseDouble(str); // converts the string into double value
                textView.setText(null);

                result = num * ru;

                DecimalFormat decimalFormat = new DecimalFormat("#.000000"); // Gives answer up to 2 decimal places.
                textView.setText("" + decimalFormat.format(result)); //Display
            }
        });

        ausdollar.setOnClickListener(v -> {

            String str = editText.getText().toString(); //Make sure that value cam from edit text is string

            if (TextUtils.isEmpty(str)) {
                editText.setError("Empty user input!");
            } else {

                double num, result;

                num = Double.parseDouble(str); // converts the string into double value
                textView.setText(null);

                result = num * ausdlr;

                DecimalFormat decimalFormat = new DecimalFormat("#.000000"); // Gives answer up to 2 decimal places.
                textView.setText("" + decimalFormat.format(result)); //Display
            }
        });

        candollar.setOnClickListener(v -> {

            String str = editText.getText().toString(); //Make sure that value cam from edit text is string

            if (TextUtils.isEmpty(str)) {
                editText.setError("Empty user input!");
            } else {

                double num, result;

                num = Double.parseDouble(str); // converts the string into double value
                textView.setText(null);

                result = num * candlr;

                DecimalFormat decimalFormat = new DecimalFormat("#.000000"); // Gives answer up to 2 decimal places.
                textView.setText("" + decimalFormat.format(result)); //Display
            }
        });

        crypto.setOnClickListener(v -> {

            String str = editText.getText().toString(); //Make sure that value cam from edit text is string

            if (TextUtils.isEmpty(str)) {
                editText.setError("Empty user input!");
            } else {

                double num, result;

                num = Double.parseDouble(str); // converts the string into double value

                if(num < 100){

                    editText.setError("Value should be greater than or equal to  100");
                    return;
                }
                textView.setText(null);

                result = num * btc;

                DecimalFormat decimalFormat = new DecimalFormat("#.00000000"); // Gives answer up to 6 decimal places.
                textView.setText("" + decimalFormat.format(result)); //Display
            }

        });
    }
}