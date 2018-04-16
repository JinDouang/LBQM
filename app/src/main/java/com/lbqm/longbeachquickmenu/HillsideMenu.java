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

import com.lbqm.longbeachquickmenu.database.DatabaseHillsideMenu;
import com.lbqm.longbeachquickmenu.shared.Singleton;
import com.lbqm.longbeachquickmenu.shared.services.CalendarService;
import com.lbqm.longbeachquickmenu.shared.services.SpinnerService;

/**
 * Created by jin on 25/02/2018.
 */

public class HillsideMenu extends AppCompatActivity {

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
            actionBar.setCustomView(R.layout.hillside_title);
        }
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
                        new CalendarService(HillsideMenu.this).setCalendar();
                        return true;
                }
                return false;
            }
        });

        /* Access CalendarService from top navigation */
        new CalendarService(HillsideMenu.this).setCalendar();
        /* set button spinner to switch category */
        new SpinnerService(HillsideMenu.this).setSpinner();

        singleton.setHall(2);
        int cycle = singleton.getCycle(Singleton.weekOfYear);
        int day = singleton.getDay();
        int time = singleton.getCategory();

        TextView newtext = findViewById(R.id.textViewTest2);

        newtext.setText(fullMeal(cycle,day,time));


        /* newtext updated (see SpinnerService) */
        /* TODO missing the view updated with date (need to change CalendarService) */

    }

    public static String fullMeal(int cycle, int day, int time) {
        DatabaseHillsideMenu menu = new DatabaseHillsideMenu();
        StringBuilder meal = new StringBuilder();
        int foodLength = menu.getFoodLength(cycle, day, time);

        for (int i = 0; i != foodLength; i++) {
            meal.append("\n").append(menu.getMenu(cycle, day, time).get(i).getName());
        }

        if (meal.toString().equals("")) {
            meal = new StringBuilder("No dining hall for this day");
        }

        Log.d("[Hillside Meal Method]", String.valueOf(meal));
        return meal.toString();
    }
}
