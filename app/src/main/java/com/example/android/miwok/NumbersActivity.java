package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //create array of words
        ArrayList<String> words =new ArrayList<>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        // Find the root view so we can add child views to it
        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);

        // Create a variable to keep track of the current index position
        int index =0;

        // Keep looping until we've reached the end of the list (which means keep looping
        // as long as the current index position is less than the length of the list)
        while(index < words.size()){
            TextView childView = new TextView(this);
            childView.setText(words.get(index));
            rootView.addView(childView);
            index++;
        }

    }
}
