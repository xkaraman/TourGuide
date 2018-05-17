package com.example.android.tourguide;

import android.support.v4.app.Fragment;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by xenakis on 16/5/2018.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SightseeingFragment();
        }
        else if (position == 1){
            return new ShoppingFragment();
        }
        else if (position == 2){
            return new NightlifeFragment();
        }
        else
            return new MuseumFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_sightseeing);
        } else if (position == 1) {
            return mContext.getString(R.string.category_shopping);
        } else if (position == 2) {
            return mContext.getString(R.string.category_nightlife);
        } else {
            return mContext.getString(R.string.category_museum);
        }
    }
}
