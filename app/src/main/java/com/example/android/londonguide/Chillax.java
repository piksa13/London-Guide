package com.example.android.londonguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * Created by Anna on 25/06/2017.
 */

public class Chillax extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        // An arrayList of places
        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.richmond_desc), getString(R.string.richmond), R.drawable.richmond));
        places.add(new Place(getString(R.string.isabella_desc), getString(R.string.isabella), R.drawable.isabella));
        places.add(new Place(getString(R.string.abney_desc), getString(R.string.abney), R.drawable.abney));
        places.add(new Place(getString(R.string.lavender_desc), getString(R.string.lavender), R.drawable.lavender));
        places.add(new Place(getString(R.string.hampstead_desc), getString(R.string.hampstead), R.drawable.hampstead));
        places.add(new Place(getString(R.string.primrose_desc), getString(R.string.primrose), R.drawable.primrose));
        places.add(new Place(getString(R.string.kyoto_desc), getString(R.string.kyoto), R.drawable.kyoto));

        PlaceAdapter adapter = new PlaceAdapter(this, places, R.color.colorAccent);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
