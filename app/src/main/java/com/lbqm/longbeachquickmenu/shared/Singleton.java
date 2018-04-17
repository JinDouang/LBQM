package com.lbqm.longbeachquickmenu.shared;

import android.util.Log;

import com.lbqm.longbeachquickmenu.HillsideMenu;
import com.lbqm.longbeachquickmenu.database.DatabaseHillsideMenu;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by jin on 14/03/2018.
 */

// This Singleton class will be used for annex information (categories, map...)
public class Singleton {
    private static final Singleton ourInstance = new Singleton();

    public static int hall = -1;
    public static int cycle = -1;
    public static int day = -1;
    public static int category = -1;

    public static int weekOfYear = -1;

    /* List of categories */
    public static String categories[] = {"Breakfast", "Lunch", "Dinner"};
    /* category chosen */
    public static String categoryFiltered;
    /* category position variable to keep the view updated using this variable */
    public static int position;

    public Singleton() {
    }

    public void setHall(int h) {
        //0 beachside, 1 parkside, 2 hillside
        hall = h;
        System.out.println("Singleton hall: " + hall);
    }

    public int getCycle(int week) {
        //if hillside
        if (hall == 2){
            if (week <= 13) {
                cycle = week % 5;
            }
            if (week > 13 && week <= 19){
                cycle = (week-1) % 5;
            }
            if (week >= 35 && week <= 47){
                cycle = week % 5;
            }
            if (week > 47 && week < 50){
                cycle = (week-1) % 5;
            }
        }

        System.out.println("Week of year: " + week);
        System.out.println("Singleton Cycle: "+(cycle+1));
        return cycle;
    }

    public int getDay() {
        return day;
    }

    public int getCategory() {
        return category;
    }

}
