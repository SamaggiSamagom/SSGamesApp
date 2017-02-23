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
import com.android.gifts.bottomnavigation.bus_view;
import com.android.gifts.bottomnavigation.eventmap_view;
import com.android.gifts.bottomnavigation.eventtime_view;
import com.android.gifts.bottomnavigation.info_view;
import com.android.gifts.bottomnavigation.pl_view;
import com.android.gifts.bottomnavigation.sd_view;
import com.android.gifts.bottomnavigation.timetable_view;


public class information extends Fragment {

    public information() {
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
        View v = inflater.inflate(R.layout.activity_main_menu2, container, false);

        // SS - copy the final method below as many buttons as you need

        //football scores
        final ImageButton geninfo = (ImageButton) v.findViewById(R.id.geninfob);
        geninfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), info_view.class);
                startActivity(intent);
            }
        });

        //basketball scores (i literally copied form the above so you'll have to set this one up yourself)
        final ImageButton overallmap = (ImageButton) v.findViewById(R.id.overallmapb);
        overallmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), eventmap_view.class);
                startActivity(intent);

            }
        });

        //basketball scores (i literally copied form the above so you'll have to set this one up yourself)
        final ImageButton eventtime = (ImageButton) v.findViewById(R.id.eventtimeb);
        eventtime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), eventtime_view.class);
                startActivity(intent);

            }
        });

        //basketball scores (i literally copied form the above so you'll have to set this one up yourself)
        final ImageButton sportdockmap = (ImageButton) v.findViewById(R.id.sdmapb);
        sportdockmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), sd_view.class);
                startActivity(intent);

            }
        });

        //basketball scores (i literally copied form the above so you'll have to set this one up yourself)
        final ImageButton plmap = (ImageButton) v.findViewById(R.id.plb);
        plmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), pl_view.class);
                startActivity(intent);

            }
        });

        //basketball scores (i literally copied form the above so you'll have to set this one up yourself)
        final ImageButton timetablel = (ImageButton) v.findViewById(R.id.timeb);
        timetablel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), timetable_view.class);
                startActivity(intent);

            }
        });

        //basketball scores (i literally copied form the above so you'll have to set this one up yourself)
        final ImageButton trans = (ImageButton) v.findViewById(R.id.transb);
        trans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), bus_view.class);
                startActivity(intent);

            }
        });

        return v;
    }

}
