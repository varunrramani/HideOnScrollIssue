package pl.michalz.hideonscrollexample.fragment;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pl.michalz.hideonscrollexample.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TestFragmentThee extends android.support.v4.app.Fragment {


    public TestFragmentThee() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_test_fragment_thee, container, false);
    }


}
