package com.example.asus.padc_ex4.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.asus.padc_ex4.R;

/**
 * Created by Asus on 7/1/2016.
 */
public class PADCWinzinFragment extends Fragment {


    public PADCWinzinFragment(){

    }
    public static PADCWinzinFragment newInstance()
    {
        PADCWinzinFragment fragment = new PADCWinzinFragment();
        return fragment;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_padcwinzin, container, false);
        return view;
    }
}

