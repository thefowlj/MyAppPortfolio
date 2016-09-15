package com.fowlj.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked(View view) {
        int id =  view.getId();
        Toast buttonToast;

        switch(id) {
            case R.id.popularMoviesButton:
                buttonToast = Toast.makeText(this, "This button will launch my Popular Movies app!", Toast.LENGTH_SHORT);
                break;

            case R.id.stockHawkButton:
                buttonToast = Toast.makeText(this, "This button will launch my Stock Hawk app!", Toast.LENGTH_SHORT);
                break;

            case R.id.buildItBiggerButton:
                buttonToast = Toast.makeText(this, "This button will launch my Build it Bigger app!", Toast.LENGTH_SHORT);
                break;

            case R.id.makeYourAppMaterialButton:
                buttonToast = Toast.makeText(this, "This button will launch my Make Your App Material app!", Toast.LENGTH_SHORT);
                break;

            case R.id.goUbiquitousButton:
                buttonToast = Toast.makeText(this, "This button will launch my Go Ubiquitous app!", Toast.LENGTH_SHORT);
                break;

            case R.id.capstoneButton:
                buttonToast = Toast.makeText(this, "This button will launch my Capstone app!", Toast.LENGTH_SHORT);
                break;

            default:
                buttonToast = Toast.makeText(this, "Don't blame the programmer, but something went wrong here...", Toast.LENGTH_SHORT);
                break;
        }

        buttonToast.show();

    }
}
