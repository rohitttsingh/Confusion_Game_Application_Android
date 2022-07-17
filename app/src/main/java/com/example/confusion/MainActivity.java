package com.example.confusion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

EditText name,falsename;
AppCompatButton submit, falsesubmit;
    public static final String MyPREFERENCES = "MyPrefs" ;
    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name =findViewById(R.id.name);
        falsename = findViewById(R.id.falsename);
        submit=findViewById(R.id.submit);
        falsesubmit = findViewById(R.id.falsesubmit);
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        falsesubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(falsename.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"TRY AGAIN",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "HEY "+falsename.getText().toString()+" IT WORKED", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), Level1.class);

                    SharedPreferences.Editor editor = sharedpreferences.edit();
                    editor.putString("name",falsename.getText().toString());
                    editor.commit();

                    startActivity(intent);
                }
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"TRY AGAIN",Toast.LENGTH_LONG).show();

            }
        });

    }
}