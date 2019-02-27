package com.example.androidanimations;

import android.animation.Animator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.faceIcon);
    }

    public void onButtonClick(View v) {
        imageView.animate()
                .scaleX(2)
                .scaleY(2)
                .rotationX(180)
                .translationX(200)
                .translationY(200)
                .setDuration(2000)
                .setListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animator) {
                        Log.i("Animation", "onAnimationStart: ");
                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        Log.i("Animation", "onAnimationEnd: ");
                    }

                    @Override
                    public void onAnimationCancel(Animator animator) {
                        Log.i("Animation", "onAnimationCancel: ");
                    }

                    @Override
                    public void onAnimationRepeat(Animator animator) {
                        Log.i("Animation", "onAnimationRepeat: ");
                    }
                });
    }
}
