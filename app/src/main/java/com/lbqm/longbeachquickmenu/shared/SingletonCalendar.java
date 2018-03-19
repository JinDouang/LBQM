package com.lbqm.longbeachquickmenu.shared;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by jin on 18/03/2018.
 */

public class SingletonCalendar {
    public static String Date =  new SimpleDateFormat("MMMM dd, yyyy").format(new Date());

    public SingletonCalendar() {
    }
}
