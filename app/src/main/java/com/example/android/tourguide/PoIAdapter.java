package com.example.android.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by xenakis on 16/5/2018.
 */

public class PoIAdapter extends ArrayAdapter<PointOfInterest> {

    private int mColour = -1;

    public PoIAdapter(@NonNull Context context, ArrayList<PointOfInterest> words, int colour){
        super(context,0, words);
        mColour = colour;
    }

    public PoIAdapter(@NonNull Context context, ArrayList<PointOfInterest> words ) {
        super(context,0, words);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.poi_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        final   PointOfInterest currentPoi = getItem(position);

        RelativeLayout linearLayout = listItemView.findViewById(R.id.text_container);
        if( mColour != -1) {
            int color = ContextCompat.getColor(getContext(), mColour);
            linearLayout.setBackgroundColor(color);
        }
        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwokTextView =  listItemView.findViewById(R.id.poi_name);
        // set this text on the name TextView
        miwokTextView.setText(currentPoi.getName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView defaultTextView = listItemView.findViewById(R.id.poi_location);
        // set this text on the number TextView
        defaultTextView.setText(currentPoi.getLocation());

        ImageView imageView = listItemView.findViewById(R.id.poi_image);
        if (currentPoi.hasImage()){
            imageView.setImageResource(currentPoi.getImageID());
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.GONE);
        }
        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
