package com.lbqm.longbeachquickmenu.database;

public class Food {
    private String name;
    private String category;

    public Food(String n, String c) {
        name = n;
        category = c;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString(){
        return name;
    }
}
