package com.example.asus.padc_ex4.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

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
        View view = inflater.inflate(R.layout.fragment_padclinkedin, container, false);

        ImageView imageViewSetting = (ImageView) view.findViewById(R.id.iv_setting);
        imageViewSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Profile setting",
                        Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imageViewEdit = (ImageView) view.findViewById(R.id.iv_edit);
        imageViewEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Profile Edit",
                        Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imageClose = (ImageView) view.findViewById(R.id.iv_cross);
        imageClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Close",
                        Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
