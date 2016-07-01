package com.example.asus.padc_ex4.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.asus.padc_ex4.R;

/**
 * Created by Asus on 6/29/2016.
 */
public class PADCPulseFragment extends Fragment {

    public PADCPulseFragment() {
    }

    public static PADCPulseFragment newInstance(){
        PADCPulseFragment fragment = new PADCPulseFragment();
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_padcpulse, container, false);
        return view;
    }
}
