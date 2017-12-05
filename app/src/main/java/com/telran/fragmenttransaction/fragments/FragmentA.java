package com.telran.fragmenttransaction.fragments;

/**
 * Created by TelRan on 15.01.2017.
 */

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.telran.fragmenttransaction.R;


/**
 * A simple {@link Fragment} subclass.
 *
 */
public class FragmentA extends Fragment {


    private static final String TAG = "TEL-RAN";

    public FragmentA() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Activity activity) {
        Log.d(TAG, "onAttach: FragmentA");
        super.onAttach(activity);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: FragmentA");
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView: FragmentA");
        return inflater.inflate(R.layout.fragment_a_layout, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.d(TAG, "onActivityCreated: FragmentA");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.d(TAG, "onStart: FragmentA");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d(TAG, "onResume: FragmentA");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.d(TAG, "onPause: FragmentA");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d(TAG, "onStop: FragmentA");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.d(TAG, "onDestroyView: FragmentA");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "onDestroy: FragmentA");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.d(TAG, "onDetach: FragmentA");
        super.onDetach();
    }
}