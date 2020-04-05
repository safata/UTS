package com.example.utscoba.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.example.utscoba.R;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ResepCookiesFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class ResepCookiesFragment extends Fragment {


    private OnFragmentInteractionListener mListener;

    public ResepCookiesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_resep_cookies,container, false);

        ImageView minuman1 =  view.findViewById(R.id.minuman1);
        ImageView minuman2 =  view.findViewById(R.id.minuman2);
        ImageView minuman3 =  view.findViewById(R.id.minuman3);
        ImageView minuman4 =  view.findViewById(R.id.minuman4);


        minuman1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mListener != null){
                    mListener.onMinuman1Clicked();
                }
            }
        });

        minuman2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mListener != null){
                    mListener.onMinuman2Clicked();
                }
            }
        });

        minuman3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mListener != null){
                    mListener.onMinuman3Clicked();
                }
            }
        });

        minuman4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mListener != null){
                    mListener.onMinuman4Clicked();
                }
            }
        });
        return view;
    }


    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onMinuman1Clicked();
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }




    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name

//        void onMinumMClicked();

        void onMinuman1Clicked();

        void onMinuman2Clicked();

        void onMinuman3Clicked();

        void onMinuman4Clicked();
    }
}
