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

public class Level5 extends AppCompatActivity {
    Toolbar toolbar;
    public static final String MyPREFERENCES = "MyPrefs" ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level5);
        toolbar = findViewById(R.id.toolbar);

        SharedPreferences sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        String a = sharedpreferences.getString("name",null);
        toolbar.setSubtitle("Player: "+a);
    }
    public void notwork(View view) {
        Toasty.error(getApplicationContext(),"TRY TRY BUT DON'T CRY",Toast.LENGTH_SHORT).show();
    }

    public void worked(View view) {
        Toasty.success(getApplicationContext(),"CONGRATS, 125 is the only perfect cube",Toast.LENGTH_LONG).show();

        startActivity(new Intent(getApplicationContext(),Level6.class));
    }
}