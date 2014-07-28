package com.devflow.anthony.devflowtutorials.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.devflow.anthony.devflowtutorials.R;

/**
 * Created by anthony on 7/28/14.
 */
public class CustomTypefaceFragment extends Fragment {
    public static String TAG = "CustomTypefaceFragment";

    public static CustomTypefaceFragment newInstance(){
        return new CustomTypefaceFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.custom_typeface_fragment, container, false);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
