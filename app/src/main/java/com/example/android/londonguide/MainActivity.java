package com.example.android.londonguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the Hidden Attractions
        FrameLayout hidden = (FrameLayout) findViewById(R.id.hidden_attarctions);

        // Set a click listener on Hidden Attractions View
        hidden.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the hidden View is clicked on.
            @Override
            public void onClick(View view) {
                Intent attractionsIntent = new Intent(MainActivity.this, HiddenAttractions.class);
                startActivity(attractionsIntent);
            }
        });

         // Find the View that shows the Experience London 4free
         FrameLayout free = (FrameLayout) findViewById(R.id.free_london);

         // Set a click listener on xperience London 4free View
         free.setOnClickListener(new View.OnClickListener() {
         // The code in this method will be executed when the Free London View is clicked on.
         @Override
         public void onClick(View view) {
         Intent freeIntent = new Intent(MainActivity.this, FreeLondon.class);
         startActivity(freeIntent);
         }
         });

        //Find the View that shows the Chillax
        FrameLayout chillax = (FrameLayout) findViewById(R.id.chillax);

        // Set a click listener on Chillax View
        chillax.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the chillax View is clicked on.
            @Override
            public void onClick(View view) {
                Intent chillaxIntent = new Intent(MainActivity.this, Chillax.class);
                startActivity(chillaxIntent);
            }
        });

         // Find the View that shows the Best Markets
        FrameLayout markets = (FrameLayout) findViewById(R.id.markets);

        // Set a click listener on Best Markets View
        markets.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Best Market View is clicked on.
            @Override
            public void onClick(View view) {
                Intent marketsIntent = new Intent(MainActivity.this, BestMarkets.class);
                startActivity(marketsIntent);
            }
        });
    }
}