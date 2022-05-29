package com.thiago.dicesimulator;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Chronometer;

import androidx.fragment.app.Fragment;

public class PlayingTimeFragment extends Fragment {

    public PlayingTimeFragment(){}

    private Chronometer mChronometer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_playing_time, container, false);
        mChronometer = view.findViewById(R.id.chronometer_time);
        long value = getArguments().getLong("message");
        long deltaTime = SystemClock.elapsedRealtime() - value;
        if(deltaTime >= 1000 && value > 0){
            mChronometer.setBase(value);
            mChronometer.start();
        }
        return view;
    }

}
