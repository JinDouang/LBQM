package com.lbqm.longbeachquickmenu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.lbqm.longbeachquickmenu.database.DatabaseBeachsideMenu;
import com.lbqm.longbeachquickmenu.database.Food;
import com.lbqm.longbeachquickmenu.shared.SpinnerService;

import java.util.ArrayList;

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
