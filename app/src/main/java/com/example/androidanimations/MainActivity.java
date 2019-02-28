package com.example.androidanimations;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView =  findViewById(R.id.faceIcon);
    }

    public void onButtonClick(View v) {
        ObjectAnimator animatorX = ObjectAnimator.ofFloat(imageView, "scaleX", 1f, 2f)
                .setDuration(1000);

        ObjectAnimator animatorY = ObjectAnimator.ofFloat(imageView, "scaleY", 1f, 2f)
                .setDuration(1000);

        AnimatorSet animatorSet = new AnimatorSet();
//        animatorSet.playTogether(animatorX, animatorY); //pass in animator objects separated by comma or a list of animator objects

        animatorSet.playSequentially(animatorX, animatorY);

        animatorSet.setDuration(2500);

        animatorSet.start();
    }

}