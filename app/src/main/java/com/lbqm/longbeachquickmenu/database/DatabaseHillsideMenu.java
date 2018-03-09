package com.lbqm.longbeachquickmenu.database;

import java.util.ArrayList;

public class DatabaseHillsideMenu {

    private ArrayList<Food>[][][] menu = new ArrayList[5][7][3];

    public ArrayList<Food> getMenu(int cycle, int day, int time){
        return menu[cycle][day][time];
    }

    public DatabaseHillsideMenu() {

        //Loop through 3d database and initialize every ArrayList to prevent "generic array creation" crash
        for (int c = 0; c < 5; c++){
            for (int d = 0; d < 7; d++){
                for (int t = 0; t < 3; t++){
                    menu[c][d][t] = new ArrayList<Food>();
                }
            }
        }

        //Cycle 1
        //Monday
        //Breakfast
        menu[0][0][0].add(new Food("Cream of Wheat", "Breakfast Bar"));
        menu[0][0][0].add(new Food("Buttermilk Pancakes", "Breakfast Bar"));
        menu[0][0][0].add(new Food("Sausage Patty", "Breakfast Bar"));
        menu[0][0][0].add(new Food("Potato Patty", "Breakfast Bar"));

        //Lunch
        menu[0][0][1].add(new Food("Chicken Enchilada", "Soups 1"));
        menu[0][0][1].add(new Food("Tomato Basil", "Soups 2"));
        menu[0][0][1].add(new Food("Caesar Salad", "Action Station"));
        menu[0][0][1].add(new Food("Chicken Picatta w/ Rice Pilaf", "Main Dish (Entrée)"));
        menu[0][0][1].add(new Food("Assorted Hummus Bar", "Vegetarian/Vegan (Entrée)"));
        menu[0][0][1].add(new Food("Grilled Cheese Sandwich", "Grill"));
        menu[0][0][1].add(new Food("Orange Chicken w/ Rice", "Stir Fry Station"));

        //Dinner
        menu[0][0][1].add(new Food("Chicken Enchilada", "Soups 1"));
        menu[0][0][1].add(new Food("Tomato Basil", "Soups 2"));
        menu[0][0][1].add(new Food("Turkey Club Wrap", "Action Station"));
        menu[0][0][1].add(new Food("Fried Chicken w/ Potatoes", "Main Dish (Entrée)"));
        menu[0][0][1].add(new Food("Mac & Cheese", "Vegetarian/Vegan (Entrée)"));
        menu[0][0][1].add(new Food("Corned Beef Reuben Sandwich", "Grill"));
        menu[0][0][1].add(new Food("Broccoli Beef w/ Rice", "Stir Fry Station"));

        //Tuesday
        //Breakfast


        //Lunch


        //Dinner


        //Wednesday
        //Breakfast


        //Lunch


        //Dinner


        //Thursday
        //Breakfast


        //Lunch


        //Dinner


        //Friday
        //Breakfast


        //Lunch


        //Dinner


        //Saturday
        //Breakfast


        //Lunch


        //Dinner


        //Sunday
        //Breakfast


        //Lunch


        //Dinner

        //End of Cycle 1

        //Cycle 2
        //Monday
        //Breakfast


        //Lunch


        //Dinner


        //Tuesday
        //Breakfast


        //Lunch


        //Dinner


        //Wednesday
        //Breakfast


        //Lunch


        //Dinner


        //Thursday
        //Breakfast


        //Lunch


        //Dinner


        //Friday
        //Breakfast


        //Lunch


        //Dinner


        //Saturday
        //Breakfast


        //Lunch


        //Dinner


        //Sunday
        //Breakfast


        //Lunch


        //Dinner
        
    }


}
