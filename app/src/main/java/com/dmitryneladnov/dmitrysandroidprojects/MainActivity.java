package com.dmitryneladnov.dmitrysandroidprojects;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Project[] projects = {
                new Project("Getting Started App",
                        "First project, the default 'Hello World' app!",
                        5
                ),
                new Project("Moti Quote App",
                        "Shows simple motivation quote",
                        5
                ),
                new Project("BMI Calc",
                        "Calculate BMI and gives recommendations, checks age if someone is under 18. " +
                                "By making this app I learned about Variables, Methods and Conditional Logic",
                        5
                ),
                new Project("Unit Converter",
                        "A basic converter to convert inches to meters (made by my own)," +
                                " learning about Strings, Integers, Formatting, Parse int strings in to integers.",
                        5
                ),
                new Project("The Dev Buffet",
                        "A menu app for a fictional restaurant," +
                                " learning about Activities, Classes & Objects, Arrays, Intents and ListView.",
                        5
                ),
        };
    }
}