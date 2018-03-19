package com.lbqm.longbeachquickmenu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.lbqm.longbeachquickmenu.database.DatabaseBeachsideMenu;
import com.lbqm.longbeachquickmenu.shared.services.CalendarService;
import com.lbqm.longbeachquickmenu.shared.services.SpinnerService;

/**
 * Created by jin on 25/02/2018.
 */

public class HillsideMenu extends AppCompatActivity {
    //String[] test = {"MOT!", "MOT2", "MOT3"};
    //test.getMenu(0,0,0).get(0).getName()


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hillside_menu);

        /* Access CalendarService */
        new CalendarService(HillsideMenu.this).setCalendar();
        /* set button spinner to switch category */
        new SpinnerService(HillsideMenu.this).setSpinner();
        /* Access Campus */
        Button Campus = (HillsideMenu.this).findViewById(R.id.CampusViewButton);
        Campus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), MapsActivity.class));
            }
        });
        /* Access Menu */
        Button Menu = (HillsideMenu.this).findViewById(R.id.menu);
        Menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), MainActivity.class));
            }
        });


        DatabaseBeachsideMenu test = new DatabaseBeachsideMenu();


        TextView newtext = (TextView) findViewById(R.id.textViewTest2);
        System.out.println();
        newtext.setText(test.getMenu(0,0,0).get(0).getName());

    }

    public String fullMeal(int cycle, int date, int time) {

        DatabaseBeachsideMenu menu = new DatabaseBeachsideMenu();
        String meal = "";
        int cycleLength = menu.getCycleLength();
        int dateLength = menu.getDayLength(cycle);
        int timeLength = menu.getTimeLength(cycle, date);
        int i = 0;





        return meal;
    }
}
