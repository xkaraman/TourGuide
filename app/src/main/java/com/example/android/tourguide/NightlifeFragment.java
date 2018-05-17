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

public class NightlifeFragment extends Fragment {

    public NightlifeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_fragments, container, false);

        final ArrayList<PointOfInterest> pointOfInterests = new ArrayList<>();
        pointOfInterests.add(new PointOfInterest(getString(R.string.hoppypubname),
                getString(R.string.hoppypublocation),
                3,
                R.drawable.hoppypub));

        pointOfInterests.add(new PointOfInterest(getString(R.string.dentrostobarname),
                getString(R.string.dentrostobarlocation),
                3, R.drawable.dentrostobar));

        pointOfInterests.add(new PointOfInterest(getString(R.string.kafodeioname),
                getString(R.string.kafodeiolocation),
                3, R.drawable.kafodeio));

        PoIAdapter adapter = new PoIAdapter(getActivity(), pointOfInterests);

        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
