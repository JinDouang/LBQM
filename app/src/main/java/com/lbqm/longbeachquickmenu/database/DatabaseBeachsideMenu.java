package com.lbqm.longbeachquickmenu.database;

import java.util.ArrayList;

public class DatabaseBeachsideMenu {

    private ArrayList<Food>[][][] menu = new ArrayList[5][7][3];

    public ArrayList<Food> getMenu(int cycle, int day, int time){
        System.out.println("going there");
        return menu[cycle][day][time];
    }

    public DatabaseBeachsideMenu() {

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
        menu[0][0][0].add(new Food("Cream of Rice", "Breakfast Bar"));
        menu[0][0][0].add(new Food("French Toast", "Breakfast Bar"));
        menu[0][0][0].add(new Food("Turkey Sausage Patty", "Breakfast Bar"));
        menu[0][0][0].add(new Food("Country Potatoes w/ Peppers & Onions", "Breakfast Bar"));

        //Lunch
        menu[0][0][1].add(new Food("Chicken Noodle", "Soups 1"));
        menu[0][0][1].add(new Food("Broccoli Cheddar", "Soups 1"));
        menu[0][0][1].add(new Food("Caprese Salad", "The Bar (Entrée)"));
        menu[0][0][1].add(new Food("Chicken Fajita", "At Home (Entrée)"));
        menu[0][0][1].add(new Food("Tofu Fajita", "Vegetarian/Vegan (Entrée)"));
        menu[0][0][1].add(new Food("Hamburgers", "Grill"));
        menu[0][0][1].add(new Food("BBQ Chicken", "Pizza Station (Entrée)"));
        menu[0][0][1].add(new Food("Peach Cobler", "Sweets"));

        //Dinner
        menu[0][0][2].add(new Food("Chicken Noodle", "Soups 1"));
        menu[0][0][2].add(new Food("Broccoli Cheddar", "Soups 1"));
        menu[0][0][2].add(new Food("Caesar Salad", "The Bar (Entrée)"));
        menu[0][0][2].add(new Food("Chicken & Broccoli Divan ", "At Home (Entrée)"));
        menu[0][0][2].add(new Food("Veg Lentil Stew", "Vegetarian/Vegan (Entrée)"));
        menu[0][0][2].add(new Food("Hot Dog w/ All The Fixings", "Grill"));
        menu[0][0][2].add(new Food("BBQ Chicken", "Pizza Station (Entrée)"));
        menu[0][0][2].add(new Food("Lemon Meringue Pie", "Sweets"));

        //Tuesday
        //Breakfast
        menu[0][1][0].add(new Food("Grits", "Breakfast Bar"));
        menu[0][1][0].add(new Food("Chorizo & Veggie Burrito", "Breakfast Bar"));
        menu[0][1][0].add(new Food("Sausage Links", "Breakfast Bar"));
        menu[0][1][0].add(new Food("Hash Brown Patty", "Breakfast Bar"));

        //Lunch
        menu[0][1][1].add(new Food("Sausage & Lentil", "Soups 1"));
        menu[0][1][1].add(new Food("Italian Ravioli", "Soups 1"));
        menu[0][1][1].add(new Food("Chili Bar", "The Bar (Entrée)"));
        menu[0][1][1].add(new Food("BBQ Thai Chicken", "At Home (Entrée)"));
        menu[0][1][1].add(new Food("Vegetable Wellington", "Vegetarian/Vegan (Entrée)"));
        menu[0][1][1].add(new Food("Bell Pepper & Sausage Sandwich", "Grill"));
        menu[0][1][1].add(new Food("Veggie", "Pizza Station (Entrée)"));
        menu[0][1][1].add(new Food("Bread Pudding", "Sweets"));

        //Dinner
        menu[0][1][2].add(new Food("Sausage & Lentil", "Soups 1"));
        menu[0][1][2].add(new Food("Italian Ravioli", "Soups 1"));
        menu[0][1][2].add(new Food("Chipotle Chicken Salad O", "The Bar (Entrée)"));
        menu[0][1][2].add(new Food("Steak w/ Mushrooms & Onions", "At Home (Entrée)"));
        menu[0][1][2].add(new Food("Roasted Tofu/Edamame ", "Vegetarian/Vegan (Entrée)"));
        menu[0][1][2].add(new Food("Southwest Chicken Quesadilla", "Grill"));
        menu[0][1][2].add(new Food("Veggie", "Pizza Station (Entrée)"));
        menu[0][1][2].add(new Food("Bread Pudding", "Sweets"));

        //Wednesday
        //Breakfast
        menu[0][2][0].add(new Food("Sweet Rice w/ Milk", "Breakfast Bar"));
        menu[0][2][0].add(new Food("Biscuits & Gravy", "Breakfast Bar"));
        menu[0][2][0].add(new Food("Coned Beef Hash", "Breakfast Bar"));
        menu[0][2][0].add(new Food("Hash Brown", "Breakfast Bar"));

        //Lunch
        menu[0][2][1].add(new Food("Beef & Potato", "Soups 1"));
        menu[0][2][1].add(new Food("Corn Chowder", "Soups 1"));
        menu[0][2][1].add(new Food("Greek Salad", "The Bar (Entrée)"));
        menu[0][2][1].add(new Food("Chicken Parmesan", "At Home (Entrée)"));
        menu[0][2][1].add(new Food("Gardein Chicken Fajitas", "Vegetarian/Vegan (Entrée)"));
        menu[0][2][1].add(new Food("Taco Station", "Grill"));
        menu[0][2][1].add(new Food("Hawaiian", "Pizza Station (Entrée)"));
        menu[0][2][1].add(new Food("Lemon Cake", "Sweets"));

        //Dinner
        menu[0][2][2].add(new Food("Beef & Potato", "Soups 1"));
        menu[0][2][2].add(new Food("Corn Chowder", "Soups 1"));
        menu[0][2][2].add(new Food("Oriental Vegetable Salad", "The Bar (Entrée)"));
        menu[0][2][2].add(new Food("Moroccan Chicken w/ Couscous", "At Home (Entrée)"));
        menu[0][2][2].add(new Food("Eggplant Parmesan", "Vegetarian/Vegan (Entrée)"));
        menu[0][2][2].add(new Food("Hamburgers", "Grill"));
        menu[0][2][2].add(new Food("Hawaiian", "Pizza Station (Entrée)"));
        menu[0][2][2].add(new Food("Chocolate Pudding Pie ", "Sweets"));

        //Thursday
        //Breakfast
        menu[0][3][0].add(new Food("Cream of Wheat", "Breakfast Bar"));
        menu[0][3][0].add(new Food("Waffles", "Breakfast Bar"));
        menu[0][3][0].add(new Food("Bacon", "Breakfast Bar"));
        menu[0][3][0].add(new Food("Tater Tots", "Breakfast Bar"));

        //Lunch
        menu[0][3][1].add(new Food("Chicken Noodle", "Soups 1"));
        menu[0][3][1].add(new Food("Butternut Squash", "Soups 1"));
        menu[0][3][1].add(new Food("Chopped Salad", "The Bar (Entrée)"));
        menu[0][3][1].add(new Food("Pasta Station", "At Home (Entrée)"));
        menu[0][3][1].add(new Food("BBQ Tofu Steak", "Vegetarian/Vegan (Entrée)"));
        menu[0][3][1].add(new Food("Bahn Mi Sandwich", "Grill"));
        menu[0][3][1].add(new Food("Pepperoni w/ Jalapeño", "Pizza Station (Entrée)"));
        menu[0][3][1].add(new Food("Red Velvet Cup Cake", "Sweets"));

        //Dinner
        menu[0][3][2].add(new Food("Chicken Noodle", "Soups 1"));
        menu[0][3][2].add(new Food("Butternut Squash", "Soups 1"));
        menu[0][3][2].add(new Food("Mexican Caesar Salad", "The Bar (Entrée)"));
        menu[0][3][2].add(new Food("Beef/Cheese Enchiladas", "At Home (Entrée)"));
        menu[0][3][2].add(new Food("Gardien Chicken & Onions", "Vegetarian/Vegan (Entrée)"));
        menu[0][3][2].add(new Food("3 Cheese Grilled Cheese", "Grill"));
        menu[0][3][2].add(new Food("Veggie", "Pizza Station (Entrée)"));
        menu[0][3][2].add(new Food("Red Velvet Cup Cake", "Sweets"));

        //Friday
        //Breakfast
        menu[0][4][0].add(new Food("Cinnamon Rice", "Breakfast Bar"));
        menu[0][4][0].add(new Food("Egg & Sausage Muffin Sandwich", "Breakfast Bar"));
        menu[0][4][0].add(new Food("Little Smokies", "Breakfast Bar"));
        menu[0][4][0].add(new Food("Hash Brown Patty", "Breakfast Bar"));

        //Lunch
        menu[0][4][1].add(new Food("Clam Chowder", "Soups 1"));
        menu[0][4][1].add(new Food("Vegetable Noodle", "Soups 1"));
        menu[0][4][1].add(new Food("Santé Fe Salad", "The Bar (Entrée)"));
        menu[0][4][1].add(new Food("Cajun Chicken", "At Home (Entrée)"));
        menu[0][4][1].add(new Food("Edamame Fried Rice w/ Pot Stickers", "Vegetarian/Vegan (Entrée)"));
        menu[0][4][1].add(new Food("Shredded Corned Beef Sandwich", "Grill"));
        menu[0][4][1].add(new Food("Combo", "Pizza Station (Entrée)"));
        menu[0][4][1].add(new Food("German Chocolate Cake", "Sweets"));

        //Dinner
        menu[0][4][2].add(new Food("Clam Chowder", "Soups 1"));
        menu[0][4][2].add(new Food("Vegetable Noodle", "Soups 1"));
        menu[0][4][2].add(new Food("Chili Bar", "The Bar (Entrée)"));
        menu[0][4][2].add(new Food("Pan Seared Scallops w/ Pasta", "At Home (Entrée)"));
        menu[0][4][2].add(new Food("Gardien Stir Fry Beef", "Vegetarian/Vegan (Entrée)"));
        menu[0][4][2].add(new Food("Pulled BBQ Salmon Sandwich", "Grill"));
        menu[0][4][2].add(new Food("Combo", "Pizza Station (Entrée)"));
        menu[0][4][2].add(new Food("Lucky Charm Cupcake", "Sweets"));

        //Saturday
        //Breakfast
        menu[0][5][0].add(new Food("Cream of Wheat", "Breakfast Bar"));
        menu[0][5][0].add(new Food("Cinnamon Rolls", "Breakfast Bar"));
        menu[0][5][0].add(new Food("Sausage Links", "Breakfast Bar"));
        menu[0][5][0].add(new Food("Roasted Herb Potatoes", "Breakfast Bar"));

        //Lunch
        menu[0][5][1].add(new Food("Sausage & Kale", "Soups 1"));
        menu[0][5][1].add(new Food("Garden Vegetable", "Soups 1"));
        menu[0][5][1].add(new Food("Asian Cole Slaw ", "The Bar (Entrée)"));
        menu[0][5][1].add(new Food("Chicken Ranchero ", "At Home (Entrée)"));
        menu[0][5][1].add(new Food("Bowtie Pasta Primavera", "Vegetarian/Vegan (Entrée)"));
        menu[0][5][1].add(new Food("Combo", "Pizza Station (Entrée)"));

        //Dinner
        menu[0][5][2].add(new Food("Sausage & Kale", "Soups 1"));
        menu[0][5][2].add(new Food("Garden Vegetable", "Soups 1"));
        menu[0][5][2].add(new Food("Pasta Bar", "The Bar (Entrée)"));
        menu[0][5][2].add(new Food("Beef Fajitas", "At Home (Entrée)"));
        menu[0][5][2].add(new Food("Gardein Chicken Fajitas", "Vegetarian/Vegan (Entrée)"));
        menu[0][5][2].add(new Food("Pastrami on French Roll", "Grill"));
        menu[0][5][2].add(new Food("Pesto Chicken", "Pizza Station (Entrée)"));

        //Sunday
        //Breakfast
        menu[0][6][0].add(new Food("Cream of Rice", "Breakfast Bar"));
        menu[0][6][0].add(new Food("Pancakes", "Breakfast Bar"));
        menu[0][6][0].add(new Food("Little Smokies", "Breakfast Bar"));
        menu[0][6][0].add(new Food("Hash Brown", "Breakfast Bar"));

        //Lunch
        menu[0][6][1].add(new Food("Beef & Rice", "Soups 1"));
        menu[0][6][1].add(new Food("Cream of Broccoli", "Soups 1"));
        menu[0][6][1].add(new Food("Cucumber Tomato", "The Bar (Entrée)"));
        menu[0][6][1].add(new Food("Swedish Meatballs w/ Noodles", "At Home (Entrée)"));
        menu[0][6][1].add(new Food("Vegetable Lasagna", "Vegetarian/Vegan (Entrée)"));
        menu[0][6][1].add(new Food("Pico de Fruta", "Pizza Station (Entrée)"));

        //Dinner
        menu[0][6][2].add(new Food("Beef & Rice", "Soups 1"));
        menu[0][6][2].add(new Food("Cream of Broccoli", "Soups 1"));
        menu[0][6][2].add(new Food("Cobb Salad", "The Bar (Entrée)"));
        menu[0][6][2].add(new Food("Fried Chicken", "At Home (Entrée)"));
        menu[0][6][2].add(new Food("Mac-&-Cheese", "Vegetarian/Vegan (Entrée)"));
        menu[0][6][2].add(new Food("BBQ Pulled Pork Sandwich\n", "Grill"));
        menu[0][6][2].add(new Food("Veggie", "Pizza Station (Entrée)"));
    }


}
