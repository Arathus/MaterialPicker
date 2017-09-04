package com.akos.arathus.materialpicker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.LinearLayout;

import com.akos.arathus.materialpicker.adapters.HorizontalAdapter;
import com.akos.arathus.materialpicker.picker_elements.DummyElements;

public class HorizontalPickerActivity extends AppCompatActivity {

    RecyclerView my_recycler_view;
    LinearLayout contlayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontal_picker);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        HorizontalAdapter adapter = new HorizontalAdapter(DummyElements.getElements());

        //TODO hozzáadni a fragmentet a konténerhez
        contlayout = (LinearLayout) findViewById(R.id.linearcontainer);

        my_recycler_view = (RecyclerView) findViewById(R.id.recyclerview_picker_horizontal);
        my_recycler_view.setHasFixedSize(true);
        my_recycler_view.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        my_recycler_view.setAdapter(adapter);


    }


}
