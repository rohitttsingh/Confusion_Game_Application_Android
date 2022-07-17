package com.example.confusion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Level4 extends AppCompatActivity {

    Toolbar toolbar;
    public static final String MyPREFERENCES = "MyPrefs" ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level4);

        toolbar = findViewById(R.id.toolbar);

        SharedPreferences sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        String a = sharedpreferences.getString("name",null);
        toolbar.setSubtitle("Player: "+a);
    }
    public void notwork(View view) {
        Toast.makeText(getApplicationContext(),"TRY TRY BUT DON'T CRY",Toast.LENGTH_SHORT).show();
    }

    public void worked(View view) {
        Toast.makeText(getApplicationContext(),"CONGRATS, BICYCLE IS THE ONLY NON FUELED VEHICLE",Toast.LENGTH_SHORT).show();

        startActivity(new Intent(getApplicationContext(),Level5.class));
    }
}