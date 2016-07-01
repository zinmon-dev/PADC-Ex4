package com.example.asus.padc_ex4.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.asus.padc_ex4.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class PADCLinkedinFragment extends Fragment {

    public PADCLinkedinFragment() {
    }

    public static PADCLinkedinFragment newInstance(){
        PADCLinkedinFragment fragment = new PADCLinkedinFragment();
//        Bundle bundle = new Bundle();
//        bundle.putString(PADCJobsearchFragment.BARG_DUMMY_USERNAME,defaultUsernmae);
//        fragment.setArguments(bundle);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_padclinkedin, container, false);
    }
}
