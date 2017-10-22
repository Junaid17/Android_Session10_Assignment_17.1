package com.example.jmush.android_session17_assignment_171;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button play,stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * Button initialisation
         */

            play = (Button)findViewById(R.id.button1);
            play.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    /**
                     * StartService using intent
                     */
                    Intent myIntent = new Intent(MainActivity.this, MyService.class);
                    startService(myIntent);
                }
            });

            stop=(Button)findViewById(R.id.button2);
            stop.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    /**
                     * StopService using intent
                     */
                    Intent myIntent = new Intent(MainActivity.this, MyService.class);
                    stopService(myIntent);
                }
            });

        }
    }

