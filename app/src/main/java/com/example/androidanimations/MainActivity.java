package com.example.androidanimations;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private RelativeLayout canvas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView =  findViewById(R.id.faceIcon);
        canvas = findViewById(R.id.animationCanvas);
    }

    public void onButtonClick(View v) {
        int screenHeight = canvas.getHeight();
        int targetY = screenHeight - imageView.getHeight();

        ObjectAnimator animator = ObjectAnimator.ofFloat(
                imageView, "y", 0, targetY)
                .setDuration(1000);

        animator.setInterpolator(new BounceInterpolator()); //AnticipateOvershootInterpolator, LinearInterpolator

        animator.start();
    }

}