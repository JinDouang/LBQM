package com.lbqm.longbeachquickmenu.shared;

/**
 * Created by jin on 14/03/2018.
 */

// This Singleton class will be used for annex information (categories, map...)
public class Singleton {
    private static final Singleton ourInstance = new Singleton();

    public static String customVar = "Hello";
    public static int hall = -1;
    public static int cycle = -1;
    public static int day = -1;
    public static int category = -1;

    /* TODO Use variale 'categories[]' in this class and make it use for MainActivity and other menu */

    /* List of categories */
    public static String categories[] = {"Breakfast", "Lunch", "Dinner"};
    /* category chosen */
    public static String categoryFiltered;
    /* category position variable to keep the view updated using this variable */
    public static int position;

    public Singleton() {
    }


    public void method() {}
    public void setHall() {}
    public int getHall() {return hall;}
    public void setCycle() {}
    public int getCycle() {return cycle;}
    public void setDay() {}
    public int getDay() {return day;}
    public void setCategory() {}
    public int getCategory() {return category;}
}
