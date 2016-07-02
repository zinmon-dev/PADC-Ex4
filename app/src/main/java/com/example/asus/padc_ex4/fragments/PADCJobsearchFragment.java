package com.example.asus.padc_ex4.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

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
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_padcjobsearch, container, false);

        ImageView imageNew = (ImageView) view.findViewById(R.id.iv_new);
        imageNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Show new",Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
