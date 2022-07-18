package com.example.confusion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;



import es.dmoral.toasty.Toasty;

public class Level11 extends AppCompatActivity {
    ImageView button, button2,button3,button4,button5,button6,button7,button8,button9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level11);

        button = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);
        button4 = findViewById(R.id.btn4);
        button5 = findViewById(R.id.btn5);
        button6 = findViewById(R.id.btn6);
        button7 = findViewById(R.id.btn7);
        button8 = findViewById(R.id.btn8);
        button9 = findViewById(R.id.btn9);

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toasty.success(getApplicationContext(),"Congrats",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(),Level12.class));

            }
        });

    }

    float x,y;
    float dx,dy;

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction()==MotionEvent.ACTION_DOWN){
            x = event.getX();
            y = event.getY();
        }

        if (event.getAction() == MotionEvent.ACTION_MOVE){
            dx = event.getX() - x;
            dy = event.getY() - y;

            button.setX(button.getX()+dx);
            button.setY(button.getY()+dy);
            button2.setX(button.getX()+dx);
            button2.setY(button.getY()+dy);
            button3.setX(button.getX()+dx);
            button3.setY(button.getY()+dy);
            button4.setX(button.getX()+dx);
            button4.setY(button.getY()+dy);
            button6.setX(button.getX()+dx);
            button6.setY(button.getY()+dy);
            button7.setX(button.getX()+dx);
            button7.setY(button.getY()+dy);
            button8.setX(button.getX()+dx);
            button8.setY(button.getY()+dy);
            button5.setX(button.getX()+dx);
            button5.setY(button.getY()+dy);


            x = event.getX();
            y = event.getY();

        }
        return super.onTouchEvent(event);
    }
}