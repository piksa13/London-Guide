package com.example.android.londonguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Anna on 10/06/2017.
 */

public class HiddenAttractions extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        // An arrayList of places
        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.bank_desc), getString(R.string.bank), R.drawable.gold));
        places.add(new Place(getString(R.string.beefeaters_desc), getString(R.string.beefeaters), R.drawable.beefeaters));
        places.add(new Place(getString(R.string.harry_potter_desc), getString(R.string.harry_potter), R.drawable.spider));
        places.add(new Place(getString(R.string.venice_desc), getString(R.string.venice), R.drawable.venice));
        places.add(new Place(getString(R.string.windmill_desc), getString(R.string.windmill), R.drawable.windmill));
        places.add(new Place(getString(R.string.temple_desc), getString(R.string.temple), R.drawable.temple));
        places.add(new Place(getString(R.string.church_desc), getString(R.string.church), R.drawable.church));

        PlaceAdapter adapter = new PlaceAdapter(this, places, R.color.colorAccent);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
