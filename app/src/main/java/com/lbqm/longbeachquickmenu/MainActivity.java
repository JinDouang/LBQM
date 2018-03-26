package com.lbqm.longbeachquickmenu;

import android.app.DatePickerDialog;
import android.content.Intent;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.lbqm.longbeachquickmenu.shared.services.CalendarService;
import com.lbqm.longbeachquickmenu.shared.services.SpinnerService;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private DatePickerDialog.OnDateSetListener mDateSetListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Set button for each menu in order to redirect to their own view. */
        Button Beach = findViewById(R.id.BeachsideMenu);
        Beach.setOnClickListener(this);

        Button Hill = findViewById(R.id.HillsideMenu);
        Hill.setOnClickListener(this);

        Button Park = findViewById(R.id.ParksideMenu);
        Park.setOnClickListener(this);

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.getMenu().removeItem(R.id.navigation_menu);

        /* Access Campus */
//        Button Campus = (MainActivity.this).findViewById(R.id.CampusViewButton);
//        Campus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(v.getContext(), MapsActivity.class));
//            }
//        });


//        navigation.getMenu().getItem(R.id.navigation_campus).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
//            @Override
//            public boolean onMenuItemClick(MenuItem item) {
//                startActivity(new Intent(MainActivity.this, MapsActivity.class));
//                return false;
//            }
//        });

//        MenuItem Campus = navigation.getMenu().getItem(R.id.navigation_campus);
//        Campus.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
//            @Override
//            public boolean onMenuItemClick(MenuItem item) {
//                startActivity(new Intent(MainActivity.this, MapsActivity.class));
//                return false;
//            }
//        });

        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_campus:
                        startActivity(new Intent(MainActivity.this, MapsActivity.class));
                        return true;
                }
                return false;
            }
        });

        /* Access CalendarService */
      //  new CalendarService(MainActivity.this).setCalendar();

        /* set button spinner to switch category */
        new SpinnerService(MainActivity.this).setSpinner();

    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.navigation, menu);
//        MenuItem Campus = menu.findItem(R.id.navigation_campus);
//        Campus.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
//            @Override
//            public boolean onMenuItemClick(MenuItem item) {
//                startActivity(new Intent(MainActivity.this, MapsActivity.class));
//                return false;
//            }
//        });
//        return true;
//    }


    /* Resume this activity when one activity is done */
    @Override
    public void onResume() {
        super.onResume();
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
