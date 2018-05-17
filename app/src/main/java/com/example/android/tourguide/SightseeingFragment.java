package com.example.android.tourguide;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by xenakis on 16/5/2018.
 */

public class SightseeingFragment extends Fragment {

    public SightseeingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_fragments, container, false);

        final ArrayList<PointOfInterest> pointOfInterests = new ArrayList<>();
        pointOfInterests.add(new PointOfInterest(getString(R.string.agiosdimitriosname),
                getString(R.string.agiosdimitrioslocation),
                1,
                R.drawable.agiosdimitrios));

        pointOfInterests.add(new PointOfInterest(getString(R.string.aristotelousname),
                getString(R.string.aristotelouslocation),
                1, R.drawable.aristotelous));

        pointOfInterests.add(new PointOfInterest(getString(R.string.whitetowername),
                getString(R.string.whitetowerlocation),
                1, R.drawable.whitetower));

            PoIAdapter adapter = new PoIAdapter(getActivity(), pointOfInterests);

        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}