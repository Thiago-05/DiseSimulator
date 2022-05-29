package com.thiago.dicesimulator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class LoseFragment extends Fragment {

    public LoseFragment(){}

    private TextView mTextViewLoseFragment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_lose, container, false);
        mTextViewLoseFragment = view.findViewById(R.id.textView_lose_fragment);
        long value = getArguments().getLong("message");
        mTextViewLoseFragment.setText(""+ value);
        return view;
    }

}
