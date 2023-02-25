package com.example.decoratorapplication.simple1;

import android.util.Log;

public class StudentEat implements Eat {
    @Override
    public void eat() {
        Log.e("TAG", "点个菜");
        Log.e("TAG", "吃饭吃菜");
        Log.e("TAG", "盘子送回指定地点");
    }
}
