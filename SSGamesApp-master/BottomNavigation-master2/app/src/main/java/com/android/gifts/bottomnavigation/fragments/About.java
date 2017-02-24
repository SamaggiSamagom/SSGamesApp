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
<<<<<<< HEAD
=======
import android.widget.Button;
>>>>>>> origin/master
import android.widget.ImageButton;

import com.android.gifts.bottomnavigation.FootballScores;
import com.android.gifts.bottomnavigation.R;
<<<<<<< HEAD
import com.android.gifts.bottomnavigation.bus_view;
import com.android.gifts.bottomnavigation.eventmap_view;
import com.android.gifts.bottomnavigation.eventtime_view;
import com.android.gifts.bottomnavigation.info_view;
import com.android.gifts.bottomnavigation.new_view;
import com.android.gifts.bottomnavigation.pl_view;
import com.android.gifts.bottomnavigation.rule_view;
import com.android.gifts.bottomnavigation.sd_view;
import com.android.gifts.bottomnavigation.timetable_view;
=======
import com.roughike.bottombar.BottomBar;

import static android.R.attr.button;
>>>>>>> origin/master


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

<<<<<<< HEAD
        // SS - copy the final method below as many buttons as you need

        //football scores
        final ImageButton breakfast = (ImageButton) v.findViewById(R.id.b3i);
        breakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), bus_view.class);
                startActivity(intent);
            }
        });

        final ImageButton breakfast2 = (ImageButton) v.findViewById(R.id.a2i);
        breakfast2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), info_view.class);
                startActivity(intent);
            }
        });

        final ImageButton breakfast3 = (ImageButton) v.findViewById(R.id.b1i);
        breakfast3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), eventtime_view.class);
                startActivity(intent);
            }
        });

        final ImageButton breakfast4 = (ImageButton) v.findViewById(R.id.b2i);
        breakfast4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), timetable_view.class);
                startActivity(intent);
            }
        });

        final ImageButton breakfast5 = (ImageButton) v.findViewById(R.id.a1i);
        breakfast5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), new_view.class);
                startActivity(intent);
            }
        });

        final ImageButton breakfast6 = (ImageButton) v.findViewById(R.id.a3i);
        breakfast6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), rule_view.class);
                startActivity(intent);
            }
        });

        final ImageButton breakfast7 = (ImageButton) v.findViewById(R.id.c1i);
        breakfast7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), eventmap_view.class);
                startActivity(intent);
            }
        });

        final ImageButton breakfast8 = (ImageButton) v.findViewById(R.id.c2i);
        breakfast8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), sd_view.class);
                startActivity(intent);
            }
        });
        final ImageButton breakfast9 = (ImageButton) v.findViewById(R.id.c3i);
        breakfast9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), pl_view.class);
                startActivity(intent);
            }
        });

        return v;
    }
=======
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



>>>>>>> origin/master
}
