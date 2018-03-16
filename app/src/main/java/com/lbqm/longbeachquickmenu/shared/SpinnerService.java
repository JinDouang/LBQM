package com.lbqm.longbeachquickmenu.shared;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.lbqm.longbeachquickmenu.R;

/**
 * Created by jin on 15/03/2018.
 */

/* This service will update and interact spinner, [ALWAYS] use the @id spinner */

public class SpinnerService extends AppCompatActivity  {

    /* Init spinner button */
    Spinner sp;

    ArrayAdapter<String> adapter;

    private Context context;


    public SpinnerService(Context context) {
        this.context = context;

    }

    /* Method that will make view category */
    public void setSpinner() {
        sp = ((Activity) context).findViewById(R.id.spinner);
        adapter = new ArrayAdapter<>(context, R.layout.spinner_item, Singleton.categories);
        sp.setAdapter(adapter);

        /* Save selected spinner position to keep the view updated */
        sp.setSelection(Singleton.position);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                System.out.println("[DEBUG] [CategoryBefore:] " + Singleton.categoryFiltered);
                Singleton.categoryFiltered = parent.getItemAtPosition(position).toString();
                Singleton.position = position;

                System.out.println("[DEBUG] [CategoryAfter:] " + Singleton.categoryFiltered);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
