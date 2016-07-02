package com.example.asus.padc_ex4.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

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

        Button btnBuy = (Button) view.findViewById(R.id.btn_buy);
        btnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"would you like to buy",Toast.LENGTH_SHORT).show();
            }
        });

        Button btnSample = (Button) view.findViewById(R.id.btn_sample);
        btnSample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Sample to read",Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}

