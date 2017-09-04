package com.akos.arathus.materialpicker.picker_elements;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.akos.arathus.materialpicker.R;

/**
 * Created by arathus on 2017.09.04..
 */

public class SelectedItemsFragment extends Fragment {

    /*public static ElementFragment newInstance() {

        ElementFragment f = new ElementFragment();

        Bundle b = new Bundle();
        b.putString("text", text);
        f.setArguments(b);
        return f;

    }*/

    LinearLayout verticalmaincontainer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_selecteditems, container, false);

        verticalmaincontainer = (LinearLayout) v.findViewById(R.id.main_container);


        return v;
    }

    //TODO működik ?

    public static CardView generatedView(Context c) {

        CardView card = new CardView(c);

        // Set the CardView layoutParams
        CardView.LayoutParams params = new CardView.LayoutParams(
                25,
                10
        );
        card.setLayoutParams(params);
        // Set CardView corner radius
        card.setRadius(3);
        // Set a background color for CardView
        card.setCardBackgroundColor(Color.parseColor("#FFC6D6C3"));
        // Set the CardView maximum elevation
        card.setMaxCardElevation(9);
        // Set CardView elevation
        card.setCardElevation(4);

        // Finally, add the CardView in root layout

        return card;
    }


    //TODO le kell tesztelni, hogy az autogenerált bullshittel működik-e

    public void addSelecteditem(CardView cw) {

        int lengthofline = 0;

        LinearLayout lastlayout = (LinearLayout) verticalmaincontainer.getChildAt(verticalmaincontainer.getChildCount() - 1);

        for (int i = 0; i < lastlayout.getChildCount(); i++) {
            lengthofline += lastlayout.getChildAt(i).getWidth();
        }

        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) cw.getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int phonewidth = displayMetrics.widthPixels;

        if (lengthofline + cw.getWidth() > phonewidth) {


            LinearLayout newline = new LinearLayout(cw.getContext());
            newline.setOrientation(LinearLayout.VERTICAL);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            newline.setLayoutParams(params);
            verticalmaincontainer.addView(newline);

            lastlayout = (LinearLayout) verticalmaincontainer.getChildAt(verticalmaincontainer.getChildCount() - 1);


        }
        lastlayout.addView(cw);
    }


}
