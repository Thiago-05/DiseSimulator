package com.thiago.dicesimulator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class WinFragment extends Fragment {

    public WinFragment(){}

    private TextView mTextViewWinFragment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_win, container, false);
        mTextViewWinFragment = view.findViewById(R.id.textView_win_fragment);
        long value = getArguments().getLong("message");
        mTextViewWinFragment.setText(""+ value);
        return view;
    }

}
