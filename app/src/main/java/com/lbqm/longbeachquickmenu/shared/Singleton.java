package com.lbqm.longbeachquickmenu.shared;

/**
 * Created by jin on 14/03/2018.
 */

// This Singleton class will be used for annex information (categories, map...)
public class Singleton {

    public static int hall;
    public static int cycle;
    public static int day;
    public static int category;

    public static int weekOfYear;

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
        System.out.println("Singleton Cycle: " + (cycle + 1));
        return cycle;
    }

    public int getDay() {
        return day;
    }

    public int getCategory() {
        return category;
    }

}
