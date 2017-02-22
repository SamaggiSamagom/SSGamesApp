package com.android.gifts.bottomnavigation.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.android.gifts.bottomnavigation.FootballScores;
import com.android.gifts.bottomnavigation.R;


public class scores extends Fragment {

    public scores() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.activity_menu_scores, container, false);

        // SS - copy the final method below as many buttons as you need

        //football scores
        final ImageButton breakfast = (ImageButton) v.findViewById(R.id.imageButton);
        breakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), FootballScores.class);
                startActivity(intent);
            }
        });

        //basketball scores (i literally copied form the above so you'll have to set this one up yourself)
        final ImageButton breakfast2 = (ImageButton) v.findViewById(R.id.imageButton2);
        breakfast2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), FootballScores.class);
                startActivity(intent);
            }
        });

        return v;
    }

}
