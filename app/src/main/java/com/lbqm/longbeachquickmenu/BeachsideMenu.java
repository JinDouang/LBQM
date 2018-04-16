package com.lbqm.longbeachquickmenu;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.lbqm.longbeachquickmenu.database.DatabaseBeachsideMenu;
import com.lbqm.longbeachquickmenu.shared.services.CalendarService;
import com.lbqm.longbeachquickmenu.shared.services.SpinnerService;

/**
 * Created by jin on 25/02/2018.
 */

public class BeachsideMenu extends AppCompatActivity {
    public static boolean isActive = false;

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

        DatabaseBeachsideMenu db = new DatabaseBeachsideMenu();

        // Trying to print
        System.out.println("Beachside: " + db.getMenu(0,0,0));
    }
}
