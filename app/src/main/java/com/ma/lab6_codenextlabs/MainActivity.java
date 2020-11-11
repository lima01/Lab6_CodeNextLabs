package com.ma.lab6_codenextlabs;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
    public void tbd(View view){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("More cool apps are coming!");
        alertDialogBuilder.setTitle("Code Next Lab");
        //alertDialogBuilder.setIcon(R.drawable.bulb);
        //alertDialogBuilder.setIcon(android.R.drawable.ic_delete);
        alertDialogBuilder.setIcon(android.R.drawable.ic_popup_disk_full);
        alertDialogBuilder.setPositiveButton("Cool", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Context context = getApplicationContext();
                CharSequence text = "Glad you are excited too!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        alertDialogBuilder.create().show();
    }
}