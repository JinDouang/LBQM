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
import com.lbqm.longbeachquickmenu.shared.Singleton;
import com.lbqm.longbeachquickmenu.shared.services.CalendarService;
import com.lbqm.longbeachquickmenu.shared.services.SpinnerService;

/**
 * Created by jin on 25/02/2018.
 */

public class HillsideMenu extends AppCompatActivity {
    //String[] test = {"MOT!", "MOT2", "MOT3"};
    //test.getMenu(0,0,0).get(0).getName()

    Singleton singleton = new Singleton();


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

        int cycle = 0;
        int day = singleton.getDay();
        int time = singleton.getCategory();

        TextView newtext = (TextView) findViewById(R.id.textViewTest2);

        newtext.setText(fullMeal(cycle,day,time));
    }

    public String fullMeal(int cycle, int day, int time) {
        DatabaseBeachsideMenu menu = new DatabaseBeachsideMenu();
        String meal = "";
        int cycleLength = menu.getCycleLength();
        int dateLength = menu.getDayLength(cycle);
        int timeLength = menu.getTimeLength(cycle, day);
        int foodLength = menu.getFoodLength(cycle, day, time);
        int i = 0;

        while (i != foodLength) {

            meal = meal + "\n" + menu.getMenu(cycle, day, time).get(i).getName();
            System.out.println(meal);

            i++;
        }



        return meal;
    }
}
