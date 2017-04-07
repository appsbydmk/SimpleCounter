package com.appsbydmk.simplecounter;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {
    private TextView tvCounter;
    private int counterText = 0;
    private Random rnd = new Random();
    private int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCounter = (TextView) this.findViewById(R.id.tv_counter);
        tvCounter.setText(Integer.toString(counterText));
        tvCounter.setTextColor(color);
        tvCounter.setOnClickListener(this);
        tvCounter.setLongClickable(true);
        tvCounter.setOnLongClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (counterText <= 9999)
            tvCounter.setText(Integer.toString(++counterText));

    }

    @Override
    public boolean onLongClick(View v) {
        counterText = 0;
        tvCounter.setText(Integer.toString(counterText));
        return true;
    }
}
