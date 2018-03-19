package com.lbqm.longbeachquickmenu.shared;

/**
 * Created by jin on 14/03/2018.
 */

// This Singleton class will be used for annex information (categories, map...)
public class Singleton {

    /* List of categories */
    public static String categories[] = {"Breakfast", "Lunch", "Dinner"};
    /* category chosen */
    public static String categoryFiltered;
    /* category position variable to keep the view updated using this variable */
    public static int position;

    public Singleton() {
    }
}
