package com.akos.arathus.materialpicker;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.LinearLayout;

import com.akos.arathus.materialpicker.adapters.HorizontalAdapter;
import com.akos.arathus.materialpicker.picker_elements.DummyElements;
import com.akos.arathus.materialpicker.picker_elements.Element;
import com.akos.arathus.materialpicker.picker_elements.ElementFragment;

public class HorizontalPickerActivity extends AppCompatActivity {

    static com.google.android.flexbox.FlexboxLayout selected;
    RecyclerView my_recycler_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontal_picker);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        HorizontalAdapter adapter = new HorizontalAdapter(DummyElements.getElements());



        my_recycler_view = (RecyclerView) findViewById(R.id.recyclerview_picker_horizontal);
        my_recycler_view.setHasFixedSize(true);
        my_recycler_view.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        my_recycler_view.setAdapter(adapter);

        selected = (com.google.android.flexbox.FlexboxLayout) findViewById(R.id.selected_ones_container);



    }

    public static void addselected(Element elem, Activity a) {

        LinearLayout ll = new LinearLayout(a.getBaseContext());
        ll.setOrientation(LinearLayout.HORIZONTAL);

        ll.setId(12345);

        a.getFragmentManager().beginTransaction().add(ll.getId(), ElementFragment.newInstance(elem.getText()), "someTag1").commit();
        selected.addView(ll);

    }

}
