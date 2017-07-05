package com.example.android.londonguide;

/**
 * Created by Anna on 10/06/2017.
 */

public class Place {

    //States
    private String mPlaceDesc;
    private String mPlaceHeader;

    //Constant value that represents no image, no audio provided for this place
    private static final int NOT_PROVIDED = -1;

    //Image and audio resource id for the place
    private int mImageResourceId = NOT_PROVIDED;
    private int mAudioResourceId = NOT_PROVIDED;

    //Constructor with audio
    public Place(int AudioResourceId, String PlaceDesc, String PlaceHeader) {
        mAudioResourceId = AudioResourceId;
        mPlaceDesc = PlaceDesc;
        mPlaceHeader = PlaceHeader;
    }

    //Constructor with image
    public Place(String PlaceDesc, String PlaceHeader, int ImageResourceId) {
        mPlaceDesc = PlaceDesc;
        mPlaceHeader = PlaceHeader;
        mImageResourceId = ImageResourceId;
    }

    //Getters methods
    public int getAudioResourceId() {return mAudioResourceId;}

    public String getPlaceDesc(){
        return mPlaceDesc;
    }

    public String getPlaceHeader() { return mPlaceHeader;}

    public int getImageResourceId() { return mImageResourceId;}

    //Checks whether or not there is an image for this place.
    public boolean hasImage() { return mImageResourceId != NOT_PROVIDED;}

    @Override
    public String toString() {
        return "Place{" +
                "mPlaceDesc='" + mPlaceDesc + '\'' +
                ", mPlaceHeader='" + mPlaceHeader + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
