package com.lbqm.longbeachquickmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    /* Init spinner button */
    Spinner sp;

    /* List of category */
    String categories[] = {"Breakfast", "Lunch", "Dinner"};
    ArrayAdapter<String> adapter;


    /* data variable that will be used to obtain category value */
    String dataCategory= "";

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
        new Calendar(MainActivity.this).setCalendar();

        /*
        * set button spinner to switch category
        * */
        setSpinner();

    }

    /*
    Method that will make view category
    */
    private void setSpinner() {
        sp = findViewById(R.id.spinner);
        adapter = new ArrayAdapter<>(this, R.layout.spinner_item, categories);
        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        dataCategory = "Breakfast";
                        System.out.println("Category: " + dataCategory);
                        break;
                    case 1:
                        dataCategory = "Lunch";
                        System.out.println("Category: " + dataCategory);
                        break;
                    case 2:
                        dataCategory = "Dinner";
                        System.out.println("Category: " + dataCategory);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
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
}
