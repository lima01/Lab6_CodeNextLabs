package com.ma.lab6_codenextlabs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class RandomNumberActivity extends AppCompatActivity {

    private static final String strNumbers[] = {"One", "Two", "Three", "Four", "Five", "Six"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_number);

        this.btnGenerate = findViewById(R.id.btnGenerate);

        this.txtNumber = findViewById(R.id.txtNumber);
    }

    public void onGenerate(View view){

        int random = new Random().nextInt(strNumbers.length);

        txtNumber.setText(strNumbers[random]);
    }

    private Button btnGenerate;
    private TextView txtNumber;
}