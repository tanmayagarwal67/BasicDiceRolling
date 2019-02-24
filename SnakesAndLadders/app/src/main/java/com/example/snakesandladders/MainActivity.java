package com.example.snakesandladders;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int[] img= {R.drawable.one,
            R.drawable.two,
            R.drawable.three,
            R.drawable.four,
            R.drawable.five,
            R.drawable.six,
    };
    public void RollTapped(View view) {
        Log.i("button", "buttonTapped");

        Random ran = new Random();
        int randomNumber = ran.nextInt(6);

        Log.i("random", "random number is" + " " + randomNumber);
        ImageView dice1 = (ImageView) findViewById(R.id.dice);
        dice1.setImageResource(img[randomNumber]);




    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
