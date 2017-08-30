package com.akos.arathus.materialpicker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.akos.arathus.materialpicker.adapters.HorizontalAdapter;
import com.akos.arathus.materialpicker.picker_elements.DummyElements;

public class HorizontalPickerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontal_picker);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RecyclerView my_recycler_view = (RecyclerView) findViewById(R.id.horizontal_recyclerview);

        my_recycler_view.setHasFixedSize(true);

        HorizontalAdapter adapter = new HorizontalAdapter(DummyElements.getElements());

        my_recycler_view.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        my_recycler_view.setAdapter(adapter);


    }

}
