package com.lbqm.longbeachquickmenu.shared.services;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.lbqm.longbeachquickmenu.BeachsideMenu;
import com.lbqm.longbeachquickmenu.HillsideMenu;
import com.lbqm.longbeachquickmenu.ParksideMenu;
import com.lbqm.longbeachquickmenu.R;
import com.lbqm.longbeachquickmenu.shared.Singleton;


/**
 * Created by jin on 15/03/2018.
 */

/* This service will update and interact spinner, [ALWAYS] use the @id spinner */

public class SpinnerMenuService {
    private Singleton singleton = new Singleton();

    private Context context;

    public SpinnerMenuService(Context context) {
        this.context = context;

    }

    /* Method that will make view category */
    public void setSpinner() {
        Spinner sp = ((Activity) context).findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(context, R.layout.spinner_item, Singleton.categories);
        sp.setAdapter(adapter);

        /* Save selected spinner position to keep the view updated */
        sp.setSelection(Singleton.position);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Singleton.categoryFiltered = parent.getItemAtPosition(position).toString();
                Singleton.position = position;
                Singleton.category = position;
                System.out.println("Singleton category = " + Singleton.category);

                /* Code below will display our menu dynamically */
                TextView menu = ((Activity) context).findViewById(R.id.menu);

                if (HillsideMenu.isActive) {
                    Log.d("[HillsideMenu]", String.valueOf(HillsideMenu.isActive));
                    menu.setText(HillsideMenu.getMenu(singleton.getCycle(Singleton.weekOfYear), singleton.getDay(), singleton.getCategory()));
                }
                if (ParksideMenu.isActive) {
                    Log.d("[ParksideMenu]", String.valueOf(ParksideMenu.isActive));
                    menu.setText(ParksideMenu.getMenu(singleton.getCycle(Singleton.weekOfYear), singleton.getDay(), singleton.getCategory()));
                }
                if (BeachsideMenu.isActive) {
                    Log.d("[BeachsideMenu]", String.valueOf(BeachsideMenu.isActive));
                    menu.setText(BeachsideMenu.getMenu(singleton.getCycle(Singleton.weekOfYear), singleton.getDay(), singleton.getCategory()));
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
