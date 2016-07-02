package com.example.asus.padc_ex4.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.asus.padc_ex4.R;

/**
 * Created by Asus on 6/30/2016.
 */
public class PADCCinemaFragment extends Fragment{

    public static PADCCinemaFragment newInstance(){
        PADCCinemaFragment fragment = new PADCCinemaFragment();
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_cinema,container,false);

        Button btnDetail = (Button) view.findViewById(R.id.btn_detail);

        btnDetail.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                 Toast.makeText(getContext(),"Show movie detail", Toast.LENGTH_SHORT).show();
            }
        });

        TextView tvReadmore = (TextView) view.findViewById(R.id.tv_readmore);
        tvReadmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Read More",Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
