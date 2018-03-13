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
        menu[0][0][2].add(new Food("Chicken Enchilada", "Soups 1"));
        menu[0][0][2].add(new Food("Tomato Basil", "Soups 2"));
        menu[0][0][2].add(new Food("Turkey Club Wrap", "Action Station"));
        menu[0][0][2].add(new Food("Fried Chicken w/ Potatoes", "Main Dish (Entrée)"));
        menu[0][0][2].add(new Food("Mac & Cheese", "Vegetarian/Vegan (Entrée)"));
        menu[0][0][2].add(new Food("Corned Beef Reuben Sandwich", "Grill"));
        menu[0][0][2].add(new Food("Broccoli Beef w/ Rice", "Stir Fry Station"));

        //Tuesday
        //Breakfast
        menu[0][1][0].add(new Food("Grits", "Breakfast Bar"));
        menu[0][1][0].add(new Food("Breakfast Croissant", "Breakfast Bar"));
        menu[0][1][0].add(new Food("Bacon", "Breakfast Bar"));
        menu[0][1][0].add(new Food("Cottage Fries", "Breakfast Bar"));

        //Lunch
        menu[0][1][1].add(new Food("Caldo de Rez", "Soups 1"));
        menu[0][1][1].add(new Food("Corn Chowder", "Soups 2"));
        menu[0][1][1].add(new Food("Buffalo Chicken Wrap", "Action Station"));
        menu[0][1][1].add(new Food("BBQ Pork Loin w/ Potatoes", "Main Dish (Entrée)"));
        menu[0][1][1].add(new Food("Roasted Cauliflower Steak", "Vegetarian/Vegan (Entrée)"));
        menu[0][1][1].add(new Food("Philly Cheese Steak Quesadilla", "Grill"));
        menu[0][1][1].add(new Food("Turkey Burrito Bowl", "Stir Fry Station"));

        //Dinner
        menu[0][1][2].add(new Food("Caldo de Rez", "Soups 1"));
        menu[0][1][2].add(new Food("Corn Chowder", "Soups 2"));
        menu[0][1][2].add(new Food("Taco Salad", "Action Station"));
        menu[0][1][2].add(new Food("Seasonal Fish w/ Couscous", "Main Dish (Entrée)"));
        menu[0][1][2].add(new Food("Ratatouille w/ Roasted Tomato", "Vegetarian/Vegan (Entrée)"));
        menu[0][1][2].add(new Food("Chicken Wings", "Grill"));
        menu[0][1][2].add(new Food("Sweet & Sour Pork w/ Rice", "Stir Fry Station"));

        //Wednesday
        //Breakfast
        menu[0][2][0].add(new Food("Cinnamon Rice", "Breakfast Bar"));
        menu[0][2][0].add(new Food("Blueberry Pancakes", "Breakfast Bar"));
        menu[0][2][0].add(new Food("Sausage Links", "Breakfast Bar"));
        menu[0][2][0].add(new Food("Hash Brown Potatoes", "Breakfast Bar"));

        //Lunch
        menu[0][2][1].add(new Food("Chicken Noodle", "Soups 1"));
        menu[0][2][1].add(new Food("Butternut Squash", "Soups 2"));
        menu[0][2][1].add(new Food("Greek Salad", "Action Station"));
        menu[0][2][1].add(new Food("Chipotle Chicken w/ Rice", "Main Dish (Entrée)"));
        menu[0][2][1].add(new Food("Potato Bar w/ Vegetarian Chili", "Vegetarian/Vegan (Entrée)"));
        menu[0][2][1].add(new Food("PClassic Cheese Burger", "Grill"));
        menu[0][2][1].add(new Food("Mongolian Beef w/ Rice", "Stir Fry Station"));

        //Dinner
        menu[0][2][2].add(new Food("Chicken Noodle", "Soups 1"));
        menu[0][2][2].add(new Food("Butternut Squash", "Soups 2"));
        menu[0][2][2].add(new Food("Hummus & Roasted Veggie Wrap", "Action Station"));
        menu[0][2][2].add(new Food("Meatloaf w/ Mashed Potatoes", "Main Dish (Entrée)"));
        menu[0][2][2].add(new Food("Baked Tortellini w/ Pesto Sauce", "Vegetarian/Vegan (Entrée)"));
        menu[0][2][2].add(new Food("Tuna Sourdough Melt", "Grill"));
        menu[0][2][2].add(new Food("Chicken Fajitas w/ Rice", "Stir Fry Station"));

        //Thursday
        //Breakfast
        menu[0][3][0].add(new Food("Cream of Wheat", "Breakfast Bar"));
        menu[0][3][0].add(new Food("Biscuits & Gravy", "Breakfast Bar"));
        menu[0][3][0].add(new Food("Turkey Sausage", "Breakfast Bar"));
        menu[0][3][0].add(new Food("s Home Fries Potatoes", "Breakfast Bar"));

        //Lunch
        menu[0][3][1].add(new Food("Posole", "Soups 1"));
        menu[0][3][1].add(new Food("Potato Cheese", "Soups 2"));
        menu[0][3][1].add(new Food("California Sushi Roll", "Action Station"));
        menu[0][3][1].add(new Food("Meat Lasagna w/ Breadstick", "Main Dish (Entrée)"));
        menu[0][3][1].add(new Food("Vegetable Lasagna w/ Breadstick", "Vegetarian/Vegan (Entrée)"));
        menu[0][3][1].add(new Food("Crispy Chicken Tenders", "Grill"));
        menu[0][3][1].add(new Food("Crispy Pork Egg Rolls w/ Rice", "Stir Fry Station"));

        //Dinner
        menu[0][3][2].add(new Food("Posole", "Soups 1"));
        menu[0][3][2].add(new Food("Potato Cheese", "Soups 2"));
        menu[0][3][2].add(new Food("Cobb Salad", "Action Station"));
        menu[0][3][2].add(new Food("Pollo Wet Burrito w/ Rice & Beans", "Main Dish (Entrée)"));
        menu[0][3][2].add(new Food("Roasted Vegetable & Quinoa", "Vegetarian/Vegan (Entrée)"));
        menu[0][3][2].add(new Food("BBQ Pulled Pork Sandwich", "Grill"));
        menu[0][3][2].add(new Food("Beijing Beef w/ Jasmine Rice", "Stir Fry Station"));

        //Friday
        //Breakfast
        //Breakfast
        menu[0][4][0].add(new Food("Grits", "Breakfast Bar"));
        menu[0][4][0].add(new Food("Chocolate Chip Pancakes", "Breakfast Bar"));
        menu[0][4][0].add(new Food("Bacon", "Breakfast Bar"));
        menu[0][4][0].add(new Food("Tater Tots", "Breakfast Bar"));

        //Lunch
        menu[0][4][1].add(new Food("Clam Chowder", "Soups 1"));
        menu[0][4][1].add(new Food("Minestroni", "Soups 2"));
        menu[0][4][1].add(new Food("Cajun Chicken Caesar Wrap ", "Action Station"));
        menu[0][4][1].add(new Food("Teriyaki Salmon w/ Rice", "Main Dish (Entrée)"));
        menu[0][4][1].add(new Food("Udon Noodle Bar", "Vegetarian/Vegan (Entrée)"));
        menu[0][4][1].add(new Food("Hot Dog Bar", "Grill"));
        menu[0][4][1].add(new Food("Beef Fajitas w/ Spanish Rice B", "Stir Fry Station"));

        //Dinner
        menu[0][4][2].add(new Food("Clam Chowder", "Soups 1"));
        menu[0][4][2].add(new Food("Minestroni ", "Soups 2"));
        menu[0][4][2].add(new Food("Pasta Salad ", "Action Station"));
        menu[0][4][2].add(new Food("Beef Stroganoff w/ Noodles", "Main Dish (Entrée)"));
        menu[0][4][2].add(new Food("Vegetarian Chili w/ Corn Bread", "Vegetarian/Vegan (Entrée)"));
        menu[0][4][2].add(new Food("Chicken Bacon Ranch Panini", "Grill"));
        menu[0][4][2].add(new Food("Cajun Shrimp Linguine", "Stir Fry Station"));

        //Saturday
        //Breakfast
        menu[0][5][0].add(new Food("Arroz Con Leche", "Breakfast Bar"));
        menu[0][5][0].add(new Food("French Toast", "Breakfast Bar"));
        menu[0][5][0].add(new Food("Kielbasa Sausage", "Breakfast Bar"));
        menu[0][5][0].add(new Food("Potatoes O’ Brien", "Breakfast Bar"));

        //Lunch
        menu[0][5][1].add(new Food("Italian Wedding", "Soups 1"));
        menu[0][5][1].add(new Food("Cream of Broccoli", "Soups 2"));
        menu[0][5][1].add(new Food("Smoothie Bar", "Action Station"));
        menu[0][5][1].add(new Food("Grilled Tri Trip w/ Potatoes", "Main Dish (Entrée)"));
        menu[0][5][1].add(new Food("Pasta Bar w/ Marinara & Alfredo Sauce", "Vegetarian/Vegan (Entrée)"));
        menu[0][5][1].add(new Food("Omelet Bar", "Grill"));
        menu[0][5][1].add(new Food("Breakfast Quesadillas", "Stir Fry Station"));

        //Dinner
        menu[0][5][2].add(new Food("Italian Wedding", "Soups 1"));
        menu[0][5][2].add(new Food("Cream of Broccoli", "Soups 2"));
        menu[0][5][2].add(new Food("BBQ Chicken Salad Wrap", "Action Station"));
        menu[0][5][2].add(new Food("s Beef Enchilada w/ Rice & Beans", "Main Dish (Entrée)"));
        menu[0][5][2].add(new Food("Cheese Enchilada w/ Rice & Beans", "Vegetarian/Vegan (Entrée)"));
        menu[0][5][2].add(new Food("Crispy Fish Sandwich w/ Cole Slaw", "Grill"));
        menu[0][5][2].add(new Food("Chicken & Vegetable Chow Mein", "Stir Fry Station"));
        //End of Cycle 1 ---------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------

        //Cycle 2
        //Monday
        //Breakfast
        menu[1][0][0].add(new Food("Cream of Wheat", "Breakfast Bar"));
        menu[1][0][0].add(new Food("Buttermilk Pancakes", "Breakfast Bar"));
        menu[1][0][0].add(new Food("Sausage Patty", "Breakfast Bar"));
        menu[1][0][0].add(new Food("Potato Patty", "Breakfast Bar"));

        //Lunch
        menu[1][0][1].add(new Food("Chicken Tortilla", "Soups 1"));
        menu[1][0][1].add(new Food("Tomato Basil", "Soups 2"));
        menu[1][0][1].add(new Food("Chef Salad", "Action Station"));
        menu[1][0][1].add(new Food("Chicken Marsala w/ Potatoes", "Main Dish (Entrée)"));
        menu[1][0][1].add(new Food("Stuffed Shells w/ Tomato Cream Sauce", "Vegetarian/Vegan (Entrée)"));
        menu[1][0][1].add(new Food("Shredded Beef Taquitos w/ Guacamole", "Grill"));
        menu[1][0][1].add(new Food("Shrimp & Vegetable Fried Rice", "Stir Fry Station"));

        //Dinner
        menu[1][0][2].add(new Food("Chicken Tortilla", "Soups 1"));
        menu[1][0][2].add(new Food("Tomato Basil", "Soups 2"));
        menu[1][0][2].add(new Food("Chipotle Chicken Caesar Wrap", "Action Station"));
        menu[1][0][2].add(new Food("Crispy Fish Tacos w/ Cilantro Rice", "Main Dish (Entrée)"));
        menu[1][0][2].add(new Food("Eggplant Parmesan w/ Marinara", "Vegetarian/Vegan (Entrée)"));
        menu[1][0][2].add(new Food("Philly Cheese Steak Sandwich", "Grill"));
        menu[1][0][2].add(new Food("Teriyaki Chicken w/ Rice", "Stir Fry Station"));

        //Tuesday
        //Breakfast
        menu[1][1][0].add(new Food("Grits", "Breakfast Bar"));
        menu[1][1][0].add(new Food("Breakfast Croissant", "Breakfast Bar"));
        menu[1][1][0].add(new Food("Bacon", "Breakfast Bar"));
        menu[1][1][0].add(new Food("Cottage Fries", "Breakfast Bar"));

        //Lunch
        menu[1][1][1].add(new Food("Caldo de Rez", "Soups 1"));
        menu[1][1][1].add(new Food("Corn Chowder", "Soups 2"));
        menu[1][1][1].add(new Food("Buffalo Chicken Wrap", "Action Station"));
        menu[1][1][1].add(new Food("BBQ Pork Loin w/ Potatoes", "Main Dish (Entrée)"));
        menu[1][1][1].add(new Food("Roasted Cauliflower Steak", "Vegetarian/Vegan (Entrée)"));
        menu[1][1][1].add(new Food("Philly Cheese Steak Quesadilla", "Grill"));
        menu[1][1][1].add(new Food("Turkey Burrito Bowl", "Stir Fry Station"));

        //Dinner
        menu[1][1][2].add(new Food("Caldo de Rez", "Soups 1"));
        menu[1][1][2].add(new Food("Corn Chowder", "Soups 2"));
        menu[1][1][2].add(new Food("Taco Salad", "Action Station"));
        menu[1][1][2].add(new Food("Seasonal Fish w/ Couscous", "Main Dish (Entrée)"));
        menu[1][1][2].add(new Food("Ratatouille w/ Roasted Tomato", "Vegetarian/Vegan (Entrée)"));
        menu[1][1][2].add(new Food("Chicken Wings", "Grill"));
        menu[1][1][2].add(new Food("Sweet & Sour Pork w/ Rice", "Stir Fry Station"));

        //Wednesday
        //Breakfast
        menu[1][2][0].add(new Food("Grits", "Breakfast Bar"));
        menu[1][2][0].add(new Food("Breakfast Croissant", "Breakfast Bar"));
        menu[1][2][0].add(new Food("Bacon", "Breakfast Bar"));
        menu[1][2][0].add(new Food("Cottage Fries", "Breakfast Bar"));

        //Lunch
        menu[1][2][1].add(new Food("Caldo de Rez", "Soups 1"));
        menu[1][2][1].add(new Food("Corn Chowder", "Soups 2"));
        menu[1][2][1].add(new Food("Buffalo Chicken Wrap", "Action Station"));
        menu[1][2][1].add(new Food("BBQ Pork Loin w/ Potatoes", "Main Dish (Entrée)"));
        menu[1][2][1].add(new Food("Roasted Cauliflower Steak", "Vegetarian/Vegan (Entrée)"));
        menu[1][2][1].add(new Food("Philly Cheese Steak Quesadilla", "Grill"));
        menu[1][2][1].add(new Food("Turkey Burrito Bowl", "Stir Fry Station"));

        //Dinner
        menu[1][2][2].add(new Food("Caldo de Rez", "Soups 1"));
        menu[1][2][2].add(new Food("Corn Chowder", "Soups 2"));
        menu[1][2][2].add(new Food("Taco Salad", "Action Station"));
        menu[1][2][2].add(new Food("Seasonal Fish w/ Couscous", "Main Dish (Entrée)"));
        menu[1][2][2].add(new Food("Ratatouille w/ Roasted Tomato", "Vegetarian/Vegan (Entrée)"));
        menu[1][2][2].add(new Food("Chicken Wings", "Grill"));
        menu[1][2][2].add(new Food("Sweet & Sour Pork w/ Rice", "Stir Fry Station"));

        //Thursday
        //Breakfast
        menu[1][3][0].add(new Food("Grits", "Breakfast Bar"));
        menu[1][3][0].add(new Food("Breakfast Croissant", "Breakfast Bar"));
        menu[1][3][0].add(new Food("Bacon", "Breakfast Bar"));
        menu[1][3][0].add(new Food("Cottage Fries", "Breakfast Bar"));

        //Lunch
        menu[1][3][1].add(new Food("Caldo de Rez", "Soups 1"));
        menu[1][3][1].add(new Food("Corn Chowder", "Soups 2"));
        menu[1][3][1].add(new Food("Buffalo Chicken Wrap", "Action Station"));
        menu[1][3][1].add(new Food("BBQ Pork Loin w/ Potatoes", "Main Dish (Entrée)"));
        menu[1][3][1].add(new Food("Roasted Cauliflower Steak", "Vegetarian/Vegan (Entrée)"));
        menu[1][3][1].add(new Food("Philly Cheese Steak Quesadilla", "Grill"));
        menu[1][3][1].add(new Food("Turkey Burrito Bowl", "Stir Fry Station"));

        //Dinner
        menu[1][3][2].add(new Food("Caldo de Rez", "Soups 1"));
        menu[1][3][2].add(new Food("Corn Chowder", "Soups 2"));
        menu[1][3][2].add(new Food("Taco Salad", "Action Station"));
        menu[1][3][2].add(new Food("Seasonal Fish w/ Couscous", "Main Dish (Entrée)"));
        menu[1][3][2].add(new Food("Ratatouille w/ Roasted Tomato", "Vegetarian/Vegan (Entrée)"));
        menu[1][3][2].add(new Food("Chicken Wings", "Grill"));
        menu[1][3][2].add(new Food("Sweet & Sour Pork w/ Rice", "Stir Fry Station"));

        //Friday
        //Breakfast
        menu[1][4][0].add(new Food("Grits", "Breakfast Bar"));
        menu[1][4][0].add(new Food("Breakfast Croissant", "Breakfast Bar"));
        menu[1][4][0].add(new Food("Bacon", "Breakfast Bar"));
        menu[1][4][0].add(new Food("Cottage Fries", "Breakfast Bar"));

        //Lunch
        menu[1][4][1].add(new Food("Caldo de Rez", "Soups 1"));
        menu[1][4][1].add(new Food("Corn Chowder", "Soups 2"));
        menu[1][4][1].add(new Food("Buffalo Chicken Wrap", "Action Station"));
        menu[1][4][1].add(new Food("BBQ Pork Loin w/ Potatoes", "Main Dish (Entrée)"));
        menu[1][4][1].add(new Food("Roasted Cauliflower Steak", "Vegetarian/Vegan (Entrée)"));
        menu[1][4][1].add(new Food("Philly Cheese Steak Quesadilla", "Grill"));
        menu[1][4][1].add(new Food("Turkey Burrito Bowl", "Stir Fry Station"));

        //Dinner
        menu[1][4][2].add(new Food("Caldo de Rez", "Soups 1"));
        menu[1][4][2].add(new Food("Corn Chowder", "Soups 2"));
        menu[1][4][2].add(new Food("Taco Salad", "Action Station"));
        menu[1][4][2].add(new Food("Seasonal Fish w/ Couscous", "Main Dish (Entrée)"));
        menu[1][4][2].add(new Food("Ratatouille w/ Roasted Tomato", "Vegetarian/Vegan (Entrée)"));
        menu[1][4][2].add(new Food("Chicken Wings", "Grill"));
        menu[1][4][2].add(new Food("Sweet & Sour Pork w/ Rice", "Stir Fry Station"));

        //Saturday
        //Breakfast
        menu[1][5][0].add(new Food("Grits", "Breakfast Bar"));
        menu[1][5][0].add(new Food("Breakfast Croissant", "Breakfast Bar"));
        menu[1][5][0].add(new Food("Bacon", "Breakfast Bar"));
        menu[1][5][0].add(new Food("Cottage Fries", "Breakfast Bar"));

        //Lunch
        menu[1][5][1].add(new Food("Caldo de Rez", "Soups 1"));
        menu[1][5][1].add(new Food("Corn Chowder", "Soups 2"));
        menu[1][5][1].add(new Food("Buffalo Chicken Wrap", "Action Station"));
        menu[1][5][1].add(new Food("BBQ Pork Loin w/ Potatoes", "Main Dish (Entrée)"));
        menu[1][5][1].add(new Food("Roasted Cauliflower Steak", "Vegetarian/Vegan (Entrée)"));
        menu[1][5][1].add(new Food("Philly Cheese Steak Quesadilla", "Grill"));
        menu[1][5][1].add(new Food("Turkey Burrito Bowl", "Stir Fry Station"));

        //Dinner
        menu[1][5][2].add(new Food("Caldo de Rez", "Soups 1"));
        menu[1][5][2].add(new Food("Corn Chowder", "Soups 2"));
        menu[1][5][2].add(new Food("Taco Salad", "Action Station"));
        menu[1][5][2].add(new Food("Seasonal Fish w/ Couscous", "Main Dish (Entrée)"));
        menu[1][5][2].add(new Food("Ratatouille w/ Roasted Tomato", "Vegetarian/Vegan (Entrée)"));
        menu[1][5][2].add(new Food("Chicken Wings", "Grill"));
        menu[1][5][2].add(new Food("Sweet & Sour Pork w/ Rice", "Stir Fry Station"));
        //End of cycle 2 ---------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------

        //Cycle 3
        //Monday
        //Breakfast
        menu[2][0][0].add(new Food("Cream of Wheat", "Breakfast Bar"));
        menu[2][0][0].add(new Food("Buttermilk Pancakes", "Breakfast Bar"));
        menu[2][0][0].add(new Food("Sausage Patty", "Breakfast Bar"));
        menu[2][0][0].add(new Food("Potato Patty", "Breakfast Bar"));

        //Lunch
        menu[2][0][1].add(new Food("Chicken Enchilada", "Soups 1"));
        menu[2][0][1].add(new Food("Tomato Basil", "Soups 2"));
        menu[2][0][1].add(new Food("Caesar Salad", "Action Station"));
        menu[2][0][1].add(new Food("Chicken Picatta w/ Rice Pilaf", "Main Dish (Entrée)"));
        menu[2][0][1].add(new Food("Assorted Hummus Bar", "Vegetarian/Vegan (Entrée)"));
        menu[2][0][1].add(new Food("Grilled Cheese Sandwich", "Grill"));
        menu[2][0][1].add(new Food("Orange Chicken w/ Rice", "Stir Fry Station"));

        //Dinner
        menu[2][0][2].add(new Food("Chicken Enchilada", "Soups 1"));
        menu[2][0][2].add(new Food("Tomato Basil", "Soups 2"));
        menu[2][0][2].add(new Food("Turkey Club Wrap", "Action Station"));
        menu[2][0][2].add(new Food("Fried Chicken w/ Potatoes", "Main Dish (Entrée)"));
        menu[2][0][2].add(new Food("Mac & Cheese", "Vegetarian/Vegan (Entrée)"));
        menu[2][0][2].add(new Food("Corned Beef Reuben Sandwich", "Grill"));
        menu[2][0][2].add(new Food("Broccoli Beef w/ Rice", "Stir Fry Station"));

        //Tuesday
        //Breakfast
        menu[2][1][0].add(new Food("Grits", "Breakfast Bar"));
        menu[2][1][0].add(new Food("Breakfast Croissant", "Breakfast Bar"));
        menu[2][1][0].add(new Food("Bacon", "Breakfast Bar"));
        menu[2][1][0].add(new Food("Cottage Fries", "Breakfast Bar"));

        //Lunch
        menu[2][1][1].add(new Food("Caldo de Rez", "Soups 1"));
        menu[2][1][1].add(new Food("Corn Chowder", "Soups 2"));
        menu[2][1][1].add(new Food("Buffalo Chicken Wrap", "Action Station"));
        menu[2][1][1].add(new Food("BBQ Pork Loin w/ Potatoes", "Main Dish (Entrée)"));
        menu[2][1][1].add(new Food("Roasted Cauliflower Steak", "Vegetarian/Vegan (Entrée)"));
        menu[2][1][1].add(new Food("Philly Cheese Steak Quesadilla", "Grill"));
        menu[2][1][1].add(new Food("Turkey Burrito Bowl", "Stir Fry Station"));

        //Dinner
        menu[2][1][2].add(new Food("Caldo de Rez", "Soups 1"));
        menu[2][1][2].add(new Food("Corn Chowder", "Soups 2"));
        menu[2][1][2].add(new Food("Taco Salad", "Action Station"));
        menu[2][1][2].add(new Food("Seasonal Fish w/ Couscous", "Main Dish (Entrée)"));
        menu[2][1][2].add(new Food("Ratatouille w/ Roasted Tomato", "Vegetarian/Vegan (Entrée)"));
        menu[2][1][2].add(new Food("Chicken Wings", "Grill"));
        menu[2][1][2].add(new Food("Sweet & Sour Pork w/ Rice", "Stir Fry Station"));

        //Wednesday
        //Breakfast
        menu[2][2][0].add(new Food("Grits", "Breakfast Bar"));
        menu[2][2][0].add(new Food("Breakfast Croissant", "Breakfast Bar"));
        menu[2][2][0].add(new Food("Bacon", "Breakfast Bar"));
        menu[2][2][0].add(new Food("Cottage Fries", "Breakfast Bar"));

        //Lunch
        menu[2][2][1].add(new Food("Caldo de Rez", "Soups 1"));
        menu[2][2][1].add(new Food("Corn Chowder", "Soups 2"));
        menu[2][2][1].add(new Food("Buffalo Chicken Wrap", "Action Station"));
        menu[2][2][1].add(new Food("BBQ Pork Loin w/ Potatoes", "Main Dish (Entrée)"));
        menu[2][2][1].add(new Food("Roasted Cauliflower Steak", "Vegetarian/Vegan (Entrée)"));
        menu[2][2][1].add(new Food("Philly Cheese Steak Quesadilla", "Grill"));
        menu[2][2][1].add(new Food("Turkey Burrito Bowl", "Stir Fry Station"));

        //Dinner
        menu[2][2][2].add(new Food("Caldo de Rez", "Soups 1"));
        menu[2][2][2].add(new Food("Corn Chowder", "Soups 2"));
        menu[2][2][2].add(new Food("Taco Salad", "Action Station"));
        menu[2][2][2].add(new Food("Seasonal Fish w/ Couscous", "Main Dish (Entrée)"));
        menu[2][2][2].add(new Food("Ratatouille w/ Roasted Tomato", "Vegetarian/Vegan (Entrée)"));
        menu[2][2][2].add(new Food("Chicken Wings", "Grill"));
        menu[2][2][2].add(new Food("Sweet & Sour Pork w/ Rice", "Stir Fry Station"));

        //Thursday
        //Breakfast
        menu[2][3][0].add(new Food("Grits", "Breakfast Bar"));
        menu[2][3][0].add(new Food("Breakfast Croissant", "Breakfast Bar"));
        menu[2][3][0].add(new Food("Bacon", "Breakfast Bar"));
        menu[2][3][0].add(new Food("Cottage Fries", "Breakfast Bar"));

        //Lunch
        menu[2][3][1].add(new Food("Caldo de Rez", "Soups 1"));
        menu[2][3][1].add(new Food("Corn Chowder", "Soups 2"));
        menu[2][3][1].add(new Food("Buffalo Chicken Wrap", "Action Station"));
        menu[2][3][1].add(new Food("BBQ Pork Loin w/ Potatoes", "Main Dish (Entrée)"));
        menu[2][3][1].add(new Food("Roasted Cauliflower Steak", "Vegetarian/Vegan (Entrée)"));
        menu[2][3][1].add(new Food("Philly Cheese Steak Quesadilla", "Grill"));
        menu[2][3][1].add(new Food("Turkey Burrito Bowl", "Stir Fry Station"));

        //Dinner
        menu[2][3][2].add(new Food("Caldo de Rez", "Soups 1"));
        menu[2][3][2].add(new Food("Corn Chowder", "Soups 2"));
        menu[2][3][2].add(new Food("Taco Salad", "Action Station"));
        menu[2][3][2].add(new Food("Seasonal Fish w/ Couscous", "Main Dish (Entrée)"));
        menu[2][3][2].add(new Food("Ratatouille w/ Roasted Tomato", "Vegetarian/Vegan (Entrée)"));
        menu[2][3][2].add(new Food("Chicken Wings", "Grill"));
        menu[2][3][2].add(new Food("Sweet & Sour Pork w/ Rice", "Stir Fry Station"));

        //Friday
        //Breakfast
        menu[2][4][0].add(new Food("Grits", "Breakfast Bar"));
        menu[2][4][0].add(new Food("Breakfast Croissant", "Breakfast Bar"));
        menu[2][4][0].add(new Food("Bacon", "Breakfast Bar"));
        menu[2][4][0].add(new Food("Cottage Fries", "Breakfast Bar"));

        //Lunch
        menu[2][4][1].add(new Food("Caldo de Rez", "Soups 1"));
        menu[2][4][1].add(new Food("Corn Chowder", "Soups 2"));
        menu[2][4][1].add(new Food("Buffalo Chicken Wrap", "Action Station"));
        menu[2][4][1].add(new Food("BBQ Pork Loin w/ Potatoes", "Main Dish (Entrée)"));
        menu[2][4][1].add(new Food("Roasted Cauliflower Steak", "Vegetarian/Vegan (Entrée)"));
        menu[2][4][1].add(new Food("Philly Cheese Steak Quesadilla", "Grill"));
        menu[2][4][1].add(new Food("Turkey Burrito Bowl", "Stir Fry Station"));

        //Dinner
        menu[2][4][2].add(new Food("Caldo de Rez", "Soups 1"));
        menu[2][4][2].add(new Food("Corn Chowder", "Soups 2"));
        menu[2][4][2].add(new Food("Taco Salad", "Action Station"));
        menu[2][4][2].add(new Food("Seasonal Fish w/ Couscous", "Main Dish (Entrée)"));
        menu[2][4][2].add(new Food("Ratatouille w/ Roasted Tomato", "Vegetarian/Vegan (Entrée)"));
        menu[2][4][2].add(new Food("Chicken Wings", "Grill"));
        menu[2][4][2].add(new Food("Sweet & Sour Pork w/ Rice", "Stir Fry Station"));

        //Saturday
        //Breakfast
        menu[2][5][0].add(new Food("Grits", "Breakfast Bar"));
        menu[2][5][0].add(new Food("Breakfast Croissant", "Breakfast Bar"));
        menu[2][5][0].add(new Food("Bacon", "Breakfast Bar"));
        menu[2][5][0].add(new Food("Cottage Fries", "Breakfast Bar"));

        //Lunch
        menu[2][5][1].add(new Food("Caldo de Rez", "Soups 1"));
        menu[2][5][1].add(new Food("Corn Chowder", "Soups 2"));
        menu[2][5][1].add(new Food("Buffalo Chicken Wrap", "Action Station"));
        menu[2][5][1].add(new Food("BBQ Pork Loin w/ Potatoes", "Main Dish (Entrée)"));
        menu[2][5][1].add(new Food("Roasted Cauliflower Steak", "Vegetarian/Vegan (Entrée)"));
        menu[2][5][1].add(new Food("Philly Cheese Steak Quesadilla", "Grill"));
        menu[2][5][1].add(new Food("Turkey Burrito Bowl", "Stir Fry Station"));

        //Dinner
        menu[2][5][2].add(new Food("Caldo de Rez", "Soups 1"));
        menu[2][5][2].add(new Food("Corn Chowder", "Soups 2"));
        menu[2][5][2].add(new Food("Taco Salad", "Action Station"));
        menu[2][5][2].add(new Food("Seasonal Fish w/ Couscous", "Main Dish (Entrée)"));
        menu[2][5][2].add(new Food("Ratatouille w/ Roasted Tomato", "Vegetarian/Vegan (Entrée)"));
        menu[2][5][2].add(new Food("Chicken Wings", "Grill"));
        menu[2][5][2].add(new Food("Sweet & Sour Pork w/ Rice", "Stir Fry Station"));
        //End of cycle 3 ---------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------

        //Cycle 4
        //Monday
        //Breakfast
        menu[3][0][0].add(new Food("Cream of Wheat", "Breakfast Bar"));
        menu[3][0][0].add(new Food("Buttermilk Pancakes", "Breakfast Bar"));
        menu[3][0][0].add(new Food("Sausage Patty", "Breakfast Bar"));
        menu[3][0][0].add(new Food("Potato Patty", "Breakfast Bar"));

        //Lunch
        menu[3][0][1].add(new Food("Chicken Enchilada", "Soups 1"));
        menu[3][0][1].add(new Food("Tomato Basil", "Soups 2"));
        menu[3][0][1].add(new Food("Caesar Salad", "Action Station"));
        menu[3][0][1].add(new Food("Chicken Picatta w/ Rice Pilaf", "Main Dish (Entrée)"));
        menu[3][0][1].add(new Food("Assorted Hummus Bar", "Vegetarian/Vegan (Entrée)"));
        menu[3][0][1].add(new Food("Grilled Cheese Sandwich", "Grill"));
        menu[3][0][1].add(new Food("Orange Chicken w/ Rice", "Stir Fry Station"));

        //Dinner
        menu[3][0][2].add(new Food("Chicken Enchilada", "Soups 1"));
        menu[3][0][2].add(new Food("Tomato Basil", "Soups 2"));
        menu[3][0][2].add(new Food("Turkey Club Wrap", "Action Station"));
        menu[3][0][2].add(new Food("Fried Chicken w/ Potatoes", "Main Dish (Entrée)"));
        menu[3][0][2].add(new Food("Mac & Cheese", "Vegetarian/Vegan (Entrée)"));
        menu[3][0][2].add(new Food("Corned Beef Reuben Sandwich", "Grill"));
        menu[3][0][2].add(new Food("Broccoli Beef w/ Rice", "Stir Fry Station"));

        //Tuesday
        //Breakfast
        menu[3][1][0].add(new Food("Grits", "Breakfast Bar"));
        menu[3][1][0].add(new Food("Breakfast Croissant", "Breakfast Bar"));
        menu[3][1][0].add(new Food("Bacon", "Breakfast Bar"));
        menu[3][1][0].add(new Food("Cottage Fries", "Breakfast Bar"));

        //Lunch
        menu[3][1][1].add(new Food("Caldo de Rez", "Soups 1"));
        menu[3][1][1].add(new Food("Corn Chowder", "Soups 2"));
        menu[3][1][1].add(new Food("Buffalo Chicken Wrap", "Action Station"));
        menu[3][1][1].add(new Food("BBQ Pork Loin w/ Potatoes", "Main Dish (Entrée)"));
        menu[3][1][1].add(new Food("Roasted Cauliflower Steak", "Vegetarian/Vegan (Entrée)"));
        menu[3][1][1].add(new Food("Philly Cheese Steak Quesadilla", "Grill"));
        menu[3][1][1].add(new Food("Turkey Burrito Bowl", "Stir Fry Station"));

        //Dinner
        menu[3][1][2].add(new Food("Caldo de Rez", "Soups 1"));
        menu[3][1][2].add(new Food("Corn Chowder", "Soups 2"));
        menu[3][1][2].add(new Food("Taco Salad", "Action Station"));
        menu[3][1][2].add(new Food("Seasonal Fish w/ Couscous", "Main Dish (Entrée)"));
        menu[3][1][2].add(new Food("Ratatouille w/ Roasted Tomato", "Vegetarian/Vegan (Entrée)"));
        menu[3][1][2].add(new Food("Chicken Wings", "Grill"));
        menu[3][1][2].add(new Food("Sweet & Sour Pork w/ Rice", "Stir Fry Station"));

        //Wednesday
        //Breakfast
        menu[3][2][0].add(new Food("Grits", "Breakfast Bar"));
        menu[3][2][0].add(new Food("Breakfast Croissant", "Breakfast Bar"));
        menu[3][2][0].add(new Food("Bacon", "Breakfast Bar"));
        menu[3][2][0].add(new Food("Cottage Fries", "Breakfast Bar"));

        //Lunch
        menu[3][2][1].add(new Food("Caldo de Rez", "Soups 1"));
        menu[3][2][1].add(new Food("Corn Chowder", "Soups 2"));
        menu[3][2][1].add(new Food("Buffalo Chicken Wrap", "Action Station"));
        menu[3][2][1].add(new Food("BBQ Pork Loin w/ Potatoes", "Main Dish (Entrée)"));
        menu[3][2][1].add(new Food("Roasted Cauliflower Steak", "Vegetarian/Vegan (Entrée)"));
        menu[3][2][1].add(new Food("Philly Cheese Steak Quesadilla", "Grill"));
        menu[3][2][1].add(new Food("Turkey Burrito Bowl", "Stir Fry Station"));

        //Dinner
        menu[3][2][2].add(new Food("Caldo de Rez", "Soups 1"));
        menu[3][2][2].add(new Food("Corn Chowder", "Soups 2"));
        menu[3][2][2].add(new Food("Taco Salad", "Action Station"));
        menu[3][2][2].add(new Food("Seasonal Fish w/ Couscous", "Main Dish (Entrée)"));
        menu[3][2][2].add(new Food("Ratatouille w/ Roasted Tomato", "Vegetarian/Vegan (Entrée)"));
        menu[3][2][2].add(new Food("Chicken Wings", "Grill"));
        menu[3][2][2].add(new Food("Sweet & Sour Pork w/ Rice", "Stir Fry Station"));

        //Thursday
        //Breakfast
        menu[3][3][0].add(new Food("Grits", "Breakfast Bar"));
        menu[3][3][0].add(new Food("Breakfast Croissant", "Breakfast Bar"));
        menu[3][3][0].add(new Food("Bacon", "Breakfast Bar"));
        menu[3][3][0].add(new Food("Cottage Fries", "Breakfast Bar"));

        //Lunch
        menu[3][3][1].add(new Food("Caldo de Rez", "Soups 1"));
        menu[3][3][1].add(new Food("Corn Chowder", "Soups 2"));
        menu[3][3][1].add(new Food("Buffalo Chicken Wrap", "Action Station"));
        menu[3][3][1].add(new Food("BBQ Pork Loin w/ Potatoes", "Main Dish (Entrée)"));
        menu[3][3][1].add(new Food("Roasted Cauliflower Steak", "Vegetarian/Vegan (Entrée)"));
        menu[3][3][1].add(new Food("Philly Cheese Steak Quesadilla", "Grill"));
        menu[3][3][1].add(new Food("Turkey Burrito Bowl", "Stir Fry Station"));

        //Dinner
        menu[3][3][2].add(new Food("Caldo de Rez", "Soups 1"));
        menu[3][3][2].add(new Food("Corn Chowder", "Soups 2"));
        menu[3][3][2].add(new Food("Taco Salad", "Action Station"));
        menu[3][3][2].add(new Food("Seasonal Fish w/ Couscous", "Main Dish (Entrée)"));
        menu[3][3][2].add(new Food("Ratatouille w/ Roasted Tomato", "Vegetarian/Vegan (Entrée)"));
        menu[3][3][2].add(new Food("Chicken Wings", "Grill"));
        menu[3][3][2].add(new Food("Sweet & Sour Pork w/ Rice", "Stir Fry Station"));

        //Friday
        //Breakfast
        menu[3][4][0].add(new Food("Grits", "Breakfast Bar"));
        menu[3][4][0].add(new Food("Breakfast Croissant", "Breakfast Bar"));
        menu[3][4][0].add(new Food("Bacon", "Breakfast Bar"));
        menu[3][4][0].add(new Food("Cottage Fries", "Breakfast Bar"));

        //Lunch
        menu[3][4][1].add(new Food("Caldo de Rez", "Soups 1"));
        menu[3][4][1].add(new Food("Corn Chowder", "Soups 2"));
        menu[3][4][1].add(new Food("Buffalo Chicken Wrap", "Action Station"));
        menu[3][4][1].add(new Food("BBQ Pork Loin w/ Potatoes", "Main Dish (Entrée)"));
        menu[3][4][1].add(new Food("Roasted Cauliflower Steak", "Vegetarian/Vegan (Entrée)"));
        menu[3][4][1].add(new Food("Philly Cheese Steak Quesadilla", "Grill"));
        menu[3][4][1].add(new Food("Turkey Burrito Bowl", "Stir Fry Station"));

        //Dinner
        menu[3][4][2].add(new Food("Caldo de Rez", "Soups 1"));
        menu[3][4][2].add(new Food("Corn Chowder", "Soups 2"));
        menu[3][4][2].add(new Food("Taco Salad", "Action Station"));
        menu[3][4][2].add(new Food("Seasonal Fish w/ Couscous", "Main Dish (Entrée)"));
        menu[3][4][2].add(new Food("Ratatouille w/ Roasted Tomato", "Vegetarian/Vegan (Entrée)"));
        menu[3][4][2].add(new Food("Chicken Wings", "Grill"));
        menu[3][4][2].add(new Food("Sweet & Sour Pork w/ Rice", "Stir Fry Station"));

        //Saturday
        //Breakfast
        menu[3][5][0].add(new Food("Grits", "Breakfast Bar"));
        menu[3][5][0].add(new Food("Breakfast Croissant", "Breakfast Bar"));
        menu[3][5][0].add(new Food("Bacon", "Breakfast Bar"));
        menu[3][5][0].add(new Food("Cottage Fries", "Breakfast Bar"));

        //Lunch
        menu[3][5][1].add(new Food("Caldo de Rez", "Soups 1"));
        menu[3][5][1].add(new Food("Corn Chowder", "Soups 2"));
        menu[3][5][1].add(new Food("Buffalo Chicken Wrap", "Action Station"));
        menu[3][5][1].add(new Food("BBQ Pork Loin w/ Potatoes", "Main Dish (Entrée)"));
        menu[3][5][1].add(new Food("Roasted Cauliflower Steak", "Vegetarian/Vegan (Entrée)"));
        menu[3][5][1].add(new Food("Philly Cheese Steak Quesadilla", "Grill"));
        menu[3][5][1].add(new Food("Turkey Burrito Bowl", "Stir Fry Station"));

        //Dinner
        menu[3][5][2].add(new Food("Caldo de Rez", "Soups 1"));
        menu[3][5][2].add(new Food("Corn Chowder", "Soups 2"));
        menu[3][5][2].add(new Food("Taco Salad", "Action Station"));
        menu[3][5][2].add(new Food("Seasonal Fish w/ Couscous", "Main Dish (Entrée)"));
        menu[3][5][2].add(new Food("Ratatouille w/ Roasted Tomato", "Vegetarian/Vegan (Entrée)"));
        menu[3][5][2].add(new Food("Chicken Wings", "Grill"));
        menu[3][5][2].add(new Food("Sweet & Sour Pork w/ Rice", "Stir Fry Station"));
        //End of cycle 4 ---------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------

        //Cycle 5
        //Monday
        //Breakfast
        menu[4][0][0].add(new Food("Cream of Wheat", "Breakfast Bar"));
        menu[4][0][0].add(new Food("Buttermilk Pancakes", "Breakfast Bar"));
        menu[4][0][0].add(new Food("Sausage Patty", "Breakfast Bar"));
        menu[4][0][0].add(new Food("Potato Patty", "Breakfast Bar"));

        //Lunch
        menu[4][0][1].add(new Food("Chicken Enchilada", "Soups 1"));
        menu[4][0][1].add(new Food("Tomato Basil", "Soups 2"));
        menu[4][0][1].add(new Food("Caesar Salad", "Action Station"));
        menu[4][0][1].add(new Food("Chicken Picatta w/ Rice Pilaf", "Main Dish (Entrée)"));
        menu[4][0][1].add(new Food("Assorted Hummus Bar", "Vegetarian/Vegan (Entrée)"));
        menu[4][0][1].add(new Food("Grilled Cheese Sandwich", "Grill"));
        menu[4][0][1].add(new Food("Orange Chicken w/ Rice", "Stir Fry Station"));

        //Dinner
        menu[4][0][2].add(new Food("Chicken Enchilada", "Soups 1"));
        menu[4][0][2].add(new Food("Tomato Basil", "Soups 2"));
        menu[4][0][2].add(new Food("Turkey Club Wrap", "Action Station"));
        menu[4][0][2].add(new Food("Fried Chicken w/ Potatoes", "Main Dish (Entrée)"));
        menu[4][0][2].add(new Food("Mac & Cheese", "Vegetarian/Vegan (Entrée)"));
        menu[4][0][2].add(new Food("Corned Beef Reuben Sandwich", "Grill"));
        menu[4][0][2].add(new Food("Broccoli Beef w/ Rice", "Stir Fry Station"));

        //Tuesday
        //Breakfast
        menu[4][1][0].add(new Food("Grits", "Breakfast Bar"));
        menu[4][1][0].add(new Food("Breakfast Croissant", "Breakfast Bar"));
        menu[4][1][0].add(new Food("Bacon", "Breakfast Bar"));
        menu[4][1][0].add(new Food("Cottage Fries", "Breakfast Bar"));

        //Lunch
        menu[4][1][1].add(new Food("Caldo de Rez", "Soups 1"));
        menu[4][1][1].add(new Food("Corn Chowder", "Soups 2"));
        menu[4][1][1].add(new Food("Buffalo Chicken Wrap", "Action Station"));
        menu[4][1][1].add(new Food("BBQ Pork Loin w/ Potatoes", "Main Dish (Entrée)"));
        menu[4][1][1].add(new Food("Roasted Cauliflower Steak", "Vegetarian/Vegan (Entrée)"));
        menu[4][1][1].add(new Food("Philly Cheese Steak Quesadilla", "Grill"));
        menu[4][1][1].add(new Food("Turkey Burrito Bowl", "Stir Fry Station"));

        //Dinner
        menu[4][1][2].add(new Food("Caldo de Rez", "Soups 1"));
        menu[4][1][2].add(new Food("Corn Chowder", "Soups 2"));
        menu[4][1][2].add(new Food("Taco Salad", "Action Station"));
        menu[4][1][2].add(new Food("Seasonal Fish w/ Couscous", "Main Dish (Entrée)"));
        menu[4][1][2].add(new Food("Ratatouille w/ Roasted Tomato", "Vegetarian/Vegan (Entrée)"));
        menu[4][1][2].add(new Food("Chicken Wings", "Grill"));
        menu[4][1][2].add(new Food("Sweet & Sour Pork w/ Rice", "Stir Fry Station"));

        //Wednesday
        //Breakfast
        menu[4][2][0].add(new Food("Grits", "Breakfast Bar"));
        menu[4][2][0].add(new Food("Breakfast Croissant", "Breakfast Bar"));
        menu[4][2][0].add(new Food("Bacon", "Breakfast Bar"));
        menu[4][2][0].add(new Food("Cottage Fries", "Breakfast Bar"));

        //Lunch
        menu[4][2][1].add(new Food("Caldo de Rez", "Soups 1"));
        menu[4][2][1].add(new Food("Corn Chowder", "Soups 2"));
        menu[4][2][1].add(new Food("Buffalo Chicken Wrap", "Action Station"));
        menu[4][2][1].add(new Food("BBQ Pork Loin w/ Potatoes", "Main Dish (Entrée)"));
        menu[4][2][1].add(new Food("Roasted Cauliflower Steak", "Vegetarian/Vegan (Entrée)"));
        menu[4][2][1].add(new Food("Philly Cheese Steak Quesadilla", "Grill"));
        menu[4][2][1].add(new Food("Turkey Burrito Bowl", "Stir Fry Station"));

        //Dinner
        menu[4][2][2].add(new Food("Caldo de Rez", "Soups 1"));
        menu[4][2][2].add(new Food("Corn Chowder", "Soups 2"));
        menu[4][2][2].add(new Food("Taco Salad", "Action Station"));
        menu[4][2][2].add(new Food("Seasonal Fish w/ Couscous", "Main Dish (Entrée)"));
        menu[4][2][2].add(new Food("Ratatouille w/ Roasted Tomato", "Vegetarian/Vegan (Entrée)"));
        menu[4][2][2].add(new Food("Chicken Wings", "Grill"));
        menu[4][2][2].add(new Food("Sweet & Sour Pork w/ Rice", "Stir Fry Station"));

        //Thursday
        //Breakfast
        menu[4][3][0].add(new Food("Grits", "Breakfast Bar"));
        menu[4][3][0].add(new Food("Breakfast Croissant", "Breakfast Bar"));
        menu[4][3][0].add(new Food("Bacon", "Breakfast Bar"));
        menu[4][3][0].add(new Food("Cottage Fries", "Breakfast Bar"));

        //Lunch
        menu[4][3][1].add(new Food("Caldo de Rez", "Soups 1"));
        menu[4][3][1].add(new Food("Corn Chowder", "Soups 2"));
        menu[4][3][1].add(new Food("Buffalo Chicken Wrap", "Action Station"));
        menu[4][3][1].add(new Food("BBQ Pork Loin w/ Potatoes", "Main Dish (Entrée)"));
        menu[4][3][1].add(new Food("Roasted Cauliflower Steak", "Vegetarian/Vegan (Entrée)"));
        menu[4][3][1].add(new Food("Philly Cheese Steak Quesadilla", "Grill"));
        menu[4][3][1].add(new Food("Turkey Burrito Bowl", "Stir Fry Station"));

        //Dinner
        menu[4][3][2].add(new Food("Caldo de Rez", "Soups 1"));
        menu[4][3][2].add(new Food("Corn Chowder", "Soups 2"));
        menu[4][3][2].add(new Food("Taco Salad", "Action Station"));
        menu[4][3][2].add(new Food("Seasonal Fish w/ Couscous", "Main Dish (Entrée)"));
        menu[4][3][2].add(new Food("Ratatouille w/ Roasted Tomato", "Vegetarian/Vegan (Entrée)"));
        menu[4][3][2].add(new Food("Chicken Wings", "Grill"));
        menu[4][3][2].add(new Food("Sweet & Sour Pork w/ Rice", "Stir Fry Station"));

        //Friday
        //Breakfast
        menu[4][4][0].add(new Food("Grits", "Breakfast Bar"));
        menu[4][4][0].add(new Food("Breakfast Croissant", "Breakfast Bar"));
        menu[4][4][0].add(new Food("Bacon", "Breakfast Bar"));
        menu[4][4][0].add(new Food("Cottage Fries", "Breakfast Bar"));

        //Lunch
        menu[4][4][1].add(new Food("Caldo de Rez", "Soups 1"));
        menu[4][4][1].add(new Food("Corn Chowder", "Soups 2"));
        menu[4][4][1].add(new Food("Buffalo Chicken Wrap", "Action Station"));
        menu[4][4][1].add(new Food("BBQ Pork Loin w/ Potatoes", "Main Dish (Entrée)"));
        menu[4][4][1].add(new Food("Roasted Cauliflower Steak", "Vegetarian/Vegan (Entrée)"));
        menu[4][4][1].add(new Food("Philly Cheese Steak Quesadilla", "Grill"));
        menu[4][4][1].add(new Food("Turkey Burrito Bowl", "Stir Fry Station"));

        //Dinner
        menu[4][4][2].add(new Food("Caldo de Rez", "Soups 1"));
        menu[4][4][2].add(new Food("Corn Chowder", "Soups 2"));
        menu[4][4][2].add(new Food("Taco Salad", "Action Station"));
        menu[4][4][2].add(new Food("Seasonal Fish w/ Couscous", "Main Dish (Entrée)"));
        menu[4][4][2].add(new Food("Ratatouille w/ Roasted Tomato", "Vegetarian/Vegan (Entrée)"));
        menu[4][4][2].add(new Food("Chicken Wings", "Grill"));
        menu[4][4][2].add(new Food("Sweet & Sour Pork w/ Rice", "Stir Fry Station"));

        //Saturday
        //Breakfast
        menu[4][5][0].add(new Food("Grits", "Breakfast Bar"));
        menu[4][5][0].add(new Food("Breakfast Croissant", "Breakfast Bar"));
        menu[4][5][0].add(new Food("Bacon", "Breakfast Bar"));
        menu[4][5][0].add(new Food("Cottage Fries", "Breakfast Bar"));

        //Lunch
        menu[4][5][1].add(new Food("Caldo de Rez", "Soups 1"));
        menu[4][5][1].add(new Food("Corn Chowder", "Soups 2"));
        menu[4][5][1].add(new Food("Buffalo Chicken Wrap", "Action Station"));
        menu[4][5][1].add(new Food("BBQ Pork Loin w/ Potatoes", "Main Dish (Entrée)"));
        menu[4][5][1].add(new Food("Roasted Cauliflower Steak", "Vegetarian/Vegan (Entrée)"));
        menu[4][5][1].add(new Food("Philly Cheese Steak Quesadilla", "Grill"));
        menu[4][5][1].add(new Food("Turkey Burrito Bowl", "Stir Fry Station"));

        //Dinner
        menu[4][5][2].add(new Food("Caldo de Rez", "Soups 1"));
        menu[4][5][2].add(new Food("Corn Chowder", "Soups 2"));
        menu[4][5][2].add(new Food("Taco Salad", "Action Station"));
        menu[4][5][2].add(new Food("Seasonal Fish w/ Couscous", "Main Dish (Entrée)"));
        menu[4][5][2].add(new Food("Ratatouille w/ Roasted Tomato", "Vegetarian/Vegan (Entrée)"));
        menu[4][5][2].add(new Food("Chicken Wings", "Grill"));
        menu[4][5][2].add(new Food("Sweet & Sour Pork w/ Rice", "Stir Fry Station"));
        //End of cycle 5 ---------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------
    }


}
