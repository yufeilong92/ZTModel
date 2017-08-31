package com.lawyee.celvmodel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.lawyee.celvmodel.celu.BusStrategy;
import com.lawyee.celvmodel.celu.HandlerPrice;
import com.lawyee.celvmodel.celu.SubwayStrategy;
import com.lawyee.celvmodel.celu.TextStategy;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HandlerPrice price = new HandlerPrice();
        price.setStrategy(new BusStrategy());
        int price1 = price.getPrice(25);
        price.setStrategy(new SubwayStrategy());
        int price2 = price.getPrice(6);
        price.setStrategy(new TextStategy());
        int price3 = price.getPrice(6);
        Log.e("公交", "onCreate: "+price1 );
        Log.e("地铁", "onCreate: "+price2 );
        Log.e("出租", "onCreate: "+price3);
    }
}
