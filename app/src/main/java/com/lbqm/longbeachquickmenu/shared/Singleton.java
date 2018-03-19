package com.lbqm.longbeachquickmenu.shared;


/**
 * Created by jin on 14/03/2018.
 */

public class Singleton {
    private static final Singleton ourInstance = new Singleton();

    /* List of categories */
    public static String categories[] = {"Breakfast", "Lunch", "Dinner"};
    /* category chosen */
    public static String categoryFiltered;
    /* category position variable to keep the view updated using this variable */
    public static int position;


    /* Return the instance, can use getInstance and call another method
     e.g Singleton.getInstance().method
     */
    public static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {
    }

    public void method() {}
}
