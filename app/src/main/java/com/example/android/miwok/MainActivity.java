/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //on click listener for number text view
        TextView numbers = (TextView) findViewById(R.id.numbers);
        if(numbers != null) {
            numbers.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(MainActivity.this, NumbersActivity.class);
                    startActivity(i);
                }
            });
        }

        //on click listener for color text view
        TextView color = (TextView) findViewById(R.id.colors);
        if(color != null) {
            color.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(MainActivity.this, ColorsActivity.class);
                    startActivity(i);
                }
            });
        }

        //on click listener for family members text view
        TextView family = (TextView) findViewById(R.id.family);
        if(family != null) {
            family.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(MainActivity.this, FamilyActivity.class);
                    startActivity(i);
                }
            });
        }

        //on click listener for phrases text view
        TextView phrases = (TextView) findViewById(R.id.phrases);
        if(phrases != null) {
            phrases.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(MainActivity.this, PhrasesActivity.class);
                    startActivity(i);
                }
            });
        }
    }
}
