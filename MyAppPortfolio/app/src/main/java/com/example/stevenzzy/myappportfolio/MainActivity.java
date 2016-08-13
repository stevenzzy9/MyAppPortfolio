package com.example.stevenzzy.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v){

        String msg = "";

        switch (v.getId()) {
            case R.id.button01:
                msg = "popular movies";
                break;
            case R.id.button02:
                msg = "stock hawk";
                break;
            case R.id.button03:
                msg = "build it bigger";
                break;
            case R.id.button04:
                msg = "make your app material";
                break;
            case R.id.button05:
                msg = "go ubiquitous";
                break;
            case R.id.button06:
                msg = "capstone";
                break;
        }

        String result = "This button will launch my " + msg + " app!";
        Toast toast = Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT);
        toast.show();

    }

}
