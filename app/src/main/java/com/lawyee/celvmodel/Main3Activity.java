package com.lawyee.celvmodel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.lawyee.celvmodel.tv.TvContoller;
import com.lawyee.celvmodel.tv.TvController;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {

    private Button mButton;
    private Button mButton2;
    private Button mButton3;
    private TvController tvController;
    private Button mButton4;
    private Button mButton5;
    private Button mButton6;
    private Button mButton7;
    private TvContoller contoller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        initView();
        tvController = new TvController();
        contoller = new TvContoller();
    }

    private void initView() {
        mButton = (Button) findViewById(R.id.button);
        mButton2 = (Button) findViewById(R.id.button2);
        mButton3 = (Button) findViewById(R.id.button3);

        mButton.setOnClickListener(this);
        mButton2.setOnClickListener(this);
        mButton3.setOnClickListener(this);
        mButton4 = (Button) findViewById(R.id.button4);
        mButton4.setOnClickListener(this);
        mButton5 = (Button) findViewById(R.id.button5);
        mButton5.setOnClickListener(this);
        mButton6 = (Button) findViewById(R.id.button6);
        mButton6.setOnClickListener(this);
        mButton7 = (Button) findViewById(R.id.button7);
        mButton7.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:

                tvController.poweron();

                break;
            case R.id.button2:
                tvController.powerOff();
                break;
            case R.id.button3:
                tvController.nextChannel();
                tvController.prevChannel();
                break;
            case R.id.button4:
                contoller.powerON();
                break;
            case R.id.button5:
                contoller.powerOff();
                break;
            case R.id.button6:
                contoller.turnDown();
                contoller.turnUp();
                contoller.prevChannel();
                contoller.nextChannel();
                break;
            case R.id.button7:
                contoller.turnDown();
                contoller.turnUp();
                contoller.prevChannel();
                contoller.nextChannel();
                break;
        }
    }
}
