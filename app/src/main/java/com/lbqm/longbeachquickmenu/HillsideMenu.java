package com.lbqm.longbeachquickmenu;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
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

        /* Access to the Bottom Navigation View */
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_campus:
                        startActivity(new Intent(HillsideMenu.this, MapsActivity.class));
                        return true;
                    case R.id.navigation_menu:
                        startActivity(new Intent(HillsideMenu.this, MainActivity.class));
                        return true;
                    case R.id.navigation_calendar:
                        new CalendarService(HillsideMenu.this).setCalendarFromBottomNav();
                        return true;
                }
                return false;
            }
        });

        /* Access CalendarService from top navigation */
        new CalendarService(HillsideMenu.this).setCalendar();
        /* set button spinner to switch category */
        new SpinnerService(HillsideMenu.this).setSpinner();



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
