package com.lbqm.longbeachquickmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        /*
        Set button for each menu in order to redirect to their own view.
        */
        Button Beach = findViewById(R.id.BeachsideMenu);
        Beach.setOnClickListener(this);

        Button Hill = findViewById(R.id.HillsideMenu);
        Hill.setOnClickListener(this);

        Button Park = findViewById(R.id.ParksideMenu);
        Park.setOnClickListener(this);


        /*
        Access Calendar
        */
        setCalendar();

    }

    /*
    Start new activity if id chosen is clicked.
    */
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

    public void setCalendar() {
        FrameLayout bottomNav = findViewById(R.id.bottomNav);
        LinearLayout bottomContent = bottomNav.findViewById(R.id.bottomContent);
        Button Calendar = bottomContent.findViewById(R.id.CalendarViewButton);
        Calendar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CalendarActivity.class));
            }
        });

    }
}
