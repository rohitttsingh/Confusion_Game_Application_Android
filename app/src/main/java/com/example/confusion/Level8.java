package com.example.confusion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class Level8 extends AppCompatActivity {
    Toolbar toolbar;
    public static final String MyPREFERENCES = "MyPrefs" ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level8);
        toolbar = findViewById(R.id.toolbar);

        SharedPreferences sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        String a = sharedpreferences.getString("name",null);
        toolbar.setSubtitle("Player: "+a);
    }
    public void notwork(View view) {
        Toasty.error(getApplicationContext(),"TRY TRY BUT DON'T CRY",Toast.LENGTH_SHORT).show();
    }

    public void worked(View view) {
        Toasty.success(getApplicationContext(),"CONGRATS, Alternate numbers are divided by 2",Toast.LENGTH_LONG).show();

        startActivity(new Intent(getApplicationContext(),Level9.class));
    }
}