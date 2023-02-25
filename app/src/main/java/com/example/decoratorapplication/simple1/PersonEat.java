package com.example.decoratorapplication.simple1;

import android.util.Log;

import com.example.decoratorapplication.simple1.Eat;

public class PersonEat implements Eat {

    @Override
    public void eat() {
        Log.e("TAG", "点个菜" );
        Log.e("TAG", "人吃饭吃菜");
        Log.e("TAG", "盘子送回指定的地点" );
    }
}
