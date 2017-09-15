package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ansButton = (Button) findViewById(R.id.answerButton);

        final ImageView ballDisplay = (ImageView) findViewById(R.id.image8BallAnswer);

        final int[] answerArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        ansButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomNumberGenerator = new Random();

                int ansNumber = randomNumberGenerator.nextInt(4);

                ballDisplay.setImageResource(answerArray[ansNumber]);
            }
        });

    }
}
