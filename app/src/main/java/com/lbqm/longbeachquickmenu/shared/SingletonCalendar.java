package com.lbqm.longbeachquickmenu.shared;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by jin on 18/03/2018.
 */

public class SingletonCalendar {
    private static final SingletonCalendar ourInstance = new SingletonCalendar();

    public static String Date =  new SimpleDateFormat("MMMM dd, yyyy").format(new Date());

    /* Return the instance, can use getInstance and call another method
     e.g Singleton.getInstance().method
     */
    public static SingletonCalendar getInstance() {
        return ourInstance;
    }

    private SingletonCalendar() {
    }

    public void method() {}
}
