package com.example.android.londonguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Anna on 25/06/2017.
 */

public class BestMarkets extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        // An arrayList of places
        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.brick_lane_desc), getString(R.string.brick_lane), R.drawable.brick));
        places.add(new Place(getString(R.string.portobello_desc), getString(R.string.portobello_road), R.drawable.portobello));
        places.add(new Place(getString(R.string.camden_desc), getString(R.string.camden), R.drawable.camden));
        places.add(new Place(getString(R.string.spitalfields_desc), getString(R.string.spitalfields), R.drawable.spitalfields));
        places.add(new Place(getString(R.string.greenwich_desc), getString(R.string.greenwich), R.drawable.greenwich));
        places.add(new Place(getString(R.string.coven_desc), getString(R.string.coven), R.drawable.coven));
        places.add(new Place(getString(R.string.alfies_desc), getString(R.string.alfies), R.drawable.alfies));

        PlaceAdapter adapter = new PlaceAdapter(this, places, R.color.colorAccent);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
