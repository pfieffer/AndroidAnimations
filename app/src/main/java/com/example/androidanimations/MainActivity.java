package com.example.androidanimations;

import android.animation.ValueAnimator;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ScrollView mScroll;
    private TextView mLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//      Initialize the logging components
        mScroll =  findViewById(R.id.scrollLog);
        mLog =  findViewById(R.id.tvLog);
        mLog.setText("");

    }

    public void onRunBtnClick(View v) {
        ValueAnimator animator = ValueAnimator.ofFloat(1f, 20f)
                .setDuration(2000);

        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                displayMessage("timeStamp: "+valueAnimator.getCurrentPlayTime() + ", value:"+ valueAnimator.getAnimatedValue());
            }
        });

        animator.setRepeatCount(1); // repeats the animation again, ie run for a total of two times
//        animator.setRepeatCount(ValueAnimator.INFINITE); //infinite animation
        //animator.setRepeatMode(ValueAnimator.REVERSE);

        animator.start();
    }

    public void onClearBtnClick(View v) {
        mLog.setText("");
        mScroll.scrollTo(0, mScroll.getBottom());
    }

    public void displayMessage(String message) {
        mLog.append(message + "\n");
        mScroll.scrollTo(0, mScroll.getBottom());
    }
}