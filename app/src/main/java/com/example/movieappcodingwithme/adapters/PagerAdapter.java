package com.example.movieappcodingwithme.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.movieappcodingwithme.fragments.NowPlayingFragment;
import com.example.movieappcodingwithme.fragments.UpComingFragment;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int count;

    public PagerAdapter(@NonNull FragmentManager fm, int count) {
        super(fm);
        this.count = count;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                NowPlayingFragment nowPlayingFragment = new NowPlayingFragment();
                return nowPlayingFragment;

            case 1:
                UpComingFragment upComingFragment = new UpComingFragment();
                return upComingFragment;

            default:
                nowPlayingFragment  = new NowPlayingFragment();
                return nowPlayingFragment;
        }

    }

    @Override
    public int getCount() {
        return count;
    }
}
