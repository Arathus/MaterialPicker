package com.akos.arathus.materialpicker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.support.v7.widget.AppCompatButton horizontal = (android.support.v7.widget.AppCompatButton) findViewById(R.id.horizontalpicker);

        horizontal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, HorizontalPickerActivity.class);
                MainActivity.this.startActivity(myIntent);


            }
        });
    }
}
