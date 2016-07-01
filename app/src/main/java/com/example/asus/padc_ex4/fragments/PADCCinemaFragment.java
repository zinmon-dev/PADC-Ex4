package com.example.asus.padc_ex4.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.asus.padc_ex4.R;

/**
 * Created by Asus on 6/30/2016.
 */
public class PADCCinemaFragment extends Fragment{
    public PADCCinemaFragment() {
    }

    public static PADCCinemaFragment newInstance(){
        PADCCinemaFragment fragment = new PADCCinemaFragment();
//        Bundle bundle = new Bundle();
//        bundle.putString(PADCJobsearchFragment.BARG_DUMMY_USERNAME,defaultUsernmae);
//        fragment.setArguments(bundle);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_cinema, container, false);
    }
}
