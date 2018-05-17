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

public class MuseumFragment extends Fragment {
    public MuseumFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_fragments, container, false);

        final ArrayList<PointOfInterest> pointOfInterests = new ArrayList<>();
        pointOfInterests.add(new PointOfInterest(getString(R.string.archeologicalname),
                getString(R.string.archeologicallocation),
                4,
                R.drawable.archeological));

        pointOfInterests.add(new PointOfInterest(getString(R.string.noesisname),
                getString(R.string.noesislocation),
                4, R.drawable.noesis));

        pointOfInterests.add(new PointOfInterest(getString(R.string.photographyname),
                getString(R.string.photographylocation),
                4, R.drawable.photography));

        PoIAdapter adapter = new PoIAdapter(getActivity(), pointOfInterests);

        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
