package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * Created by xenakis on 16/5/2018.
 */

public class ShoppingFragment extends Fragment {

    public ShoppingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_fragments, container, false);

        final ArrayList<PointOfInterest> pointOfInterests = new ArrayList<>();
        pointOfInterests.add(new PointOfInterest(getString(R.string.cosmosname),
                getString(R.string.cosmoslocation),
                2,
                R.drawable.cosmos));

        pointOfInterests.add(new PointOfInterest(getString(R.string.enkarponame),
                getString(R.string.enkarpolocation),
                2, R.drawable.enkarpo));

        pointOfInterests.add(new PointOfInterest(getString(R.string.olicatessenname),
                getString(R.string.olicatessenlocation),
                2, R.drawable.olicatessen));

        PoIAdapter adapter = new PoIAdapter(getActivity(), pointOfInterests);

        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
