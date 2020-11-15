package com.ma.lab6_codenextlabs;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void counter(View view){
        Intent intent = new Intent(this, CounterActivity.class);
        startActivity(intent);
    }
    public void randomNumber(View view){
        Intent intent = new Intent(this, RandomNumberActivity.class);
        startActivity(intent);
    }
    public void dice(View view){
        Intent intent = new Intent(this, DiceActivity.class);
        startActivity(intent);
    }
    public void tbd(View view){

        final EditText taskEditText = new EditText(getApplicationContext());

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Please enter your guess:")
                .setTitle("Guess the Random Number")
                .setView(taskEditText)
                .setIcon(android.R.drawable.ic_bulb)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Context context = getApplicationContext();
                CharSequence text = "Glad you are excited too!"
                        + " And you entered:" + taskEditText.getText().toString();
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        alertDialogBuilder.create().show();
    }
}