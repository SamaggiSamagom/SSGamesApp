package com.android.gifts.bottomnavigation.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.android.gifts.bottomnavigation.R;
import com.roughike.bottombar.BottomBar;

import static android.R.attr.button;


public class About extends Fragment {

    private BottomBar bottomBar;

    public About() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.activity_main_central, container, false);

//        final Button okButton = (Button) v.findViewById(R.id.a2i);
//        okButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });

//        final ImageButton breakfast = (ImageButton) v.findViewById(R.id.a2i);
//        breakfast.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                System.out.print("Clicked");
//            }
//        });

        final ImageButton ImageButton = (ImageButton) v.findViewById(R.id.a2i);
        ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Log.d("NEW","Clicked NOW");
                Fragment frag = new information();

                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fragmentContainer, frag);
//                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.addToBackStack(null);
                ft.commit();

            }
        });

        return v;
    }



}
