package com.android.gifts.bottomnavigation.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.android.gifts.bottomnavigation.R;
import com.android.gifts.bottomnavigation.basketball_men_tornament;
import com.android.gifts.bottomnavigation.basketball_women_tornament;
import com.android.gifts.bottomnavigation.batminton_men_tornament;
import com.android.gifts.bottomnavigation.batminton_mixed_tornament;
import com.android.gifts.bottomnavigation.batminton_women_tornament;
import com.android.gifts.bottomnavigation.chairball_tornament;
import com.android.gifts.bottomnavigation.chess_tornament;
import com.android.gifts.bottomnavigation.dodgeball_tornament;
import com.android.gifts.bottomnavigation.football_tornament;
import com.android.gifts.bottomnavigation.hayha_tornament;
import com.android.gifts.bottomnavigation.table_men_tornament;
import com.android.gifts.bottomnavigation.table_wemen_tornament;


public class tornament extends Fragment {

    public tornament() {
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
        View v = inflater.inflate(R.layout.activity_menu_tornament, container, false);

        // SS - copy the final method below as many buttons as you need

        //football scores
        final ImageButton football = (ImageButton) v.findViewById(R.id.geninfob);
        football.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),football_tornament.class);
                startActivity(intent);
            }
        });

        //basketball scores (i literally copied form the above so you'll have to set this one up yourself)
        final ImageButton basketball = (ImageButton) v.findViewById(R.id.baskm);
        basketball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), basketball_men_tornament.class);
                startActivity(intent);
            }
        });

        //basketball scores (i literally copied form the above so you'll have to set this one up yourself)
        final ImageButton basketballf = (ImageButton) v.findViewById(R.id.plb);
        basketballf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), basketball_women_tornament.class);
                startActivity(intent);
            }
        });

        //basketball scores (i literally copied form the above so you'll have to set this one up yourself)
        final ImageButton batminton_m = (ImageButton) v.findViewById(R.id.badm);
        batminton_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), batminton_men_tornament.class);
                startActivity(intent);
            }
        });

        //basketball scores (i literally copied form the above so you'll have to set this one up yourself)
        final ImageButton batminton_f = (ImageButton) v.findViewById(R.id.transb);
        batminton_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), batminton_women_tornament.class);
                startActivity(intent);
            }
        });

        //basketball scores (i literally copied form the above so you'll have to set this one up yourself)
        final ImageButton batminton_mix = (ImageButton) v.findViewById(R.id.badmix);
        batminton_mix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), batminton_mixed_tornament.class);
                startActivity(intent);
            }
        });

        //basketball scores (i literally copied form the above so you'll have to set this one up yourself)
        final ImageButton table_m = (ImageButton) v.findViewById(R.id.tabkem);
        table_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), table_men_tornament.class);
                startActivity(intent);
            }
        });

        //basketball scores (i literally copied form the above so you'll have to set this one up yourself)
        final ImageButton table_f = (ImageButton) v.findViewById(R.id.button2);
        table_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), table_wemen_tornament.class);
                startActivity(intent);
            }
        });

        //basketball scores (i literally copied form the above so you'll have to set this one up yourself)
        final ImageButton dodgeball = (ImageButton) v.findViewById(R.id.dodgeb);
        dodgeball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), dodgeball_tornament.class);
                startActivity(intent);
            }
        });

        //basketball scores (i literally copied form the above so you'll have to set this one up yourself)
        final ImageButton chair = (ImageButton) v.findViewById(R.id.chairb);
        chair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), chairball_tornament.class);
                startActivity(intent);
            }
        });

        //basketball scores (i literally copied form the above so you'll have to set this one up yourself)
        final ImageButton chess = (ImageButton) v.findViewById(R.id.chessb);
        chess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), chess_tornament.class);
                startActivity(intent);
            }
        });

        //basketball scores (i literally copied form the above so you'll have to set this one up yourself)
        final ImageButton hay = (ImageButton) v.findViewById(R.id.hayharb);
        hay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), hayha_tornament.class);
                startActivity(intent);
            }
        });

        return v;
    }

}
