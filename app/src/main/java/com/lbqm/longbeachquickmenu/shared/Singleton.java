package com.lbqm.longbeachquickmenu.shared;


/**
 * Created by jin on 14/03/2018.
 */

public class Singleton {
    private static final Singleton ourInstance = new Singleton();

    public static String customVar = "Hello";

    /* TODO Use variale 'categories[]' in this class and make it use for MainActivity and other menu */


    /* Return the instance, can use getInstance and call another method
    * e.g Singleton.getInstance().method
    * */
    public static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {
    }

    public void method() {}
}
