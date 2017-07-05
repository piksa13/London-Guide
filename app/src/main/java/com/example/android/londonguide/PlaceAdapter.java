package com.example.android.londonguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Anna on 10/06/2017.
 */

public class PlaceAdapter extends ArrayAdapter<Place>{

    private int mColorResourceId;
    public PlaceAdapter(@NonNull Activity context, ArrayList<Place> places, int colorResourceId) {
        super(context, 0, places);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        //Get the object located at this position in the list
        Place currentPlace = getItem(position);

        //Find the TextView in the list_item.xml layout with the header id
        TextView placeHeaderTextView = (TextView) convertView.findViewById(R.id.header_text_view);
        // Get the place header and set this text on the header TextView
        placeHeaderTextView.setText(currentPlace.getPlaceHeader());

        //Find the TextView in the list_item.xml layout with the desc id
        TextView placeDescTextView = (TextView) convertView.findViewById(R.id.desc_text_view);
        //Get the place desc and set this text on the number TextView
        placeDescTextView.setText(currentPlace.getPlaceDesc());

        //Find the ImageView in the list_item.xml layout with the image id
        ImageView imageView = (ImageView) convertView.findViewById(R.id.image);
        //Get the image resource id from the current object
        if (currentPlace.hasImage()) {
            //If an image is available, display the provided image based on the resource id
            imageView.setImageResource(currentPlace.getImageResourceId());
            //Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            //Otherwise provide audio based on resource id
            imageView.setImageResource(currentPlace.getAudioResourceId());
        }

        //Find the text container and set up the background color
        View textContainer = convertView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);
        //Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return convertView;
    }
}
