package com.example.decoratorapplication.simple3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.decoratorapplication.R;
import com.example.decoratorapplication.simple1.TeacherEat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TeacherEat teacherEat = new TeacherEat();
        teacherEat.eat();
    }
}