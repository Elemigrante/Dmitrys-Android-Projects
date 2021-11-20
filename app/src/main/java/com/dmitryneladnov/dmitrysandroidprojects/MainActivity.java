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
                        R.drawable.getting_started
                ),
                new Project("Moti Quote App",
                        "Shows simple motivation quote",
                        R.drawable.quote
                ),
                new Project("BMI Calc",
                        "Calculate BMI and gives recommendations, checks age if someone is under 18. " +
                                "By making this app I learned about Variables, Methods and Conditional Logic",
                        R.drawable.calculator
                ),
                new Project("Unit Converter",
                        "A basic converter to convert inches to meters (made by my own)," +
                                " learning about Strings, Integers, Formatting, Parse int strings in to integers.",
                        R.drawable.tape
                ),
                new Project("The Dev Buffet",
                        "A menu app for a fictional restaurant," +
                                " learning about Activities, Classes & Objects, Arrays, Intents and ListView.",
                        R.drawable.dev_buffet
                ),
        };
    }
}