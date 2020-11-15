package com.ma.lab6_codenextlabs;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.opengl.Visibility;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class GuessNumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess_number);
        this.txtResult = findViewById(R.id.txtResult);
        this.number = new Random().nextInt(10);
        this.btnGuess = findViewById(R.id.btnGuess);
    }

    private void tryNum(int guessedNum){
        if ( guessedNum == this.number ){
            txtResult.setText("You are right! The number is:" + this.number + "!");
            this.btnGuess.setVisibility(View.GONE);
        }
        else if ( guessedNum > this.number ) {
            txtResult.setText("Sorry, it's too big. Please try again");
        }
        else {
            txtResult.setText("Oops, it's too small. Please try again");
        }
    }
    public void guess(View view){
        final EditText txtGuess = new EditText(this);
        txtGuess.setInputType(InputType.TYPE_CLASS_NUMBER);

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("Please enter your guess")
                .setView(txtGuess)
                .setPositiveButton("Try", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            try{
                                int guessedNum = Integer.parseInt(txtGuess.getText().toString());
                                tryNum(guessedNum);
                            }
                            catch(Exception e){
                                Toast.makeText(getApplicationContext(), "Opps, bad number!", Toast.LENGTH_SHORT)
                                        .show();
                            }
                        }
                })
                .create().show();
    }
    private int number;
    private TextView txtResult;
    private Button btnGuess;
}