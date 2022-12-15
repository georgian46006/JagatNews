package com.jagat.jagatnews.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.jagat.jagatnews.R;

import com.jagat.jagatnews.ui.DDNEWS.SlideshowFragment;
import com.jagat.jagatnews.ui.HindustanTimes.HomeFragment;
import com.jagat.jagatnews.ui.TheHindu.GalleryFragment;

public class news_pages extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public news_pages() {

    }

    public static news_pages newInstance(String param1, String param2) {
        news_pages fragment = new news_pages();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
    Button hindustan;
    Button hindu;
    Button ddnews;
    Button toi;
    Button indianexpress;
    Button wion;
    ImageView hindustan_image;
    ImageView thehindu_image;
    ImageView dd_image;
    ImageView toi_image;
    ImageView ie_image;
    ImageView wion_image;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.news_app_fragment, container, false);
        hindustan = view.findViewById(R.id.hindustan);
        hindu = view.findViewById(R.id.hindu);
        ddnews = view.findViewById(R.id.ddnews);
        toi = view.findViewById(R.id.toi);
        indianexpress = view.findViewById(R.id.indianexpress);
        wion = view.findViewById(R.id.wion);
        hindustan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                   HomeFragment homeFragment = new HomeFragment();
                   getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.app_bar_main,homeFragment).addToBackStack(null).commit();
               }
        });
        hindu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId() == R.id.hindu){
                    GalleryFragment galleryFragment = new GalleryFragment();
                    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.app_bar_main, galleryFragment)
                            .addToBackStack(null).commit();

                }
            }
        });
        ddnews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId() == R.id.ddnews){
                    SlideshowFragment slideshowFragment = new SlideshowFragment();
                    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.app_bar_main, slideshowFragment)
                            .addToBackStack(null).commit();

                }
            }
        });
        toi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId() == R.id.toi){
                    toi_fragment toiFragment = new toi_fragment();
                    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.app_bar_main, toiFragment)
                            .addToBackStack(null).commit();

                }
            }
        });
        indianexpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId() == R.id.indianexpress){
                    indian_express_fragment indianExpressFragment = new indian_express_fragment();
                    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.app_bar_main, indianExpressFragment)
                            .addToBackStack(null).commit();

                }
            }
        });
        wion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId() == R.id.wion){
                    wion_fragment wionFragment = new wion_fragment();
                    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.app_bar_main, wionFragment)
                            .addToBackStack(null).commit();

                }
            }
        });


        return view;
    }



}
