package com.lawyee.celvmodel;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ToggleButton;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtn;
    private ToggleButton mToggleButton;
    private ToggleButton mToggleButton2;
    private ToggleButton mToggleButton3;
    private ToggleButton mToggleButton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
    }

    private void initView() {
        mBtn = (Button) findViewById(R.id.btn);

        mBtn.setOnClickListener(this);
        mToggleButton = (ToggleButton) findViewById(R.id.toggleButton);
        mToggleButton.setOnClickListener(this);
        mToggleButton2 = (ToggleButton) findViewById(R.id.toggleButton2);
        mToggleButton2.setOnClickListener(this);
        mToggleButton3 = (ToggleButton) findViewById(R.id.toggleButton3);
        mToggleButton3.setOnClickListener(this);
        mToggleButton4 = (ToggleButton) findViewById(R.id.toggleButton4);
        mToggleButton4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn:
                ObjectAnimator.ofFloat(mBtn, "translationX", mBtn.getWidth()).start();
                break;
            case R.id.toggleButton:
                ValueAnimator animator = ObjectAnimator.ofInt(mToggleButton, "backgroundColor", 0xffff8080, 0xff8080ff);
                animator.setDuration(3000);
                animator.setEvaluator(new ArgbEvaluator());
                animator.setRepeatCount(ValueAnimator.INFINITE);
                animator.setRepeatMode(ValueAnimator.RESTART);
                animator.start();
                break;
             case R.id.toggleButton2:
                 AnimatorSet set = new AnimatorSet();
                 set.playTogether(
                         ObjectAnimator.ofFloat(mToggleButton2,"rotationX",0,360),
                         ObjectAnimator.ofFloat(mToggleButton2,"rotationY",0,180),
                         ObjectAnimator.ofFloat(mToggleButton2,"rotation",0,-90),
                         ObjectAnimator.ofFloat(mToggleButton2,"translationX",0,90),
                         ObjectAnimator.ofFloat(mToggleButton2,"translationY",0,90),
                         ObjectAnimator.ofFloat(mToggleButton2,"scaleX",1,2f),
                         ObjectAnimator.ofFloat(mToggleButton2,"scaleY",1,0.5f),
                         ObjectAnimator.ofFloat(mToggleButton2,"alpha",1,0.25f,1)
                 );

                 set.setDuration(5*1000).start();

                 break;
            case R.id.toggleButton3:
                RotateAnimation animation = new RotateAnimation(0,720,mToggleButton3.getWidth(),mToggleButton3.getHeight()/2);
                animation.setDuration(3000);
                animation.setRepeatMode(ValueAnimator.RESTART);
                animation.setInterpolator(new AccelerateInterpolator());
                mToggleButton3.setAnimation(animation);
                break;
            case R.id.toggleButton4:
                break;
        }
    }
}
