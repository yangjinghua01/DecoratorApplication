package com.example.decoratorapplication.simple2;

import android.util.Log;

public class StudentEat implements Eat {
    private Eat eat;
    public StudentEat(PersonEat eat) {
        this.eat = eat;
    }

    @Override
    public void eat() {
        Log.e("TAG", "点个菜");
        Log.e("TAG", "吃饭吃菜");
        Log.e("TAG", "盘子送回指定地点");
    }
}
