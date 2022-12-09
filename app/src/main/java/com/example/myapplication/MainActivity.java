package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewLessonWidget viewLessonWidget;
    ViewLessonWidget viewLessonWidget1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewLessonWidget = findViewById(R.id.lesson1);
        viewLessonWidget.setName("Present Simple");
        viewLessonWidget.setInformation("Peresent simple is ...");

        viewLessonWidget1 = findViewById(R.id.lesson2);
        viewLessonWidget1.setName("Past Simple");
        viewLessonWidget1.setInformation("Past simple is ...");

        viewLessonWidget1 = findViewById(R.id.lesson3);
        viewLessonWidget1.setName("Future Simple");
        viewLessonWidget1.setInformation("Future simple is ...");

        viewLessonWidget1 = findViewById(R.id.lesson4);
        viewLessonWidget1.setName("Present continuous");
        viewLessonWidget1.setInformation("Present continuous is ...");

        viewLessonWidget1 = findViewById(R.id.lesson5);
        viewLessonWidget1.setName("Past continuous");
        viewLessonWidget1.setInformation("Past continuous is ...");



    }
}