package com.lbqm.longbeachquickmenu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.lbqm.longbeachquickmenu.shared.services.CalendarService;
import com.lbqm.longbeachquickmenu.shared.services.SpinnerService;

/**
 * Created by jin on 25/02/2018.
 */

public class ParksideMenu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parkside_menu);

        /* Access CalendarService */
        new CalendarService(ParksideMenu.this).setCalendar();
        /* set button spinner to switch category */
        new SpinnerService(ParksideMenu.this).setSpinner();
        /* Access Campus */
        Button Campus = (ParksideMenu.this).findViewById(R.id.CampusViewButton);

        Campus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), MapsActivity.class));
            }
        });
    }
}
