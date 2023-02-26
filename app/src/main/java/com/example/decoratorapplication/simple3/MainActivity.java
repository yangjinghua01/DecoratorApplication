package com.example.decoratorapplication.simple3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.decoratorapplication.R;
import com.example.decoratorapplication.simple1.TeacherEat;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TeacherEat teacherEat = new TeacherEat();
        teacherEat.eat();


        try {
            FileReader fileReader = new FileReader("xxxx.file");
            BufferedReader bfr = new BufferedReader(fileReader);
            bfr.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}