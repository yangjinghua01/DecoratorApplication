package com.example.decoratorapplication.simple2;

import android.util.Log;

public class TeacherEat implements Eat {
    private Eat eat;
    public TeacherEat(PersonEat eat) {
        this.eat = eat;
    }
    @Override
    public void eat() {
        Log.e("TAG", "喝个汤");
        Log.e("TAG", "点个菜");
        eat();
        Log.e("TAG", "人吃饭");

    }
}
