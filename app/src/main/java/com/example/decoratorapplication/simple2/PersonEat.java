package com.example.decoratorapplication.simple2;

import android.util.Log;

public class PersonEat implements Eat {

    @Override
    public void eat() {
        Log.e("TAG", "点个菜" );
        Log.e("TAG", "人吃饭吃菜");
        Log.e("TAG", "盘子送回指定的地点" );
    }
}
