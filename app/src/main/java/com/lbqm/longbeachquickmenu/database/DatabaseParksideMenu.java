package com.lbqm.longbeachquickmenu.database;

import java.util.ArrayList;

/**
 * Created by jorge on 3/20/2018.
 */

public class DatabaseParksideMenu {
    private ArrayList<Food>[][][] menu = new ArrayList[5][7][3];

    public ArrayList<Food> getMenu(int cycle, int day, int time){
        return menu[cycle][day][time];
    }

    public int getFoodLength(int cycle, int day, int time) {
        return menu[cycle][day][time].size();
    }

    public DatabaseParksideMenu() {

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
        menu[0][0][0].add(new Food("Kelbasa Sausage", "Breakfast Bar"));
        menu[0][0][0].add(new Food("Cottage Fries", "Breakfast Bar"));

        //Lunch
        menu[0][0][1].add(new Food("Minestrone Soup", "Soups 1"));
        menu[0][0][1].add(new Food("Broccoli Cheddar", "Soups 2"));
        menu[0][0][1].add(new Food("Caprese Salad", "Action Station"));
        menu[0][0][1].add(new Food("Spicy Miso Pork Ramen", "Main Dish (Entrée)"));
        menu[0][0][1].add(new Food("Stuffed Bell Pepper", "Vegetarian/Vegan (Entrée)"));
        menu[0][0][1].add(new Food("Hamburgers & Turkey Burger", "Grill"));
        menu[0][0][1].add(new Food("Sausage & Mushroom", "Pizza Station (Entrée)"));
        menu[0][0][1].add(new Food("Lemon Meringue Pie", "Sweets"));

        //Dinner
        menu[0][0][2].add(new Food("Broccoli Cheddar", "Soups 1"));
        menu[0][0][2].add(new Food("Minestrone Soup", "Soups 2"));
        menu[0][0][2].add(new Food("Caesar Salad w/ Cilantro Dressing", "Action Station"));
        menu[0][0][2].add(new Food("Beef Lomo Saltado ", "Main Dish (Entrée)"));
        menu[0][0][2].add(new Food("Kung Pao Gardien Chicken", "Vegetarian/Vegan (Entrée)"));
        menu[0][0][2].add(new Food("Pasta w/ Marinara Sauce", "Grill"));
        menu[0][0][2].add(new Food("Sausage & Mushroom", "Pizza Station (Entrée)"));
        menu[0][0][2].add(new Food("Lemon Meringue Pie", "Sweets"));

        //Tuesday
        //Breakfast
        menu[0][1][0].add(new Food("Grits", "Breakfast Bar"));
        menu[0][1][0].add(new Food("Biscuit & Country Gravy", "Breakfast Bar"));
        menu[0][1][0].add(new Food("Sausage Links", "Breakfast Bar"));
        menu[0][1][0].add(new Food("Hash Brown ", "Breakfast Bar"));

        //Lunch
        menu[0][1][1].add(new Food("Ravioli Italian Soup", "Soups 1"));
        menu[0][1][1].add(new Food("Miso Soup", "Soups 2"));
        menu[0][1][1].add(new Food("Kale & Quinoa", "Action Station"));
        menu[0][1][1].add(new Food("BBQ Thai Chicken", "Main Dish (Entrée)"));
        menu[0][1][1].add(new Food("Vegetable Wellington", "Vegetarian/Vegan (Entrée)"));
        menu[0][1][1].add(new Food("Philly Steak Sandwich", "Grill"));
        menu[0][1][1].add(new Food("Buffalo Chicken", "Pizza Station (Entrée)"));
        menu[0][1][1].add(new Food("Bread Pudding", "Sweets"));

        //Dinner
        menu[0][1][2].add(new Food("Miso Soup", "Soups 1"));
        menu[0][1][2].add(new Food("Italian Ravioli", "Soups 2"));
        menu[0][1][2].add(new Food("Apple Walmut Salad", "Action Station"));
        menu[0][1][2].add(new Food("Meat Lasagna", "Main Dish (Entrée)"));
        menu[0][1][2].add(new Food("Brown Rice & Quinoa ", "Vegetarian/Vegan (Entrée)"));
        menu[0][1][2].add(new Food("Chicken Taquitos", "Grill"));
        menu[0][1][2].add(new Food("Buffalo Chicken", "Pizza Station (Entrée)"));
        menu[0][1][2].add(new Food("Bread Pudding", "Sweets"));

        //Wednesday
        //Breakfast
        menu[0][2][0].add(new Food("Sweet Rice w/ Milk", "Breakfast Bar"));
        menu[0][2][0].add(new Food("Chorizo & Egg Burrito", "Breakfast Bar"));
        menu[0][2][0].add(new Food("Chorizo ", "Breakfast Bar"));
        menu[0][2][0].add(new Food("Country Potatoes", "Breakfast Bar"));

        //Lunch
        menu[0][2][1].add(new Food("Beef Barley", "Soups 1"));
        menu[0][2][1].add(new Food("Corn Chowder", "Soups 2"));
        menu[0][2][1].add(new Food("Greek Salad", "Action Station"));
        menu[0][2][1].add(new Food("Baked Tortellini w/ Spinach", "Main Dish (Entrée)"));
        menu[0][2][1].add(new Food("Zesty Orange Gardien Chicken", "Vegetarian/Vegan (Entrée)"));
        menu[0][2][1].add(new Food("Banh Mi Chicken Sandwich", "Grill"));
        menu[0][2][1].add(new Food("Hawaiian", "Pizza Station (Entrée)"));
        menu[0][2][1].add(new Food("Choc Pudding Pie", "Sweets"));

        //Dinner
        menu[0][2][2].add(new Food("Corn Chowder", "Soups 1"));
        menu[0][2][2].add(new Food("Beef Barley", "Soups 2"));
        menu[0][2][2].add(new Food("Hummus Bar", "Action Station"));
        menu[0][2][2].add(new Food("Plum Sauce Meatballs", "Main Dish (Entrée)"));
        menu[0][2][2].add(new Food("Garden Chicken Tenders", "Vegetarian/Vegan (Entrée)"));
        menu[0][2][2].add(new Food("Wings and Things", "Grill"));
        menu[0][2][2].add(new Food("Hawaiian", "Pizza Station (Entrée)"));
        menu[0][2][2].add(new Food("Chocolate Pudding Pie ", "Sweets"));

        //Thursday
        //Breakfast
        menu[0][3][0].add(new Food("Cream of Wheat", "Breakfast Bar"));
        menu[0][3][0].add(new Food("Pancakes", "Breakfast Bar"));
        menu[0][3][0].add(new Food("Sausage Patty", "Breakfast Bar"));
        menu[0][3][0].add(new Food("Tater Tots", "Breakfast Bar"));

        //Lunch
        menu[0][3][1].add(new Food("Turkey Rice", "Soups 1"));
        menu[0][3][1].add(new Food("Tomato Basil", "Soups 2"));
        menu[0][3][1].add(new Food("Falafel Salad", "Action Station"));
        menu[0][3][1].add(new Food("Spaghetti & Meatballs", "Main Dish (Entrée)"));
        menu[0][3][1].add(new Food("Gardein Beef w/ Black Pepper", "Vegetarian/Vegan (Entrée)"));
        menu[0][3][1].add(new Food("Grilled Turkey Pesto Flatbread", "Grill"));
        menu[0][3][1].add(new Food("Ranch Chicken Bacon", "Pizza Station (Entrée)"));
        menu[0][3][1].add(new Food("Red Velvet Cup Cake", "Sweets"));

        //Dinner
        menu[0][3][2].add(new Food("Tomato Basil", "Soups 1"));
        menu[0][3][2].add(new Food("Turkey Rice", "Soups 2"));
        menu[0][3][2].add(new Food("DIY California Sushi Roll", "Action Station"));
        menu[0][3][2].add(new Food("Chicken Piccata", "Main Dish (Entrée)"));
        menu[0][3][2].add(new Food("Gardien Chicken & Onions", "Vegetarian/Vegan (Entrée)"));
        menu[0][3][2].add(new Food("Grilled Cheese Sandwich", "Grill"));
        menu[0][3][2].add(new Food("Ranch Chicken Bacon", "Pizza Station (Entrée)"));
        menu[0][3][2].add(new Food("Red Velvet Cup Cake", "Sweets"));

        //Friday
        //Breakfast
        menu[0][4][0].add(new Food("Cinnamon Rice", "Breakfast Bar"));
        menu[0][4][0].add(new Food("Egg & Sausage Muffin Sandwich", "Breakfast Bar"));
        menu[0][4][0].add(new Food("Bacon", "Breakfast Bar"));
        menu[0][4][0].add(new Food("Potatoes O'Brien", "Breakfast Bar"));

        //Lunch
        menu[0][4][1].add(new Food("Clam Chowder", "Soups 1"));
        menu[0][4][1].add(new Food("Vegetable Noodle", "Soups 2"));
        menu[0][4][1].add(new Food("Fried Chicken Salad", "Action Station"));
        menu[0][4][1].add(new Food("Lemon epper Salmon", "Main Dish (Entrée)"));
        menu[0][4][1].add(new Food("Edamame Fried Rice ", "Vegetarian/Vegan (Entrée)"));
        menu[0][4][1].add(new Food("Fire and Ice Pasta", "Grill"));
        menu[0][4][1].add(new Food("Veggie", "Pizza Station (Entrée)"));
        menu[0][4][1].add(new Food("Lucky Charm Cup Cake", "Sweets"));

        //Dinner
        menu[0][4][2].add(new Food("Vegetable Noodle", "Soups 1"));
        menu[0][4][2].add(new Food("Clam Chowder", "Soups 2"));
        menu[0][4][2].add(new Food("Italian Pasta Salad", "Action Station"));
        menu[0][4][2].add(new Food(" Pasta W/ Alfredo sauce", "Main Dish (Entrée)"));
        menu[0][4][2].add(new Food("Vegetable Lentil Stew", "Vegetarian/Vegan (Entrée)"));
        menu[0][4][2].add(new Food("Breaded Shrimp W/ Biscuit", "Grill"));
        menu[0][4][2].add(new Food("Veggie", "Pizza Station (Entrée)"));
        menu[0][4][2].add(new Food("Lucky Charm Cupcake", "Sweets"));

        //Saturday
        //No dining hall this day

        //Sunday
        //Breakfast
        menu[0][6][0].add(new Food("Cream of Rice", "Breakfast Bar"));
        menu[0][6][0].add(new Food(" French Toast", "Breakfast Bar"));
        menu[0][6][0].add(new Food("Sausage Link", "Breakfast Bar"));
        menu[0][6][0].add(new Food("Hash Brown Triangle", "Breakfast Bar"));

        //Lunch
        menu[0][6][1].add(new Food("", "Soups 1"));
        menu[0][6][1].add(new Food(" ", "Soups 2"));
        menu[0][6][1].add(new Food("Cheese and Pepperoni", "Main Dish (Entrée)"));
        menu[0][6][1].add(new Food("Smoothie Bar", "Vegetarian/Vegan (Entrée)"));

        //Dinner
        menu[0][6][2].add(new Food("Potato Chowder", "Soups 1"));
        menu[0][6][2].add(new Food("Chicken Noodle", "Soups 2"));
        menu[0][6][2].add(new Food("Nacho Bar", "Action Station"));
        menu[0][6][2].add(new Food("Chicken Parmesan", "Main Dish (Entrée)"));
        menu[0][6][2].add(new Food("Vegetable Quiche", "Vegetarian/Vegan (Entrée)"));
        menu[0][6][2].add(new Food("Pasta W/ Marinera Sauce", "Grill"));
        menu[0][6][2].add(new Food("Cheese and Pepperoni", "Pizza Station (Entrée)"));
        //End of Cycle 1

        //Cycle 2
        //Monday
        //Breakfast
        menu[1][0][0].add(new Food("Cream of Rice", "Breakfast Bar"));
        menu[1][0][0].add(new Food(" Pancakes", "Breakfast Bar"));
        menu[1][0][0].add(new Food("kelbasa Sausage", "Breakfast Bar"));
        menu[1][0][0].add(new Food("Cottage Fries", "Breakfast Bar"));

        //Lunch
        menu[1][0][1].add(new Food("Menudo", "Soups 1"));
        menu[1][0][1].add(new Food("Vegetable", "Soups 2"));
        menu[1][0][1].add(new Food("Cobb Salad", "Action Station"));
        menu[1][0][1].add(new Food("Chicken and Spinach Tomato Pasta", "Main Dish (Entrée)"));
        menu[1][0][1].add(new Food("Budda Bowl", "Vegetarian/Vegan (Entrée)"));
        menu[1][0][1].add(new Food("Chicken Tenders", "Grill"));
        menu[1][0][1].add(new Food("Garlic Toast", "Pizza Station (Entrée)"));
        menu[1][0][1].add(new Food(" pumpkin Pie", "Sweets"));

        //Dinner
        menu[1][0][2].add(new Food("Menudo", "Soups 1"));
        menu[1][0][2].add(new Food("Vegetable", "Soups 2"));
        menu[1][0][2].add(new Food("Fattoush salad ", "Action Station"));
        menu[1][0][2].add(new Food("beef or cheese enchiladas", "Main Dish (Entrée)"));
        menu[1][0][2].add(new Food("creamy cauliflower mac and Cheese", "Vegetarian/Vegan (Entrée)"));
        menu[1][0][2].add(new Food("Spinach and Ricotta Cheese Ravioli", "Grill"));
        menu[1][0][2].add(new Food("Garilc toast", "Pizza Station (Entrée)"));
        menu[1][0][2].add(new Food("Pumpkin Pie", "Sweets"));

        //Tuesday
        //Breakfast
        menu[1][1][0].add(new Food("Grits", "Breakfast Bar"));
        menu[1][1][0].add(new Food("Chilaquiles", "Breakfast Bar"));
        menu[1][1][0].add(new Food("Bacon ", "Breakfast Bar"));
        menu[1][1][0].add(new Food("Hash Brown", "Breakfast Bar"));

        //Lunch
        menu[1][1][1].add(new Food("Potato Chowder", "Soups 1"));
        menu[1][1][1].add(new Food("Chicken Tortilla", "Soups 2"));
        menu[1][1][1].add(new Food("Roasted Beef salad ", "Action Station"));
        menu[1][1][1].add(new Food("Filipino pork", "Main Dish (Entrée)"));
        menu[1][1][1].add(new Food("Vegetable Tangine", "Vegetarian/Vegan (Entrée)"));
        menu[1][1][1].add(new Food("Hot Dog Bar ", "Grill"));
        menu[1][1][1].add(new Food("BBQ Chicken", "Pizza Station (Entrée)"));
        menu[1][1][1].add(new Food("Oreo Brownie Bar", "Sweets"));

        //Dinner
        menu[1][1][2].add(new Food("Potato Chowder", "Soups 1"));
        menu[1][1][2].add(new Food("Chicken Tortilla", "Soups 2"));
        menu[1][1][2].add(new Food("Pesto Tortellini Salad", "Action Station"));
        menu[1][1][2].add(new Food("Chicken with Black pepper Sauce", "Main Dish (Entrée)"));
        menu[1][1][2].add(new Food("Fried Avacado Tacos", "Vegetarian/Vegan (Entrée)"));
        menu[1][1][2].add(new Food("Veggie Quesadillas ", "Grill"));
        menu[1][1][2].add(new Food("BBQ Chicken", "Pizza Station (Entrée)"));
        menu[1][1][2].add(new Food("Oreo Brownie Pie", "Sweets"));

        //Wednesday
        //Breakfast
        menu[1][2][0].add(new Food("Sweet Rice w/ Milk", "Breakfast Bar"));
        menu[1][2][0].add(new Food("Breakfast Burrito", "Breakfast Bar"));
        menu[1][2][0].add(new Food("Sausage Links", "Breakfast Bar"));
        menu[1][2][0].add(new Food("Country Potatoes", "Breakfast Bar"));

        //Lunch
        menu[1][2][1].add(new Food("Lentil", "Soups 1"));
        menu[1][2][1].add(new Food("Chicken Noodle", "Soups 2"));
        menu[1][2][1].add(new Food("BrownRice And Quinoa Kale Salad", "Action Station"));
        menu[1][2][1].add(new Food("Orange Chicken Bowl", "Main Dish (Entrée)"));
        menu[1][2][1].add(new Food("Tofu  with White Bean Stew", "Vegetarian/Vegan (Entrée)"));
        menu[1][2][1].add(new Food("Pasta with Alfredo Sauce ", "Grill"));
        menu[1][2][1].add(new Food("Chicken Pesto Pizza with Artichokes", "Pizza Station (Entrée)"));
        menu[1][2][1].add(new Food("Apple Pie", "Sweets"));

        //Dinner
        menu[1][2][2].add(new Food("Lentil", "Soups 1"));
        menu[1][2][2].add(new Food("Chicken Noodle", "Soups 2"));
        menu[1][2][2].add(new Food("Avacado Veggie Sandwich", "Action Station"));
        menu[1][2][2].add(new Food("Blackened Catfish", "Main Dish (Entrée)"));
        menu[1][2][2].add(new Food("Vegetable Barley Stew", "Vegetarian/Vegan (Entrée)"));
        menu[1][2][2].add(new Food("Chicken Chiotle Pasta", "Grill"));
        menu[1][2][2].add(new Food("Chicken Pesto Pizza with Artichokes", "Pizza Station (Entrée)"));
        menu[1][2][2].add(new Food("Apple Pie", "Sweets"));
        //Thursday
        //Breakfast
        menu[1][3][0].add(new Food("Cream of Wheat", "Breakfast Bar"));
        menu[1][3][0].add(new Food("Bisquit and Gravy", "Breakfast Bar"));
        menu[1][3][0].add(new Food("Sausage Patty ", "Breakfast Bar"));
        menu[1][3][0].add(new Food("Tater Tots", "Breakfast Bar"));

        //Lunch
        menu[1][3][1].add(new Food("Tomato Basil", "Soups 1"));
        menu[1][3][1].add(new Food("Sausage and Kale", "Soups 2"));
        menu[1][3][1].add(new Food("DIY Spicy California Sushi roll", "Action Station"));
        menu[1][3][1].add(new Food("Pulled Pork Sandwich", "Main Dish (Entrée)"));
        menu[1][3][1].add(new Food("Gardein Chicken Stir fry", "Vegetarian/Vegan (Entrée)"));
        menu[1][3][1].add(new Food("Grilled Cheese Sandwich ", "Grill"));
        menu[1][3][1].add(new Food("Spinach Artichoke Bread", "Pizza Station (Entrée)"));
        menu[1][3][1].add(new Food("Oatmeal Fruit Bar", "Sweets"));

        //Dinner
        menu[1][3][2].add(new Food("Tomato Basil ", "Soups 1"));
        menu[1][3][2].add(new Food("Sausage and Kale ", "Soups 2"));
        menu[1][3][2].add(new Food("Ceasar Salad", "Action Station"));
        menu[1][3][2].add(new Food("Mac and Cheese Bar", "Main Dish (Entrée)"));
        menu[1][3][2].add(new Food("Gardein beef and Onions", "Vegetarian/Vegan (Entrée)"));
        menu[1][3][2].add(new Food("Sweet and Spicy Pork", "Grill"));
        menu[1][3][2].add(new Food("Spinch Artichoke Bread", "Pizza Station (Entrée)"));
        menu[1][3][2].add(new Food("Oatmeal Fruit Bar", "Sweets"));

        //Friday
        //Breakfast
        menu[1][4][0].add(new Food("Cinnamon Rice", "Breakfast Bar"));
        menu[1][4][0].add(new Food("Egg, Ham, & Cheese Croissant", "Breakfast Bar"));
        menu[1][4][0].add(new Food("Bacon ", "Breakfast Bar"));
        menu[1][4][0].add(new Food("Potatoes O' Brien", "Breakfast Bar"));

        //Lunch
        menu[1][4][1].add(new Food("Minestrone", "Soups 1"));
        menu[1][4][1].add(new Food("Clam Chowder", "Soups 1"));
        menu[1][4][1].add(new Food("Black Bean and Corn Relish", "Action Station"));
        menu[1][4][1].add(new Food("Fish Tacos", "Main Dish (Entrée)"));
        menu[1][4][1].add(new Food("Thai Cury Tofu", "Vegetarian/Vegan (Entrée)"));
        menu[1][4][1].add(new Food("Pasta with Pesto Alfredo", "Grill"));
        menu[1][4][1].add(new Food("Veggie ", "Pizza Station (Entrée)"));
        menu[1][4][1].add(new Food("Fruit Loop Krispy", "Sweets"));

        //Dinner
        menu[1][4][2].add(new Food("Minestrone", "Soups 1"));
        menu[1][4][2].add(new Food("Clam Chowder", "Soups 2"));
        menu[1][4][2].add(new Food("Chicken Ceasar Wrap", "Action Station"));
        menu[1][4][2].add(new Food("Chicken Pot Pie", "Main Dish (Entrée)"));
        menu[1][4][2].add(new Food("Tomato, Eggplant and Potato Stew", "Vegetarian/Vegan (Entrée)"));
        menu[1][4][2].add(new Food("Crispy Fish", "Grill"));
        menu[1][4][2].add(new Food("Veggie", "Pizza Station (Entrée)"));
        menu[1][4][2].add(new Food("Fruit Loop Krispy", "Sweets"));

        //Saturday
        //No dining hall this day

        //Sunday
        //Breakfast
        menu[1][6][0].add(new Food("Cream of Rice", "Breakfast Bar"));
        menu[1][6][0].add(new Food("Pancakes", "Breakfast Bar"));
        menu[1][6][0].add(new Food("Sausage Patty", "Breakfast Bar"));
        menu[1][6][0].add(new Food("Hash Brown Triangle", "Breakfast Bar"));

        //Lunch
        menu[1][6][1].add(new Food("", "Soups 1"));
        menu[1][6][1].add(new Food("", "Soups 2"));
        menu[1][6][1].add(new Food("", "Action Station"));
        menu[1][6][1].add(new Food("", "Main Dish (Entrée)"));
        menu[1][6][1].add(new Food("Smoothy Bar", "Vegetarian/Vegan (Entrée)"));
        menu[1][6][1].add(new Food("Cheese and Pepperoni", "Pizza Station (Entrée)"));

        //Dinner
        menu[1][6][2].add(new Food("Beef & Rice", "Soups 1"));
        menu[1][6][2].add(new Food("VegetableNoodle", "Soups 2"));
        menu[1][6][2].add(new Food("Hummus Bar", "Action Station"));
        menu[1][6][2].add(new Food("Chicken Cordon Bleu", "Main Dish (Entrée)"));
        menu[1][6][2].add(new Food("Black Bean Patty with Pico de Gallo", "Vegetarian/Vegan (Entrée)"));
        menu[1][6][2].add(new Food("Thai Fried Rice with Shrimp", "Grill"));
        menu[1][6][2].add(new Food("Cheese and Pepperoni", "Pizza Station (Entrée)"));

        //Cycle 3
        //Monday
        //Breakfast
        menu[2][0][0].add(new Food("Cream of Rice", "Breakfast Bar"));
        menu[2][0][0].add(new Food(" French Toast", "Breakfast Bar"));
        menu[2][0][0].add(new Food("Kielbasa Sausage", "Breakfast Bar"));
        menu[2][0][0].add(new Food("Cottage Fries", "Breakfast Bar"));

        //Lunch
        menu[2][0][1].add(new Food("Posole", "Soups 1"));
        menu[2][0][1].add(new Food("Potato Chowder", "Soups 2"));
        menu[2][0][1].add(new Food("Avocado Veggie Sandwich", "Action Station"));
        menu[2][0][1].add(new Food("Mongolian Chicken Drumsticks", "Main Dish (Entrée)"));
        menu[2][0][1].add(new Food("Gardein Chicken and Biscuit ", "Vegetarian/Vegan (Entrée)"));
        menu[2][0][1].add(new Food("Pasta with Arrabiata Sauce", "Grill"));
        menu[2][0][1].add(new Food("Hawaiian", "Pizza Station (Entrée)"));
        menu[2][0][1].add(new Food("M&M Bar ", "Sweets"));

        //Dinner
        menu[2][0][2].add(new Food("Posole", "Soups 1"));
        menu[2][0][2].add(new Food("Potato Chowder", "Soups 2"));
        menu[2][0][2].add(new Food("Lettuce Wedge Salad", "Action Station"));
        menu[2][0][2].add(new Food("Chicken Tuscany Stew", "Main Dish (Entrée)"));
        menu[2][0][2].add(new Food("Islander Tofu ", "Vegetarian/Vegan (Entrée)"));
        menu[2][0][2].add(new Food("Baked Pasta with Ricotta Cheese", "Grill"));
        menu[2][0][2].add(new Food("Hawaiian", "Pizza Station (Entrée)"));
        menu[2][0][2].add(new Food("M&M Bar ", "Sweets"));

        //Tuesday
        //Breakfast
        menu[2][1][0].add(new Food("Grits", "Breakfast Bar"));
        menu[2][1][0].add(new Food("Biscuit Sandwich", "Breakfast Bar"));
        menu[2][1][0].add(new Food("Bacon", "Breakfast Bar"));
        menu[2][1][0].add(new Food("Hash Brown", "Breakfast Bar"));

        //Lunch
        menu[2][1][1].add(new Food("MIso soup", "Soups 1"));
        menu[2][1][1].add(new Food("Albondigas", "Soups 2"));
        menu[2][1][1].add(new Food("Citrus Kale Salad", "Action Station"));
        menu[2][1][1].add(new Food("Beef Pho", "Main Dish (Entrée)"));
        menu[2][1][1].add(new Food("Sweet Potato Patties", "Vegetarian/Vegan (Entrée)"));
        menu[2][1][1].add(new Food("Mediterranean salmon", "Grill"));
        menu[2][1][1].add(new Food("BLT Pizza", "Pizza Station (Entrée)"));
        menu[2][1][1].add(new Food("Boston Cream Pie ", "Sweets"));

        //Dinner
        menu[2][1][2].add(new Food("Miso Sup", "Soups 1"));
        menu[2][1][2].add(new Food("Albondigas", "Soups 2"));
        menu[2][1][2].add(new Food("Turkey Cranberry Slad Crosant ", "Action Station"));
        menu[2][1][2].add(new Food("Shrimp Alfredo", "Main Dish (Entrée)"));
        menu[2][1][2].add(new Food("Mushroom Stroganoff", "Vegetarian/Vegan (Entrée)"));
        menu[2][1][2].add(new Food("Pomogranate Glazed Chicken", "Grill"));
        menu[2][1][2].add(new Food("BLT Pizza", "Pizza Station (Entrée)"));
        menu[2][1][2].add(new Food("Boston Cream Pie ", "Sweets"));

        //Wednesday
        //Breakfast
        menu[2][2][0].add(new Food("Sweet Rice w/ Milk", "Breakfast Bar"));
        menu[2][2][0].add(new Food("Hawaiian Breakfast", "Breakfast Bar"));
        menu[2][2][0].add(new Food("Sausage Link", "Breakfast Bar"));
        menu[2][2][0].add(new Food("Country Potatoes", "Breakfast Bar"));

        //Lunch
        menu[2][2][1].add(new Food("Tomato Basil", "Soups 1"));
        menu[2][2][1].add(new Food("chicken and Rice", "Soups 2"));
        menu[2][2][1].add(new Food("DIY Veggie Sushie Roll", "Action Station"));
        menu[2][2][1].add(new Food("Teriaky Chicken Bowl", "Main Dish (Entrée)"));
        menu[2][2][1].add(new Food("Potato and Cauliflower Curry", "Vegetarian/Vegan (Entrée)"));
        menu[2][2][1].add(new Food("Grilled Cheese", "Grill"));
        menu[2][2][1].add(new Food("Taco Pizza", "Pizza Station (Entrée)"));
        menu[2][2][1].add(new Food("Carrot Cake", "Sweets"));

        //Dinner
        menu[2][2][2].add(new Food("Tomao Basil", "Soups 1"));
        menu[2][2][2].add(new Food("Chicken and Rice", "Soups 2"));
        menu[2][2][2].add(new Food("Grecian Chopped Salad", "Action Station"));
        menu[2][2][2].add(new Food("BBQ Pork Ribs with Corn Muffin", "Main Dish (Entrée)"));
        menu[2][2][2].add(new Food("Vegetable Lasagne", "Vegetarian/Vegan (Entrée)"));
        menu[2][2][2].add(new Food("Grilled BEef and Cheddar on Sourdough", "Grill"));
        menu[2][2][2].add(new Food("Taco Pizza", "Pizza Station (Entrée)"));
        menu[2][2][2].add(new Food("Carrot Cake", "Sweets"));

        //Thursday
        //Breakfast
        menu[2][3][0].add(new Food("Cream of Wheat", "Breakfast Bar"));
        menu[2][3][0].add(new Food("Chocolate Pancake", "Breakfast Bar"));
        menu[2][3][0].add(new Food("Sausage Patty ", "Breakfast Bar"));
        menu[2][3][0].add(new Food("Tater Tots", "Breakfast Bar"));

        //Lunch
        menu[2][3][1].add(new Food("Lentil Vegetable", "Soups 1"));
        menu[2][3][1].add(new Food("Cream of Brocolli", "Soups 2"));
        menu[2][3][1].add(new Food("Arululu Salad", "Action Station"));
        menu[2][3][1].add(new Food("Cheese Stuffed Manicetti", "Main Dish (Entrée)"));
        menu[2][3][1].add(new Food("Brocolli and Cheddar Brioche", "Vegetarian/Vegan (Entrée)"));
        menu[2][3][1].add(new Food("Hamburger and Turkey Burger", "Grill"));
        menu[2][3][1].add(new Food("Meat Lovers", "Pizza Station (Entrée)"));
        menu[2][3][1].add(new Food("Pumpkin Pie", "Sweets"));

        //Dinner
        menu[2][3][2].add(new Food("Lentil Vegetable", "Soups 1"));
        menu[2][3][2].add(new Food("Cream of Brocolli ", "Soups 2"));
        menu[2][3][2].add(new Food("Chicken Taco Salad", "Action Station"));
        menu[2][3][2].add(new Food("Lemon Chicken", "Main Dish (Entrée)"));
        menu[2][3][2].add(new Food("Teriaky Tofu Bowl", "Vegetarian/Vegan (Entrée)"));
        menu[2][3][2].add(new Food("Pot Stickers", "Grill"));
        menu[2][3][2].add(new Food("Meat Lovers", "Pizza Station (Entrée)"));
        menu[2][3][2].add(new Food("Pumpkin Pie", "Sweets"));

        //Friday
        //Breakfast
        menu[2][4][0].add(new Food("Cinnamon Rice", "Breakfast Bar"));
        menu[2][4][0].add(new Food("Breakfast Burrito", "Breakfast Bar"));
        menu[2][4][0].add(new Food("Bacon", "Breakfast Bar"));
        menu[2][4][0].add(new Food("Potatoes O’ Brien", "Breakfast Bar"));

        //Lunch
        menu[2][4][1].add(new Food("Minestrone", "Soups 1"));
        menu[2][4][1].add(new Food("Clam Chowder", "Soups 2"));
        menu[2][4][1].add(new Food("Bacon Ranch Potato Salad", "Action Station"));
        menu[2][4][1].add(new Food("Udun Noodle", "Main Dish (Entrée)"));
        menu[2][4][1].add(new Food("Szechuan Tofu and Eggplant", "Vegetarian/Vegan (Entrée)"));
        menu[2][4][1].add(new Food("Fish Sandwich", "Grill"));
        menu[2][4][1].add(new Food("Veggie", "Pizza Station (Entrée)"));
        menu[2][4][1].add(new Food("Cheesecake", "Sweets"));

        //Dinner
        menu[2][4][2].add(new Food("Minestrone", "Soups 1"));
        menu[2][4][2].add(new Food("Clam Chowder", "Soups 2"));
        menu[2][4][2].add(new Food("Jucing Bar", "Action Station"));
        menu[2][4][2].add(new Food("Breaded Shrimp Platter", "Main Dish (Entrée)"));
        menu[2][4][2].add(new Food("Curry Garbanzo Vegetable Stew", "Vegetarian/Vegan (Entrée)"));
        menu[2][4][2].add(new Food("Creamy Cajun Pasta", "Grill"));
        menu[2][4][2].add(new Food("Veggie", "Pizza Station (Entrée)"));
        menu[2][4][2].add(new Food("Cheesecake", "Sweets"));

        //Saturday
        //No dining hall this day

        //Sunday
        //Breakfast
        menu[2][6][0].add(new Food("Cream of Rice", "Breakfast Bar"));
        menu[2][6][0].add(new Food("French Toast ", "Breakfast Bar"));
        menu[2][6][0].add(new Food("Sausage Patty", "Breakfast Bar"));
        menu[2][6][0].add(new Food("Hash Brown Triangles", "Breakfast Bar"));

        //Lunch
        menu[2][6][1].add(new Food("", "Soups 1"));
        menu[2][6][1].add(new Food("", "Soups 2"));
        menu[2][6][1].add(new Food("Cheese and Pepperoni", "Main Dish (Entrée)"));
        menu[2][6][1].add(new Food("Yogurt Parfait Bar", "Vegetarian/Vegan (Entrée)"));

        //Dinner
        menu[2][6][2].add(new Food("Potato Leek", "Soups 1"));
        menu[2][6][2].add(new Food("Vegetable Soup", "Soups 2"));
        menu[2][6][2].add(new Food("Nacho Bar", "Action Station"));
        menu[2][6][2].add(new Food("Chipotle Beef Brisket", "Main Dish (Entrée)"));
        menu[2][6][2].add(new Food("Gardein Beef Fajitas", "Vegetarian/Vegan (Entrée)"));
        menu[2][6][2].add(new Food("Pasta Primavera", "Grill"));
        menu[2][6][2].add(new Food("Cheese and Pepperoni", "Pizza Station (Entrée)"));

        //Cycle 4
        //Monday
        //Breakfast
        menu[3][0][0].add(new Food("Cream of Rice", "Breakfast Bar"));
        menu[3][0][0].add(new Food("French Toast", "Breakfast Bar"));
        menu[3][0][0].add(new Food("Kielbasa Sausage", "Breakfast Bar"));
        menu[3][0][0].add(new Food("Cottage Fries", "Breakfast Bar"));

        //Lunnh
        menu[3][0][1].add(new Food("Butternut Squash", "Soups 1"));
        menu[3][0][1].add(new Food("Italian Weeding Soup", "Soups 2"));
        menu[3][0][1].add(new Food("Tuna Rotini Salad", "Action Station"));
        menu[3][0][1].add(new Food("Tortellini with Pesto Alfredo", "Main Dish (Entrée)"));
        menu[3][0][1].add(new Food("Vegan Cauliflower Tacos", "Vegetarian/Vegan (Entrée)"));
        menu[3][0][1].add(new Food("Crispy Buffalo Chicken Sandwich", "Grill"));
        menu[3][0][1].add(new Food("Sausage", "Pizza Station (Entrée)"));
        menu[3][0][1].add(new Food("Chocolate Chip Bar", "Sweets"));

        //Dinner
        menu[3][0][2].add(new Food("Butternut Squash", "Soups 1"));
        menu[3][0][2].add(new Food("Italian Weeding Soup", "Soups 2"));
        menu[3][0][2].add(new Food("BBQ Chicken Salad", "Action Station"));
        menu[3][0][2].add(new Food("Pasta Bar", "Main Dish (Entrée)"));
        menu[3][0][2].add(new Food("Spinach and Mushroom Brioche", "Vegetarian/Vegan (Entrée)"));
        menu[3][0][2].add(new Food("Beef and Cheese Quesadillas", "Grill"));
        menu[3][0][2].add(new Food("Sausage", "Pizza Station (Entrée)"));
        menu[3][0][2].add(new Food("Chocolate Chip Bar", "Sweets"));

        //Tuesday
        //Breakfast
        menu[3][1][0].add(new Food("Grits", "Breakfast Bar"));
        menu[3][1][0].add(new Food("Chocolate Chip Pancakes", "Breakfast Bar"));
        menu[3][1][0].add(new Food("Bacon", "Breakfast Bar"));
        menu[3][1][0].add(new Food("Hash Brown", "Breakfast Bar"));

        //Lunnh
        menu[3][1][1].add(new Food("Tomato Basil", "Soups 1"));
        menu[3][1][1].add(new Food("Vegetable Noodle ", "Soups 2"));
        menu[3][1][1].add(new Food("Avacado Chicken Salad on Pita", "Action Station"));
        menu[3][1][1].add(new Food("Chicken Cacciatore", "Main Dish (Entrée)"));
        menu[3][1][1].add(new Food("Vegetable Lasagne", "Vegetarian/Vegan (Entrée)"));
        menu[3][1][1].add(new Food("Pork Ramen Noodle", "Grill"));
        menu[3][1][1].add(new Food("Calzone", "Pizza Station (Entrée)"));
        menu[3][1][1].add(new Food("Rice Krispie", "Sweets"));

        //Dinner
        menu[3][1][2].add(new Food("Tomato Basil", "Soups 1"));
        menu[3][1][2].add(new Food("Vegetable Noodle ", "Soups 2"));
        menu[3][1][2].add(new Food("BLT Pasta Salad", "Action Station"));
        menu[3][1][2].add(new Food("Pot Roast", "Main Dish (Entrée)"));
        menu[3][1][2].add(new Food("Sweet Potato Patty", "Vegetarian/Vegan (Entrée)"));
        menu[3][1][2].add(new Food("Grilled Cheese", "Grill"));
        menu[3][1][2].add(new Food("Calzone", "Pizza Station (Entrée)"));
        menu[3][1][2].add(new Food("Rice Krispie", "Sweets"));

        //Wednesday
        //Breakfast
        menu[3][2][0].add(new Food("Sweet Rice w/ Milk", "Breakfast Bar"));
        menu[3][2][0].add(new Food("Breakfast Quesadilla", "Breakfast Bar"));
        menu[3][2][0].add(new Food("Sausage Links ", "Breakfast Bar"));
        menu[3][2][0].add(new Food("Country Potatoes", "Breakfast Bar"));

        //Lunch
        menu[3][2][1].add(new Food("Cream of Broccoli", "Soups 1"));
        menu[3][2][1].add(new Food("Quinoa Chicken", "Soups 2"));
        menu[3][2][1].add(new Food("DIY California Sushi ROll", "Action Station"));
        menu[3][2][1].add(new Food("Capellini Pomodoro", "Main Dish (Entrée)"));
        menu[3][2][1].add(new Food("Vegan Chili Bowl", "Vegetarian/Vegan (Entrée)"));
        menu[3][2][1].add(new Food("Beef Shawarma", "Grill"));
        menu[3][2][1].add(new Food("BBQ Chicken", "Pizza Station (Entrée)"));
        menu[3][2][1].add(new Food("Coconut Cream Pie", "Sweets"));

        //Dinner
        menu[3][2][2].add(new Food("Cream of Broccoli", "Soups 1"));
        menu[3][2][2].add(new Food("Quinoa Chicken", "Soups 2"));
        menu[3][2][2].add(new Food("Lemon Basil Pasta Salad", "Action Station"));
        menu[3][2][2].add(new Food("Wonton Soup", "Main Dish (Entrée)"));
        menu[3][2][2].add(new Food("Stuffed Squash", "Vegetarian/Vegan (Entrée)"));
        menu[3][2][2].add(new Food("Wings and Things", "Grill"));
        menu[3][2][2].add(new Food("BBQ Chicken", "Pizza Station (Entrée)"));
        menu[3][2][2].add(new Food("Coconut Cream Pie", "Sweets"));

        //Thursday
        //Breakfast
        menu[3][3][0].add(new Food("Cream of Wheat", "Breakfast Bar"));
        menu[3][3][0].add(new Food("Biscuit and Country Gravy ", "Breakfast Bar"));
        menu[3][3][0].add(new Food("Sausage Patty", "Breakfast Bar"));
        menu[3][3][0].add(new Food("Tater Tots", "Breakfast Bar"));

        //Lunch
        menu[3][3][1].add(new Food("Black Bean", "Soups 1"));
        menu[3][3][1].add(new Food("Sweet Corn Chowder", "Soups 2"));
        menu[3][3][1].add(new Food("Isreali Couscous Salas with Arugula", "Action Station"));
        menu[3][3][1].add(new Food("Spinach and Ricotta Ravioli", "Main Dish (Entrée)"));
        menu[3][3][1].add(new Food("Kung Pao Gardein Beef", "Vegetarian/Vegan (Entrée)"));
        menu[3][3][1].add(new Food("Cuban Beef Stew", "Grill"));
        menu[3][3][1].add(new Food("Hawaiin", "Pizza Station (Entrée)"));
        menu[3][3][1].add(new Food("Pound Cake", "Sweets"));

        //Dinner
        menu[3][3][2].add(new Food("Black Bean", "Soups 1"));
        menu[3][3][2].add(new Food("Sweet Corn Chowder", "Soups 2"));
        menu[3][3][2].add(new Food("Taco Thursday", "Action Station"));
        menu[3][3][2].add(new Food("Taco Bar, Chips and Salsa", "Main Dish (Entrée)"));
        menu[3][3][2].add(new Food("Gardein Chicken Fajitas", "Vegetarian/Vegan (Entrée)"));
        menu[3][3][2].add(new Food("Condiments", "Grill"));
        menu[3][3][2].add(new Food("Hawaiin", "Pizza Station (Entrée)"));
        menu[3][3][2].add(new Food("Pound Cake", "Sweets"));

        //Friday
        //Breakfast
        menu[3][4][0].add(new Food("Cinnamon Rice", "Breakfast Bar"));
        menu[3][4][0].add(new Food("Chilaquiles", "Breakfast Bar"));
        menu[3][4][0].add(new Food("Bacon", "Breakfast Bar"));
        menu[3][4][0].add(new Food("Potatoes O’Brien", "Breakfast Bar"));

        //Lunch
        menu[3][4][1].add(new Food("Split Pea", "Soups 1"));
        menu[3][4][1].add(new Food("Clam Chowder", "Soups 2"));
        menu[3][4][1].add(new Food("Hummus Bar", "Action Station"));
        menu[3][4][1].add(new Food("Fish Vera Cruz", "Main Dish (Entrée)"));
        menu[3][4][1].add(new Food("Vegetable Kale Stew", "Vegetarian/Vegan (Entrée)"));
        menu[3][4][1].add(new Food("Meatball Sub", "Grill"));
        menu[3][4][1].add(new Food("Veggie", "Pizza Station (Entrée)"));
        menu[3][4][1].add(new Food("Mocha CupCake", "Sweets"));

        //Dinner
        menu[3][4][2].add(new Food("Split Pea", "Soups 1"));
        menu[3][4][2].add(new Food("Clam Chowder", "Soups 2"));
        menu[3][4][2].add(new Food("Roasted Beef and Caramalized Onions with Cheddar", "Action Station"));
        menu[3][4][2].add(new Food("Cheese Manicotti", "Main Dish (Entrée)"));
        menu[3][4][2].add(new Food("Gardein Orange Chicken", "Vegetarian/Vegan (Entrée)"));
        menu[3][4][2].add(new Food("Mango Salsa Tilapia", "Grill"));
        menu[3][4][2].add(new Food("Veggie", "Pizza Station (Entrée)"));
        menu[3][4][2].add(new Food("Mocha Cup Cake", "Sweets"));

        //Saturday
        //No dining hall this day

        //Sunday
        //Breakfast
        menu[3][6][0].add(new Food("Cream of Rice", "Breakfast Bar"));
        menu[3][6][0].add(new Food("Pancake", "Breakfast Bar"));
        menu[3][6][0].add(new Food("Sausage Link", "Breakfast Bar"));
        menu[3][6][0].add(new Food("Hash Brown Triangle", "Breakfast Bar"));

        //Lunch
        menu[3][6][1].add(new Food("", "Soups 1"));
        menu[3][6][1].add(new Food("", "Soups 2"));
        menu[3][6][1].add(new Food("Cheese and Pepperoni", "Main Dish (Entrée)"));
        menu[3][6][1].add(new Food("Smoothie Bar", "Vegetarian/Vegan (Entrée)"));

        //Dinner
        menu[3][6][2].add(new Food("Vegetable Tomato", "Soups 1"));
        menu[3][6][2].add(new Food("Beef and Rice", "Soups 2"));
        menu[3][6][2].add(new Food("Hummus Bar", "Action Station"));
        menu[3][6][2].add(new Food("Lemon Chicken", "Main Dish (Entrée)"));
        menu[3][6][2].add(new Food("Grain Bowl", "Vegetarian/Vegan (Entrée)"));
        menu[3][6][2].add(new Food("Cheese Enchilada", "Grill"));
        menu[3][6][2].add(new Food("Cheese and Pepperoni", "Pizza Station (Entrée)"));

        //Cycle 5
        //Monday
        //Breakfast
        menu[4][0][0].add(new Food("Cream of Rice", "Breakfast Bar"));
        menu[4][0][0].add(new Food("French Toast", "Breakfast Bar"));
        menu[4][0][0].add(new Food("Kielbasa Sausage", "Breakfast Bar"));
        menu[4][0][0].add(new Food("Cottage Fries", "Breakfast Bar"));

        //Lunch
        menu[4][0][1].add(new Food("French Onion", "Soups 1"));
        menu[4][0][1].add(new Food("Potato Chowder", "Soups 2"));
        menu[4][0][1].add(new Food("DIY Spicy California Sushi Roll", "Action Station"));
        menu[4][0][1].add(new Food("Breaded Chicken Drumsticks", "Main Dish (Entrée)"));
        menu[4][0][1].add(new Food("Gardein Beef Fajitas", "Vegetarian/Vegan (Entrée)"));
        menu[4][0][1].add(new Food("Pasta with Pesto", "Grill"));
        menu[4][0][1].add(new Food("Hawaiian", "Pizza Station (Entrée)"));
        menu[4][0][1].add(new Food("Chocolate Cream Pie", "Sweets"));

        //Dinner
        menu[4][0][2].add(new Food("French Onion", "Soups 1"));
        menu[4][0][2].add(new Food("Potato Chowder", "Soups 2"));
        menu[4][0][2].add(new Food("Arugula Salad", "Action Station"));
        menu[4][0][2].add(new Food("Beef Brisket", "Main Dish (Entrée)"));
        menu[4][0][2].add(new Food(" Tomato, Eggplant and Potato Stew", "Vegetarian/Vegan (Entrée)"));
        menu[4][0][2].add(new Food("Tortellini with Pesto Alfredo", "Grill"));
        menu[4][0][2].add(new Food("Hawaiian", "Pizza Station (Entrée)"));
        menu[4][0][2].add(new Food("Chocolate Cream Pie", "Sweets"));

        //Tuesday
        //Breakfast
        menu[4][1][0].add(new Food("Grits", "Breakfast Bar"));
        menu[4][1][0].add(new Food("Blintz", "Breakfast Bar"));
        menu[4][1][0].add(new Food("Bacon", "Breakfast Bar"));
        menu[4][1][0].add(new Food("Hash Brown ", "Breakfast Bar"));

        //Lunch
        menu[4][1][1].add(new Food("Tomato Basil", "Soups 1"));
        menu[4][1][1].add(new Food("Miso Soup", "Soups 2"));
        menu[4][1][1].add(new Food("Kale Salad", "Action Station"));
        menu[4][1][1].add(new Food("Kalua Pork Bowl", "Main Dish (Entrée)"));
        menu[4][1][1].add(new Food("Polenta with Tomato Pesto", "Vegetarian/Vegan (Entrée)"));
        menu[4][1][1].add(new Food("Grilled Reuben Sandwich", "Grill"));
        menu[4][1][1].add(new Food("Spinach and Feta", "Pizza Station (Entrée)"));
        menu[4][1][1].add(new Food("Banana Chocolate Bread", "Sweets"));

        //Dinner
        menu[4][1][2].add(new Food("Tomato Basil", "Soups 1"));
        menu[4][1][2].add(new Food("Miso Soup ", "Soups 2"));
        menu[4][1][2].add(new Food("BBQ Chicken Salad", "Action Station"));
        menu[4][1][2].add(new Food("Steak Milanesa", "Main Dish (Entrée)"));
        menu[4][1][2].add(new Food(" Grain Bowl", "Vegetarian/Vegan (Entrée)"));
        menu[4][1][2].add(new Food("Grilled Cheese ", "Grill"));
        menu[4][1][2].add(new Food("Spinach and Feta", "Pizza Station (Entrée)"));
        menu[4][1][2].add(new Food("Banana Chocolate Bread", "Sweets"));

        //Wednesday
        //Breakfast
        menu[4][2][0].add(new Food("Sweet Rice w/ Milk", "Breakfast Bar"));
        menu[4][2][0].add(new Food("Chorizo and Egg Burrito", "Breakfast Bar"));
        menu[4][2][0].add(new Food("Sausage Links", "Breakfast Bar"));
        menu[4][2][0].add(new Food("Country Potatoes", "Breakfast Bar"));

        //Lunch
        menu[4][2][1].add(new Food("Vegetarian Chili", "Soups 1"));
        menu[4][2][1].add(new Food("Chicken Noodle", "Soups 2"));
        menu[4][2][1].add(new Food("Spinach Salad", "Action Station"));
        menu[4][2][1].add(new Food("Hamburger and Turkey Burger", "Main Dish (Entrée)"));
        menu[4][2][1].add(new Food("Tofu Yellow Curry", "Vegetarian/Vegan (Entrée)"));
        menu[4][2][1].add(new Food("Chili Fries Bar", "Grill"));
        menu[4][2][1].add(new Food("Taco Pizza", "Pizza Station (Entrée)"));
        menu[4][2][1].add(new Food("Mini Cream Puffs", "Sweets"));

        //Dinner
        menu[4][2][2].add(new Food("Vegetarian Chili", "Soups 1"));
        menu[4][2][2].add(new Food("Chicken Noodle", "Soups 2"));
        menu[4][2][2].add(new Food("Apple Walnut Salad", "Action Station"));
        menu[4][2][2].add(new Food("Kung Pao Chicken", "Main Dish (Entrée)"));
        menu[4][2][2].add(new Food("Vegetable Tofu Curry", "Vegetarian/Vegan (Entrée)"));
        menu[4][2][2].add(new Food("Hamburgers", "Grill"));
        menu[4][2][2].add(new Food("Taco Pizza", "Pizza Station (Entrée)"));
        menu[4][2][2].add(new Food("Mini Cream Puffs", "Sweets"));

        //Thursday
        //Breakfast
        menu[4][3][0].add(new Food("Cream of Wheat", "Breakfast Bar"));
        menu[4][3][0].add(new Food("Chocolate Chip Pancakes", "Breakfast Bar"));
        menu[4][3][0].add(new Food("Sausage Patty", "Breakfast Bar"));
        menu[4][3][0].add(new Food("Tater Tots", "Breakfast Bar"));

        //Lunch
        menu[4][3][1].add(new Food("Vegetable Noodle", "Soups 1"));
        menu[4][3][1].add(new Food("Sausage and Kale Soup", "Soups 2"));
        menu[4][3][1].add(new Food("Italian Sub", "Action Station"));
        menu[4][3][1].add(new Food("KImchi Rice with Beef", "Main Dish (Entrée)"));
        menu[4][3][1].add(new Food("Gardein Orange Chicken", "Vegetarian/Vegan (Entrée)"));
        menu[4][3][1].add(new Food("Pasta with Butternut Squash", "Grill"));
        menu[4][3][1].add(new Food("Calzone", "Pizza Station (Entrée)"));
        menu[4][3][1].add(new Food("Confetti Cup Cake", "Sweets"));

        //Dinner
        menu[4][3][2].add(new Food("Vegetable Noodle", "Soups 1"));
        menu[4][3][2].add(new Food("Sausage and Kale Soup", "Soups 2"));
        menu[4][3][2].add(new Food("Hummas Bar", "Action Station"));
        menu[4][3][2].add(new Food("Spagetti Bolongnese", "Main Dish (Entrée)"));
        menu[4][3][2].add(new Food("Islander Tofu", "Vegetarian/Vegan (Entrée)"));
        menu[4][3][2].add(new Food("Beef or Cheese Quesadilla", "Grill"));
        menu[4][3][2].add(new Food("Calzone", "Pizza Station (Entrée)"));
        menu[4][3][2].add(new Food("Confetti Cup Cake", "Sweets"));

        //Friday
        //Breakfast
        menu[4][4][0].add(new Food("Cinnamon Rice", "Breakfast Bar"));
        menu[4][4][0].add(new Food("Egg,Ham and Cheese on Croissant", "Breakfast Bar"));
        menu[4][4][0].add(new Food("Bacon", "Breakfast Bar"));
        menu[4][4][0].add(new Food("Potatoes O’Brien", "Breakfast Bar"));

        //Lunch
        menu[4][4][1].add(new Food("Clam Chowder", "Soups 1"));
        menu[4][4][1].add(new Food("Minestrone", "Soups 2"));
        menu[4][4][1].add(new Food("Pasta with Presto Salad", "Action Station"));
        menu[4][4][1].add(new Food("Beef or Cheese Enciladas", "Main Dish (Entrée)"));
        menu[4][4][1].add(new Food("Black Bean Patty with Pico de Gallo", "Vegetarian/Vegan (Entrée)"));
        menu[4][4][1].add(new Food("Baked Salmon", "Grill"));
        menu[4][4][1].add(new Food("Veggie", "Pizza Station (Entrée)"));
        menu[4][4][1].add(new Food("Whoppie Pie", "Sweets"));

        //Dinner
        menu[4][4][2].add(new Food("Clam Chowder", "Soups 1"));
        menu[4][4][2].add(new Food("Minestrone", "Soups 2"));
        menu[4][4][2].add(new Food("Smootie Bar", "Action Station"));
        menu[4][4][2].add(new Food("Pot Sticker Rice Bowl", "Main Dish (Entrée)"));
        menu[4][4][2].add(new Food("Teriyaki Veggie Bowl", "Vegetarian/Vegan (Entrée)"));
        menu[4][4][2].add(new Food("Fish Sticks", "Grill"));
        menu[4][4][2].add(new Food("Veggie", "Pizza Station (Entrée)"));
        menu[4][4][2].add(new Food("Whoppie Pie", "Sweets"));

        //Saturday
        //No dining hall this day

        //Sunday
        //Breakfast
        menu[4][6][0].add(new Food("Cream of Rice", "Breakfast Bar"));
        menu[4][6][0].add(new Food("Chocolate Chip Pancakes", "Breakfast Bar"));
        menu[4][6][0].add(new Food("Sausage Links", "Breakfast Bar"));
        menu[4][6][0].add(new Food("Hash Brown Triangles", "Breakfast Bar"));

        //Lunch
        menu[4][6][1].add(new Food("", "Soups 1"));
        menu[4][6][1].add(new Food("", "Soups 2"));
        menu[4][6][1].add(new Food("Cheese and Pepperoni", "Main Dish (Entrée)"));
        menu[4][6][1].add(new Food("Smoothie Bar", "Vegetarian/Vegan (Entrée)"));

        //Dinner
        menu[4][6][2].add(new Food("Beef and Rice", "Soups 1"));
        menu[4][6][2].add(new Food("Chicken Noodle", "Soups 2"));
        menu[4][6][2].add(new Food("Beef Tamale", "Action Station"));
        menu[4][6][2].add(new Food("Buffalo Chicken Tenders", "Main Dish (Entrée)"));
        menu[4][6][2].add(new Food("Buddha Bowl", "Vegetarian/Vegan (Entrée)"));
        menu[4][6][2].add(new Food("Tortillini with Pesto Alredo", "Grill"));
        menu[4][6][2].add(new Food("Cheese and Pepperoni", "Pizza Station (Entrée)"));
    }


}
