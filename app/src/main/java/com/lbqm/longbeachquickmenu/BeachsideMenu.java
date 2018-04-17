package com.lbqm.longbeachquickmenu;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

import com.lbqm.longbeachquickmenu.database.DatabaseBeachsideMenu;
import com.lbqm.longbeachquickmenu.database.DatabaseHillsideMenu;
import com.lbqm.longbeachquickmenu.shared.Singleton;
import com.lbqm.longbeachquickmenu.shared.services.CalendarService;
import com.lbqm.longbeachquickmenu.shared.services.SpinnerService;

/**
 * Created by jin on 25/02/2018.
 */

public class BeachsideMenu extends AppCompatActivity {
    public static boolean isActive = false;

    Singleton singleton = new Singleton();


    @Override
    protected void onStart() {
        super.onStart();
        isActive = true;
    }

    @Override
    protected void onPause() {
        super.onPause();
        isActive = false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
            actionBar.setCustomView(R.layout.beachside_title);
        }
        setContentView(R.layout.beachside_menu);

       /* Access to the Bottom Navigation View */
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_campus:
                        startActivity(new Intent(BeachsideMenu.this, MapsActivity.class));
                        return true;
                    case R.id.navigation_menu:
                        startActivity(new Intent(BeachsideMenu.this, MainActivity.class));
                        return true;
                    case R.id.navigation_calendar:
                        new CalendarService(BeachsideMenu.this).setCalendar();
                        return true;
                }
                return false;
            }
        });

        /* Access CalendarService from top navigation */
        new CalendarService(BeachsideMenu.this).setCalendar();
        /* set button spinner to switch category */
        new SpinnerService(BeachsideMenu.this).setSpinner();

        singleton.setHall(2);
        int cycle = singleton.getCycle(Singleton.weekOfYear);
        int day = singleton.getDay();
        int time = singleton.getCategory();

        TextView menu = findViewById(R.id.menu);

        menu.setText(BeachsideMenu.getMenu(cycle,day,time));
    }

    public static String getMenu(int cycle, int day, int time) {
        DatabaseBeachsideMenu menu = new DatabaseBeachsideMenu();
        StringBuilder meal = new StringBuilder();
        int foodLength = menu.getFoodLength(cycle, day, time);

        for (int i = 0; i != foodLength; i++) {
            meal.append("\n").append(menu.getMenu(cycle, day, time).get(i).getName());
        }

        if (meal.toString().equals("")) {
            meal = new StringBuilder("No dining hall for this day");
        }

        Log.d("[Beachside Meal Method]", String.valueOf(meal));
        return meal.toString();
    }
}
