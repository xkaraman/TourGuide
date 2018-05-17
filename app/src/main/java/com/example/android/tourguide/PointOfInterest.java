package com.example.android.tourguide;

/**
 * Created by xenakis on 16/5/2018.
 */

public class PointOfInterest {
    private static int mNumofPoI = 1;
    private int mId;
    private String mName;
    private String mLocation;
    private int mCategory;
    private int mImageID = -1;

    public PointOfInterest(String name, String location, int category) {
        mId = mNumofPoI;
        mNumofPoI++;
        mName = name;
        mLocation = location;
        mCategory = category;
    }

    public PointOfInterest(String name, String location, int category, int imageID) {
        mId = mNumofPoI;
        mNumofPoI++;
        mName = name;
        mLocation = location;
        mCategory = category;
        mImageID = imageID;
    }
    public static int getNumofPoI() {
        return mNumofPoI;
    }

    public int getImageID() {
        return mImageID;
    }

    public int getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    public String getLocation() {
        return mLocation;
    }

    public int getCategory() {
        return mCategory;
    }

    public boolean hasImage(){
        return mImageID != -1;
    }
    @Override
    public String toString() {
        return "PointOfInterest{" +
                "mId=" + mId +
                ", mName='" + mName + '\'' +
                ", mLocation='" + mLocation + '\'' +
                ", mCategory='" + mCategory + '\'' +
                ", mImageID=" + mImageID +
                '}';
    }
}
