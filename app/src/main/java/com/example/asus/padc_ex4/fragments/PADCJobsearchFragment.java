package com.example.asus.padc_ex4.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.asus.padc_ex4.R;

/**
 * Created by Asus on 6/28/2016.
 */
public class PADCJobsearchFragment extends Fragment {
   // public static final String BARG_DUMMY_USERNAME="dummy_username";


    public PADCJobsearchFragment() {
    }

    public static PADCJobsearchFragment newInstance(){
        PADCJobsearchFragment fragment = new PADCJobsearchFragment();
//        Bundle bundle = new Bundle();
//        bundle.putString(PADCJobsearchFragment.BARG_DUMMY_USERNAME,defaultUsernmae);
//        fragment.setArguments(bundle);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_padcjobsearch, container, false);
    }
}
