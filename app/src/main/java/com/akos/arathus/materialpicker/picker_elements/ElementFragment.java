package com.akos.arathus.materialpicker.picker_elements;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.akos.arathus.materialpicker.R;

/**
 * Created by arathus on 2017.09.03..
 */

public class ElementFragment extends Fragment {

    public static ElementFragment newInstance(String text) {

        ElementFragment f = new ElementFragment();

        Bundle b = new Bundle();
        b.putString("text", text);
        f.setArguments(b);
        return f;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.element_item, container, false);
        ((TextView) v.findViewById(R.id.textitem)).setText(getArguments().getString("text"));
        return v;
    }
}
