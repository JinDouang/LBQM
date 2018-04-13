package com.lbqm.longbeachquickmenu;

import android.content.Intent;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.lbqm.longbeachquickmenu.shared.services.CalendarService;
import com.lbqm.longbeachquickmenu.shared.services.SpinnerService;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
            actionBar.setCustomView(R.layout.main_title);
        }
        setContentView(R.layout.activity_main);

        /* Set button for each menu in order to redirect to their own view. */
        Button Beach = findViewById(R.id.BeachsideMenu);
        Beach.setOnClickListener(this);

        Button Hill = findViewById(R.id.HillsideMenu);
        Hill.setOnClickListener(this);

        Button Park = findViewById(R.id.ParksideMenu);
        Park.setOnClickListener(this);


        /* Remove nav menu */
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.getMenu().removeItem(R.id.navigation_menu);
    }

    /* Resume this activity when one activity is done */
    @Override
    public void onResume() {
        super.onResume();
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_campus:
                        startActivity(new Intent(MainActivity.this, MapsActivity.class));
                        return true;
                    case R.id.navigation_calendar:
                        new CalendarService(MainActivity.this).setCalendar();
                        return true;
                }
                return false;
            }
        });
        new CalendarService(MainActivity.this).setCalendar();
        new SpinnerService(MainActivity.this).setSpinner();
    }

    /* Start new activity if id chosen is clicked. */
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.BeachsideMenu:
                Intent BeachSide = new Intent(MainActivity.this, BeachsideMenu.class);
                startActivity(BeachSide);
                break;
            case R.id.HillsideMenu:
                Intent HillSide = new Intent(MainActivity.this, HillsideMenu.class);
                startActivity(HillSide);
                break;
            case R.id.ParksideMenu:
                Intent ParkSide = new Intent(MainActivity.this, ParksideMenu.class);
                startActivity(ParkSide);
                break;
        }
    }
}
