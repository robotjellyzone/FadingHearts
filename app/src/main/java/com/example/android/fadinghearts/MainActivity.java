package com.example.android.fadinghearts;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageButton image1;
    private ImageButton image2;
    private ImageButton image3;
    private ImageButton image4;
    long animationDuration = 1000;
    //milliseconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image1 = (ImageButton) findViewById(R.id.imageButton3);
        image2 = (ImageButton) findViewById(R.id.imageButton4);
        image3 = (ImageButton) findViewById(R.id.imageButton5);
        image4 = (ImageButton) findViewById(R.id.imageButton6);
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void  firstImage(View view)
    { ObjectAnimator animatorY = ObjectAnimator.ofFloat(image1,"translationY",20f);             //start code of Animation for fading out with displacement
        animatorY.setDuration(animationDuration);
        ObjectAnimator alphaAnimation = ObjectAnimator.ofFloat(image1,View.ALPHA,1.0f,0.0f);       // end code of here of fading out with displacement
        alphaAnimation.setDuration(animationDuration);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animatorY,alphaAnimation);
        animatorSet.start();
        }


    public void secondImage(View view)
    {
        ObjectAnimator animatorY = ObjectAnimator.ofFloat(image2,"translationY",20f);             //start code of Animation for fading out with displacement
        animatorY.setDuration(animationDuration);
        ObjectAnimator alphaAnimation = ObjectAnimator.ofFloat(image2,View.ALPHA,1.0f,0.0f);       // end code of here of fading out with displacement
        alphaAnimation.setDuration(animationDuration);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animatorY,alphaAnimation);
        animatorSet.start();

    }
    public void thirdImage(View view)
    {
        ObjectAnimator animatorY = ObjectAnimator.ofFloat(image3,"translationY",20f);             //start code of Animation for fading out with displacement
        animatorY.setDuration(animationDuration);
        ObjectAnimator alphaAnimation = ObjectAnimator.ofFloat(image3,View.ALPHA,1.0f,0.0f);       // end code of here of fading out with displacement
        alphaAnimation.setDuration(animationDuration);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animatorY,alphaAnimation);
        animatorSet.start();
    }
    public void fourthImage(View view)
    {
        ObjectAnimator animatorY = ObjectAnimator.ofFloat(image4,"translationY",20f);             //start code of Animation for fading out with displacement
        animatorY.setDuration(animationDuration);
        ObjectAnimator alphaAnimation = ObjectAnimator.ofFloat(image4,View.ALPHA,1.0f,0.0f);       // end code of here of fading out with displacement
        alphaAnimation.setDuration(animationDuration);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animatorY,alphaAnimation);
        animatorSet.start();

    }
}
