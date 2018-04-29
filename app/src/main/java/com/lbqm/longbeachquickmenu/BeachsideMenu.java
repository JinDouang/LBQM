package com.lbqm.longbeachquickmenu;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.lbqm.longbeachquickmenu.database.DatabaseBeachsideMenu;
import com.lbqm.longbeachquickmenu.shared.Singleton;
import com.lbqm.longbeachquickmenu.shared.services.CalendarMenuService;
import com.lbqm.longbeachquickmenu.shared.services.SpinnerMenuService;

import java.util.ArrayList;
import java.util.List;

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
                        new CalendarMenuService(BeachsideMenu.this).setCalendar();
                        return true;
                }
                return false;
            }
        });

        /* Access CalendarMenuService from top navigation */
        new CalendarMenuService(BeachsideMenu.this).setCalendar();
        /* set button spinner to switch category */
        new SpinnerMenuService(BeachsideMenu.this).setSpinner();

        singleton.setHall(0);
        ListView menu = findViewById(R.id.menu);
        TextView empty = findViewById(R.id.textCenter);

        ArrayAdapter<String> listFood = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                BeachsideMenu.getMenu(singleton.getCycle(Singleton.weekOfYear), singleton.getDay(), singleton.getCategory()));

        if (listFood.isEmpty()) {
            empty.setVisibility(View.VISIBLE);
        } else {
            empty.setVisibility(View.INVISIBLE);
            /* Setting the android ListView's adapter to the newly created adapter */
            menu.setAdapter(listFood);
        }

        /* Menu updated (see SpinnerMenuService/CalendarMenuService) */
    }

    public static List<String> getMenu(int cycle, int day, int time) {
        DatabaseBeachsideMenu menu = new DatabaseBeachsideMenu();

        List<String> food = new ArrayList<>();

        int foodLength = menu.getFoodLength(cycle, day, time);

        for (int i = 0; i != foodLength; i++) {
            food.add(menu.getMenu(cycle, day, time).get(i).getName());
        }

        return food;
    }
}
