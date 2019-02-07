package com.telran.fragmenttransaction.fragments;

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
public class FragmentB extends Fragment {

    private static final String TAG = "TEL-RAN";

    public FragmentB() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Activity activity) {
        Log.e(TAG, "onAttach: FragmentB");
        super.onAttach(activity);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.e(TAG, "onCreate: FragmentB");
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.e(TAG, "onCreateView: FragmentB");
        return inflater.inflate(R.layout.fragment_b_layout, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.e(TAG, "onActivityCreated: FragmentB");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.e(TAG, "onStart: FragmentB");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.e(TAG, "onResume: FragmentB");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.e(TAG, "onPause: FragmentB");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.e(TAG, "onStop: FragmentB");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.e(TAG, "onDestroyView: FragmentB");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.e(TAG, "onDestroy: FragmentB");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.e(TAG, "onDetach: FragmentB");
        super.onDetach();
    }

}
