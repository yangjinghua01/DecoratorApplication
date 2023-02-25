package com.example.decoratorapplication.simple1;

import android.util.Log;

import com.example.decoratorapplication.simple1.Eat;

public class TeacherEat implements Eat {
    @Override
    public void eat() {
        Log.e("TAG", "喝个汤");
        Log.e("TAG", "点个菜");
        Log.e("TAG", "人吃饭");

    }
}
