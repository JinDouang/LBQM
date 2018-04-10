package com.lbqm.longbeachquickmenu.database;

import java.util.ArrayList;

public class DatabaseHillsideMenu {

    private ArrayList<Food>[][][] menu = new ArrayList[5][7][3];

    public ArrayList<Food> getMenu(int cycle, int day, int time){
        return menu[cycle][day][time];
    }

    public int getCycleLength() {
        int myLength = 0;
        myLength = menu.length;
        return myLength;
    }

    public int getDayLength(int cycle) {
        int myLength = 0;
        myLength = menu[cycle].length;
        return myLength;
    }

    public int getTimeLength(int cycle, int day) {
        int myLength = 0;
        myLength = menu[cycle][day].length;
        return myLength;
    }

    public int getFoodLength(int cycle, int day, int time) {
        int myLength = 0;
        myLength = menu[cycle][day][time].size();
        return myLength;
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
        menu[1][1][0].add(new Food("Egg & Cheese Muffin", "Breakfast Bar"));
        menu[1][1][0].add(new Food("Bacon", "Breakfast Bar"));
        menu[1][1][0].add(new Food("Cottage Fries", "Breakfast Bar"));

        //Lunch
        menu[1][1][1].add(new Food("Albondigas", "Soups 1"));
        menu[1][1][1].add(new Food("Corn Chowder", "Soups 2"));
        menu[1][1][1].add(new Food("Chicken Cobb Wrap", "Action Station"));
        menu[1][1][1].add(new Food("Korean Short Ribs w/ Rice", "Main Dish (Entrée)"));
        menu[1][1][1].add(new Food("Mole Tater Tot Bowl", "Vegetarian/Vegan (Entrée)"));
        menu[1][1][1].add(new Food("Turkey Burger", "Grill"));
        menu[1][1][1].add(new Food("Chicken Pad Thai w/ Noodles", "Stir Fry Station"));

        //Dinner
        menu[1][1][2].add(new Food("Albondigas", "Soups 1"));
        menu[1][1][2].add(new Food("Corn Chowder", "Soups 2"));
        menu[1][1][2].add(new Food("Strawberry Spinach Salad", "Action Station"));
        menu[1][1][2].add(new Food("Citrus Chicken w/ Potatoes", "Main Dish (Entrée)"));
        menu[1][1][2].add(new Food("Vegetable Wellington w/ Balsamic", "Vegetarian/Vegan (Entrée)"));
        menu[1][1][2].add(new Food("Turkey Pesto Flatbread", "Grill"));
        menu[1][1][2].add(new Food("Beef Burrito Bowl", "Stir Fry Station"));

        //Wednesday
        //Breakfast
        menu[1][2][0].add(new Food("Cinnamon Rice", "Breakfast Bar"));
        menu[1][2][0].add(new Food("Blueberry Pancakes", "Breakfast Bar"));
        menu[1][2][0].add(new Food("Sausage Links", "Breakfast Bar"));
        menu[1][2][0].add(new Food("Hash Brown Potatoes", "Breakfast Bar"));

        //Lunch
        menu[1][2][1].add(new Food("Turkey Noodle", "Soups 1"));
        menu[1][2][1].add(new Food("Butternut Squash", "Soups 2"));
        menu[1][2][1].add(new Food("Caprese Salad", "Action Station"));
        menu[1][2][1].add(new Food("Carne Asada Tacos w/ Rice & Beans", "Main Dish (Entrée)"));
        menu[1][2][1].add(new Food("Potato & Vegetable Curry w/ Rice", "Vegetarian/Vegan (Entrée)"));
        menu[1][2][1].add(new Food("Grilled Chicken Club Sandwich", "Grill"));
        menu[1][2][1].add(new Food("Shrimp Scampi Linguine", "Stir Fry Station"));

        //Dinner
        menu[1][2][2].add(new Food("Turkey Noodle", "Soups 1"));
        menu[1][2][2].add(new Food("Butternut Squash", "Soups 2"));
        menu[1][2][2].add(new Food("Crispy Honey Mustard Chicken Wrap", "Action Station"));
        menu[1][2][2].add(new Food("BBQ Pork Ribs w/ Baked Bean", "Main Dish (Entrée)"));
        menu[1][2][2].add(new Food("Cheesy Broccoli & Rice Casserole", "Vegetarian/Vegan (Entrée)"));
        menu[1][2][2].add(new Food("Chicken Tinga Tostadas", "Grill"));
        menu[1][2][2].add(new Food("Beef Bibimap w/ Jasmine Rice", "Stir Fry Station"));

        //Thursday
        //Breakfast
        menu[1][3][0].add(new Food("Cream of Wheat", "Breakfast Bar"));
        menu[1][3][0].add(new Food("Chorizo & Egg Burrito ", "Breakfast Bar"));
        menu[1][3][0].add(new Food("Turkey Sausage", "Breakfast Bar"));
        menu[1][3][0].add(new Food("Home Fries Potatoes", "Breakfast Bar"));

        //Lunch
        menu[1][3][1].add(new Food("Posole", "Soups 1"));
        menu[1][3][1].add(new Food("Cream of Potato", "Soups 2"));
        menu[1][3][1].add(new Food("Chinese Chicken Salad", "Action Station"));
        menu[1][3][1].add(new Food("Chicken Cacciatore w/ Fettuchini", "Main Dish (Entrée)"));
        menu[1][3][1].add(new Food("Chile Relleno w/ Rice", "Vegetarian/Vegan (Entrée)"));
        menu[1][3][1].add(new Food("Pastrami Sandwich", "Grill"));
        menu[1][3][1].add(new Food("Teriyaki Beef w/ Rice", "Stir Fry Station"));

        //Dinner
        menu[1][3][2].add(new Food("Posole", "Soups 1"));
        menu[1][3][2].add(new Food("Cream of Potato", "Soups 2"));
        menu[1][3][2].add(new Food("Antipasta Salad", "Action Station"));
        menu[1][3][2].add(new Food("Beef Tamale w/ Rice & Beans", "Main Dish (Entrée)"));
        menu[1][3][2].add(new Food("Cheese Tamale w/ Rice & Beans", "Vegetarian/Vegan (Entrée)"));
        menu[1][3][2].add(new Food("Miner Chicken Sandwich", "Grill"));
        menu[1][3][2].add(new Food("Kung Pow Chicken w/ Rice", "Stir Fry Station"));

        //Friday
        //Breakfast
        menu[1][4][0].add(new Food("Grits", "Breakfast Bar"));
        menu[1][4][0].add(new Food("Chocolate Chip Pancakes", "Breakfast Bar"));
        menu[1][4][0].add(new Food("Bacon", "Breakfast Bar"));
        menu[1][4][0].add(new Food("Tater Tots", "Breakfast Bar"));

        //Lunch
        menu[1][4][1].add(new Food("Clam Chowder", "Soups 1"));
        menu[1][4][1].add(new Food("Miso Soup", "Soups 2"));
        menu[1][4][1].add(new Food("Fresh Fruit Salad", "Action Station"));
        menu[1][4][1].add(new Food("Balsamic Salmon w/ Rice Pilaf", "Main Dish (Entrée)"));
        menu[1][4][1].add(new Food("Ramen Noodle Bowl", "Vegetarian/Vegan (Entrée)"));
        menu[1][4][1].add(new Food("Sloppy Joes", "Grill"));
        menu[1][4][1].add(new Food("Chicken Pot Stickers w/ Rice", "Stir Fry Station"));

        //Dinner
        menu[1][4][2].add(new Food("Clam Chowder", "Soups 1"));
        menu[1][4][2].add(new Food("Miso Soup", "Soups 2"));
        menu[1][4][2].add(new Food("Garden Kale Salad", "Action Station"));
        menu[1][4][2].add(new Food("Chicken Parmesan w/ Spaghetti", "Main Dish (Entrée)"));
        menu[1][4][2].add(new Food("Vegetarian Chile Cheese Fries", "Vegetarian/Vegan (Entrée)"));
        menu[1][4][2].add(new Food("Teriyaki Pineapple Burger", "Grill"));
        menu[1][4][2].add(new Food("Stir Fry Shrimp w/ Rice", "Stir Fry Station"));

        //Saturday
        //Breakfast
        menu[1][5][0].add(new Food("Arroz Con Leche", "Breakfast Bar"));
        menu[1][5][0].add(new Food("French Toast", "Breakfast Bar"));
        menu[1][5][0].add(new Food("Kielbasa Sausage", "Breakfast Bar"));
        menu[1][5][0].add(new Food("Potatoes O’ Brien", "Breakfast Bar"));

        //Lunch
        menu[1][5][1].add(new Food("Italian Wedding", "Soups 1"));
        menu[1][5][1].add(new Food("Broccoli Cheddar", "Soups 2"));
        menu[1][5][1].add(new Food("Smoothie Bar", "Action Station"));
        menu[1][5][1].add(new Food("Chicken Pot Pie w/ Puff Pastry", "Main Dish (Entrée)"));
        menu[1][5][1].add(new Food("Baked Ravioli w/ Spinach Cream Sauce", "Vegetarian/Vegan (Entrée)"));
        menu[1][5][1].add(new Food("Omelet Bar", "Grill"));
        menu[1][5][1].add(new Food("Breakfast Quesadillas", "Stir Fry Station"));

        //Dinner
        menu[1][5][2].add(new Food("Italian Wedding", "Soups 1"));
        menu[1][5][2].add(new Food("Broccoli Cheddar", "Soups 2"));
        menu[1][5][2].add(new Food("Quinoa & Vegetable Grain Salad", "Action Station"));
        menu[1][5][2].add(new Food("Asian Glazed Tri Tip w/ Rice", "Main Dish (Entrée)"));
        menu[1][5][2].add(new Food("Black Bean Veggie Burgers", "Vegetarian/Vegan (Entrée)"));
        menu[1][5][2].add(new Food("Fish & Chips", "Grill"));
        menu[1][5][2].add(new Food("Pollo Asado Tacos w/ Rice", "Stir Fry Station"));
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
        menu[2][0][1].add(new Food("Cilantro Caesar Salad", "Action Station"));
        menu[2][0][1].add(new Food("Artichoke Chicken w/ Potatoes", "Main Dish (Entrée)"));
        menu[2][0][1].add(new Food("Penne Primavera", "Vegetarian/Vegan (Entrée)"));
        menu[2][0][1].add(new Food("Carne Asada Quesadilla", "Grill"));
        menu[2][0][1].add(new Food("Pork & Vegetable Chow Mein", "Stir Fry Station"));

        //Dinner
        menu[2][0][2].add(new Food("Chicken Enchilada", "Soups 1"));
        menu[2][0][2].add(new Food("Tomato Basil", "Soups 2"));
        menu[2][0][2].add(new Food("Buffalo Chicken Wrap", "Action Station"));
        menu[2][0][2].add(new Food("Lomo Saltado w/ Papas", "Main Dish (Entrée)"));
        menu[2][0][2].add(new Food("Caprese Flatbread", "Vegetarian/Vegan (Entrée)"));
        menu[2][0][2].add(new Food("Ortega Chicken Sandwich", "Grill"));
        menu[2][0][2].add(new Food("Orange Chicken w/ Rice", "Stir Fry Station"));

        //Tuesday
        //Breakfast
        menu[2][1][0].add(new Food("Grits", "Breakfast Bar"));
        menu[2][1][0].add(new Food("Chilaquiles", "Breakfast Bar"));
        menu[2][1][0].add(new Food("Bacon", "Breakfast Bar"));
        menu[2][1][0].add(new Food("Cottage Fries", "Breakfast Bar"));

        //Lunch
        menu[2][1][1].add(new Food("Caldo de Rez", "Soups 1"));
        menu[2][1][1].add(new Food("Corn Chowder", "Soups 2"));
        menu[2][1][1].add(new Food("Chef Salad Wrap", "Action Station"));
        menu[2][1][1].add(new Food("Spaghetti & Meatballs", "Main Dish (Entrée)"));
        menu[2][1][1].add(new Food("Falafel Taco", "Vegetarian/Vegan (Entrée)"));
        menu[2][1][1].add(new Food("Spicy Dijon Bratwurst", "Grill"));
        menu[2][1][1].add(new Food("Sweet & Sour Chicken w/ Rice ", "Stir Fry Station"));

        //Dinner
        menu[2][1][2].add(new Food("Caldo de Rez", "Soups 1"));
        menu[2][1][2].add(new Food("Corn Chowder", "Soups 2"));
        menu[2][1][2].add(new Food("Pasta Salad", "Action Station"));
        menu[2][1][2].add(new Food("Chicken Tiki Masala w/ Rice", "Main Dish (Entrée)"));
        menu[2][1][2].add(new Food("Baked Manicotti w/ Tomato Sauce", "Vegetarian/Vegan (Entrée)"));
        menu[2][1][2].add(new Food("Cuban Sandwich", "Grill"));
        menu[2][1][2].add(new Food("Beef Fajitas w/ Rice", "Stir Fry Station"));

        //Wednesday
        //Breakfast
        menu[2][2][0].add(new Food("Cinnamon Rice", "Breakfast Bar"));
        menu[2][2][0].add(new Food("Blueberry Pancakes", "Breakfast Bar"));
        menu[2][2][0].add(new Food("Sausage Links", "Breakfast Bar"));
        menu[2][2][0].add(new Food("Hash Brown Potatoes", "Breakfast Bar"));

        //Lunch
        menu[2][2][1].add(new Food("Chicken Noodle", "Soups 1"));
        menu[2][2][1].add(new Food("Butternut Squash", "Soups 2"));
        menu[2][2][1].add(new Food("Fattoush", "Action Station"));
        menu[2][2][1].add(new Food("Harissa Chicken w/ Potatoes", "Main Dish (Entrée)"));
        menu[2][2][1].add(new Food("Baked Ravioli w/ Gorgonzola Sauc", "Vegetarian/Vegan (Entrée)"));
        menu[2][2][1].add(new Food("Grilled Ham & Cheese Sandwich", "Grill"));
        menu[2][2][1].add(new Food("Barbacoa Tacos w/ Rice", "Stir Fry Station"));

        //Dinner
        menu[2][2][2].add(new Food("Chicken Noodle", "Soups 1"));
        menu[2][2][2].add(new Food("Butternut Squash", "Soups 2"));
        menu[2][2][2].add(new Food("Greek Salad Wrap", "Action Station"));
        menu[2][2][2].add(new Food("Seasonal Fish w/ Rice Filaf", "Main Dish (Entrée)"));
        menu[2][2][2].add(new Food("Potato Bar w/ Vegetarian Chili", "Vegetarian/Vegan (Entrée)"));
        menu[2][2][2].add(new Food("Chicken Gyro w/ Tzatziki Sauce", "Grill"));
        menu[2][2][2].add(new Food("Beijing Beef w/ Rice", "Stir Fry Station"));

        //Thursday
        //Breakfast
        menu[2][3][0].add(new Food("Cream of Wheat", "Breakfast Bar"));
        menu[2][3][0].add(new Food("Fresh Cinnamon Rolls", "Breakfast Bar"));
        menu[2][3][0].add(new Food("Turkey Sausage", "Breakfast Bar"));
        menu[2][3][0].add(new Food("Home Fries Potatoes", "Breakfast Bar"));

        //Lunch
        menu[2][3][1].add(new Food("Posole", "Soups 1"));
        menu[2][3][1].add(new Food("Potato Cheese", "Soups 2"));
        menu[2][3][1].add(new Food("BBQ Chicken Salad Wrap", "Action Station"));
        menu[2][3][1].add(new Food("Super Nacho Bar", "Main Dish (Entrée)"));
        menu[2][3][1].add(new Food("Roasted Vegetable & Quinoa", "Vegetarian/Vegan (Entrée)"));
        menu[2][3][1].add(new Food("Crispy Chicken Tenders", "Grill"));
        menu[2][3][1].add(new Food("Crispy Pork Egg Rolls w/ Rice", "Stir Fry Station"));

        //Dinner
        menu[2][3][2].add(new Food("Posole", "Soups 1"));
        menu[2][3][2].add(new Food("Potato Cheese", "Soups 2"));
        menu[2][3][2].add(new Food("Cobb Salad", "Action Station"));
        menu[2][3][2].add(new Food("Pork Ribs w/ Vegetable Chow Mein", "Main Dish (Entrée)"));
        menu[2][3][2].add(new Food("Mac & Cheese", "Vegetarian/Vegan (Entrée)"));
        menu[2][3][2].add(new Food("Chicken Alfredo Pizza", "Grill"));
        menu[2][3][2].add(new Food("Turkey Burrito Bowl", "Stir Fry Station"));

        //Friday
        //Breakfast
        menu[2][4][0].add(new Food("Grits", "Breakfast Bar"));
        menu[2][4][0].add(new Food("Chocolate Chip Pancakes", "Breakfast Bar"));
        menu[2][4][0].add(new Food("Bacon", "Breakfast Bar"));
        menu[2][4][0].add(new Food("Tater Tots", "Breakfast Bar"));

        //Lunch
        menu[2][4][1].add(new Food("Clam Chowder", "Soups 1"));
        menu[2][4][1].add(new Food("Minestroni", "Soups 2"));
        menu[2][4][1].add(new Food("Apple Spinach Salad", "Action Station"));
        menu[2][4][1].add(new Food("Chipotle Salmon w/ Rice", "Main Dish (Entrée)"));
        menu[2][4][1].add(new Food("Assorted Hummus Bar ", "Vegetarian/Vegan (Entrée)"));
        menu[2][4][1].add(new Food("Philly Cheese Steak Sandwich", "Grill"));
        menu[2][4][1].add(new Food("Chicken & Vegetable Chow Mein", "Stir Fry Station"));

        //Dinner
        menu[2][4][2].add(new Food("Clam Chowder", "Soups 1"));
        menu[2][4][2].add(new Food("Minestroni", "Soups 2"));
        menu[2][4][2].add(new Food("Chipotle Chicken Caesar Wrap", "Action Station"));
        menu[2][4][2].add(new Food("Fried Chicken w/ Potatoes", "Main Dish (Entrée)"));
        menu[2][4][2].add(new Food("Roasted Cauliflower Steak", "Vegetarian/Vegan (Entrée)"));
        menu[2][4][2].add(new Food("Carne Asada Torta", "Grill"));
        menu[2][4][2].add(new Food("Pork & Vegetable Fried Rice", "Stir Fry Station"));

        //Saturday
        //Breakfast
        menu[2][5][0].add(new Food("Arroz Con Leche", "Breakfast Bar"));
        menu[2][5][0].add(new Food("French Toast", "Breakfast Bar"));
        menu[2][5][0].add(new Food("Kielbasa Sausage", "Breakfast Bar"));
        menu[2][5][0].add(new Food("Potatoes O’ Brien", "Breakfast Bar"));

        //Lunch
        menu[2][5][1].add(new Food("Italian Wedding", "Soups 1"));
        menu[2][5][1].add(new Food("Broccoli Cheddar", "Soups 2"));
        menu[2][5][1].add(new Food("Smoothie Bar", "Action Station"));
        menu[2][5][1].add(new Food("Pork Chile Verde w/ Rice", "Main Dish (Entrée)"));
        menu[2][5][1].add(new Food("Baked Cheese Tortellini w/ Pesto Sauce", "Vegetarian/Vegan (Entrée)"));
        menu[2][5][1].add(new Food("Omelet Bar", "Grill"));
        menu[2][5][1].add(new Food("Breakfast Quesadillas", "Stir Fry Station"));

        //Dinner
        menu[2][5][2].add(new Food("Italian Wedding", "Soups 1"));
        menu[2][5][2].add(new Food("Cream of Broccoli", "Soups 2"));
        menu[2][5][2].add(new Food("Fresh Fruit Salad", "Action Station"));
        menu[2][5][2].add(new Food("Meat Lasagna w/ Breadstick", "Main Dish (Entrée)"));
        menu[2][5][2].add(new Food("Vegetable Lasagna w/ Breadstick", "Vegetarian/Vegan (Entrée)"));
        menu[2][5][2].add(new Food("BBQ Pulled Pork Sandwich", "Grill"));
        menu[2][5][2].add(new Food("Shrimp Pad Thai w/ Noodles", "Stir Fry Station"));
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
        menu[3][0][1].add(new Food("Chicken Tortilla", "Soups 1"));
        menu[3][0][1].add(new Food("Tomato Basil", "Soups 2"));
        menu[3][0][1].add(new Food("Turkey Club Wrap", "Action Station"));
        menu[3][0][1].add(new Food("Chicken Enchilada w/ Rice & Beans", "Main Dish (Entrée)"));
        menu[3][0][1].add(new Food("Cheese Enchilada w/ Rice & Beans", "Vegetarian/Vegan (Entrée)"));
        menu[3][0][1].add(new Food("Salmon Burger", "Grill"));
        menu[3][0][1].add(new Food("Beef Bibimap w/ Rice", "Stir Fry Station"));

        //Dinner
        menu[3][0][2].add(new Food("Chicken Tortilla", "Soups 1"));
        menu[3][0][2].add(new Food("Tomato Basil", "Soups 2"));
        menu[3][0][2].add(new Food("Caesar Salad", "Action Station"));
        menu[3][0][2].add(new Food("Chipotle Chicken w/ Rice", "Main Dish (Entrée)"));
        menu[3][0][2].add(new Food("Ratatouille", "Vegetarian/Vegan (Entrée)"));
        menu[3][0][2].add(new Food("Grilled Cheese Sandwich", "Grill"));
        menu[3][0][2].add(new Food("Sweet & Sour Pork w/ Rice", "Stir Fry Station"));

        //Tuesday
        //Breakfast
        menu[3][1][0].add(new Food("Grits", "Breakfast Bar"));
        menu[3][1][0].add(new Food("Breakfast Croissant", "Breakfast Bar"));
        menu[3][1][0].add(new Food("Bacon", "Breakfast Bar"));
        menu[3][1][0].add(new Food("Cottage Fries", "Breakfast Bar"));

        //Lunch
        menu[3][1][1].add(new Food("Albondigas", "Soups 1"));
        menu[3][1][1].add(new Food("Corn Chowder", "Soups 2"));
        menu[3][1][1].add(new Food("Taco Salad", "Action Station"));
        menu[3][1][1].add(new Food("Chicken Marsala w/ Potatoes", "Main Dish (Entrée)"));
        menu[3][1][1].add(new Food("Vegetable Wellington w/ Balsamic", "Vegetarian/Vegan (Entrée)"));
        menu[3][1][1].add(new Food("Meatball Sandwich", "Grill"));
        menu[3][1][1].add(new Food("Al Pastor Tacos w/ Rice", "Stir Fry Station"));

        //Dinner
        menu[3][1][2].add(new Food("Albondigas", "Soups 1"));
        menu[3][1][2].add(new Food("Corn Chowder", "Soups 2"));
        menu[3][1][2].add(new Food("BBQ Chicken Salad Wrap", "Action Station"));
        menu[3][1][2].add(new Food("Beef Stroganoff w/ Noodles", "Main Dish (Entrée)"));
        menu[3][1][2].add(new Food("Tater Tot Poutine Bowl", "Vegetarian/Vegan (Entrée)"));
        menu[3][1][2].add(new Food("Italian Sausage w/ Peppers & Onions", "Grill"));
        menu[3][1][2].add(new Food("Kung Pow Chicken w/ Rice", "Stir Fry Station"));

        //Wednesday
        //Breakfast
        menu[3][2][0].add(new Food("Cinnamon Rice", "Breakfast Bar"));
        menu[3][2][0].add(new Food("Blueberry Pancakes", "Breakfast Bar"));
        menu[3][2][0].add(new Food("Sausage Links", "Breakfast Bar"));
        menu[3][2][0].add(new Food("Hash Brown Potatoes", "Breakfast Bar"));

        //Lunch
        menu[3][2][1].add(new Food("Turkey Noodle", "Soups 1"));
        menu[3][2][1].add(new Food("Butternut Squash", "Soups 2"));
        menu[3][2][1].add(new Food("Hummus & Roasted Veggie Wrap", "Action Station"));
        menu[3][2][1].add(new Food("Meatloaf w/ Mashed Potatoes", "Main Dish (Entrée)"));
        menu[3][2][1].add(new Food("Roasted Vegetable & Quinoa", "Vegetarian/Vegan (Entrée)"));
        menu[3][2][1].add(new Food("Classic Cheese Burger", "Grill"));
        menu[3][2][1].add(new Food("Crispy Chicken Egg Rolls w/ Rice", "Stir Fry Station"));

        //Dinner
        menu[3][2][2].add(new Food("Turkey Noodle", "Soups 1"));
        menu[3][2][2].add(new Food("Butternut Squash", "Soups 2"));
        menu[3][2][2].add(new Food("Cobb Salad", "Action Station"));
        menu[3][2][2].add(new Food("Chicken Picatta w/ Rice Pilaf", "Main Dish (Entrée)"));
        menu[3][2][2].add(new Food("Vegetarian Chili w/ Corn Bread", "Vegetarian/Vegan (Entrée)"));
        menu[3][2][2].add(new Food("Corned Beef Reuben Sandwich", "Grill"));
        menu[3][2][2].add(new Food("Cajun Shrimp Linguine", "Stir Fry Station"));

        //Thursday
        //Breakfast
        menu[3][3][0].add(new Food("Cream of Wheat", "Breakfast Bar"));
        menu[3][3][0].add(new Food("Biscuits & Gravy", "Breakfast Bar"));
        menu[3][3][0].add(new Food("Turkey Sausage", "Breakfast Bar"));
        menu[3][3][0].add(new Food("Home Fries Potatoes", "Breakfast Bar"));

        //Lunch
        menu[3][3][1].add(new Food("Posole", "Soups 1"));
        menu[3][3][1].add(new Food("Cream of Potato", "Soups 2"));
        menu[3][3][1].add(new Food("California Sushi Roll", "Action Station"));
        menu[3][3][1].add(new Food("Carnitas Wet Burrito w/ Rice & Beans", "Main Dish (Entrée)"));
        menu[3][3][1].add(new Food("Potato & Vegetable Curry w/ Rice", "Vegetarian/Vegan (Entrée)"));
        menu[3][3][1].add(new Food("Teriyaki Pineapple Chicken Sandwich", "Grill"));
        menu[3][3][1].add(new Food("Broccoli Beef w/ Rice", "Stir Fry Station"));

        //Dinner
        menu[3][3][2].add(new Food("Posole", "Soups 1"));
        menu[3][3][2].add(new Food("Cream of Potato", "Soups 2"));
        menu[3][3][2].add(new Food("Buffalo Chicken Wrap", "Action Station"));
        menu[3][3][2].add(new Food("Chicken Tamale w/ Rice & Beans", "Main Dish (Entrée)"));
        menu[3][3][2].add(new Food("Cheese Tamale w/ Rice & Beans", "Vegetarian/Vegan (Entrée)"));
        menu[3][3][2].add(new Food("Fish Sandwich w/ Cole Slaw", "Grill"));
        menu[3][3][2].add(new Food("Thai Green Curry Beef w/ Rice", "Stir Fry Station"));

        //Friday
        //Breakfast
        menu[3][4][0].add(new Food("Grits", "Breakfast Bar"));
        menu[3][4][0].add(new Food("Chocolate Chip Pancakes", "Breakfast Bar"));
        menu[3][4][0].add(new Food("Bacon", "Breakfast Bar"));
        menu[3][4][0].add(new Food("Tater Tots", "Breakfast Bar"));

        //Lunch
        menu[3][4][1].add(new Food("Clam Chowder", "Soups 1"));
        menu[3][4][1].add(new Food("Miso Soup", "Soups 2"));
        menu[3][4][1].add(new Food("Pasta Salad", "Action Station"));
        menu[3][4][1].add(new Food("Herb Crusted Salmon w/ Couscous", "Main Dish (Entrée)"));
        menu[3][4][1].add(new Food("Udon Noodle Bar", "Vegetarian/Vegan (Entrée)"));
        menu[3][4][1].add(new Food("Grilled Chicken Club Sandwich", "Grill"));
        menu[3][4][1].add(new Food("Chicken Fajitas w/ Rice", "Stir Fry Station"));

        //Dinner
        menu[3][4][2].add(new Food("Clam Chowder", "Soups 1"));
        menu[3][4][2].add(new Food("Miso Soup", "Soups 2"));
        menu[3][4][2].add(new Food("Greek Salad", "Action Station"));
        menu[3][4][2].add(new Food("Roasted Turkey w/ All the Fixings”", "Main Dish (Entrée)"));
        menu[3][4][2].add(new Food("Stuffed Shells w/ Pesto Sauce", "Vegetarian/Vegan (Entrée)"));
        menu[3][4][2].add(new Food("Chicken Wings", "Grill"));
        menu[3][4][2].add(new Food("Teriyaki Beef w/ Rice", "Stir Fry Station"));

        //Saturday
        //Breakfast
        menu[3][5][0].add(new Food("Arroz Con Leche", "Breakfast Bar"));
        menu[3][5][0].add(new Food("French Toast", "Breakfast Bar"));
        menu[3][5][0].add(new Food("Kielbasa Sausage", "Breakfast Bar"));
        menu[3][5][0].add(new Food("Potatoes O’ Brien", "Breakfast Bar"));

        //Lunch
        menu[3][5][1].add(new Food("Italian Wedding", "Soups 1"));
        menu[3][5][1].add(new Food("Broccoli Cheddar", "Soups 2"));
        menu[3][5][1].add(new Food("Smoothie Bar", "Action Station"));
        menu[3][5][1].add(new Food("Grilled Asian Tri Tip w/ Rice", "Main Dish (Entrée)"));
        menu[3][5][1].add(new Food("Pasta Bar w/ Marinara & Alfredo Sauce", "Vegetarian/Vegan (Entrée)"));
        menu[3][5][1].add(new Food("Omelet Bar", "Grill"));
        menu[3][5][1].add(new Food("Breakfast Quesadillas", "Stir Fry Station"));

        //Dinner
        menu[3][5][2].add(new Food("Italian Wedding", "Soups 1"));
        menu[3][5][2].add(new Food("Broccoli Cheddar", "Soups 2"));
        menu[3][5][2].add(new Food("Cajun Chicken Caesar Wrap", "Action Station"));
        menu[3][5][2].add(new Food("BBQ Pork Ribs w/ Beans", "Main Dish (Entrée)"));
        menu[3][5][2].add(new Food("Eggplant Parmesan w/ Marinara", "Vegetarian/Vegan (Entrée)"));
        menu[3][5][2].add(new Food("Chicken Bacon Ranch Panini", "Grill"));
        menu[3][5][2].add(new Food("Carne Asada Tacos w/ Rice", "Stir Fry Station"));
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
        menu[4][0][1].add(new Food("Strawberry Spinach Salad", "Action Station"));
        menu[4][0][1].add(new Food("Spaghetti & Meatballs w/ Breadstick", "Main Dish (Entrée)"));
        menu[4][0][1].add(new Food("Chile Relleno w/ Rice ", "Vegetarian/Vegan (Entrée)"));
        menu[4][0][1].add(new Food("Turkey Burger", "Grill"));
        menu[4][0][1].add(new Food("Chicken Pot Stickers w/ Rice", "Stir Fry Station"));

        //Dinner
        menu[4][0][2].add(new Food("Chicken Enchilada", "Soups 1"));
        menu[4][0][2].add(new Food("Tomato Basil", "Soups 2"));
        menu[4][0][2].add(new Food("Caprese Salad ", "Action Station"));
        menu[4][0][2].add(new Food("Citrus Chicken w/ Potatoes", "Main Dish (Entrée)"));
        menu[4][0][2].add(new Food("Baked Ravioli w/ Spinach Sauce", "Vegetarian/Vegan (Entrée)"));
        menu[4][0][2].add(new Food("Sloppy Joes", "Grill"));
        menu[4][0][2].add(new Food("Pork & Vegetable Fried Rice", "Stir Fry Station"));

        //Tuesday
        //Breakfast
        menu[4][1][0].add(new Food("Grits", "Breakfast Bar"));
        menu[4][1][0].add(new Food("Egg & Cheese Muffin", "Breakfast Bar"));
        menu[4][1][0].add(new Food("Bacon", "Breakfast Bar"));
        menu[4][1][0].add(new Food("Cottage Fries", "Breakfast Bar"));

        //Lunch
        menu[4][1][1].add(new Food("Caldo de Rez", "Soups 1"));
        menu[4][1][1].add(new Food("Corn Chowder", "Soups 2"));
        menu[4][1][1].add(new Food("Crispy Honey Mustard Chicken Wrap", "Action Station"));
        menu[4][1][1].add(new Food("Artichoke Chicken w/ Potatoes", "Main Dish (Entrée)"));
        menu[4][1][1].add(new Food("Penne Primavera", "Vegetarian/Vegan (Entrée)"));
        menu[4][1][1].add(new Food("Beef Gyro w/ Tzatziki Sauce", "Grill"));
        menu[4][1][1].add(new Food("Barbacoa Tacos w/ Rice", "Stir Fry Station"));

        //Dinner
        menu[4][1][2].add(new Food("Caldo de Rez", "Soups 1"));
        menu[4][1][2].add(new Food("Corn Chowder", "Soups 2"));
        menu[4][1][2].add(new Food("Chef Salad", "Action Station"));
        menu[4][1][2].add(new Food("Seasonal Fish w/ Rice", "Main Dish (Entrée)"));
        menu[4][1][2].add(new Food("Vegetarian Chile Cheese Fries", "Vegetarian/Vegan (Entrée)"));
        menu[4][1][2].add(new Food("Turkey Pesto Flatbread", "Grill"));
        menu[4][1][2].add(new Food("Pollo Asado Tacos w/ Rice", "Stir Fry Station"));

        //Wednesday
        //Breakfast
        menu[4][2][0].add(new Food("Cinnamon Rice", "Breakfast Bar"));
        menu[4][2][0].add(new Food("Blueberry Pancakes", "Breakfast Bar"));
        menu[4][2][0].add(new Food("Sausage Links", "Breakfast Bar"));
        menu[4][2][0].add(new Food("Hash Brown Potatoes", "Breakfast Bar"));

        //Lunch
        menu[4][2][1].add(new Food("Chicken Noodle", "Soups 1"));
        menu[4][2][1].add(new Food("Butternut Squash", "Soups 2"));
        menu[4][2][1].add(new Food("Antipasta Salad", "Action Station"));
        menu[4][2][1].add(new Food("Lomo Saltado w/ Papas", "Main Dish (Entrée)"));
        menu[4][2][1].add(new Food("Potato Bar w/ Vegetarian Chili", "Vegetarian/Vegan (Entrée)"));
        menu[4][2][1].add(new Food("Ortega Chicken Sandwich", "Grill"));
        menu[4][2][1].add(new Food("Shrimp Scampi Linguine", "Stir Fry Station"));

        //Dinner
        menu[4][2][2].add(new Food("Chicken Noodle", "Soups 1"));
        menu[4][2][2].add(new Food("Butternut Squash", "Soups 2"));
        menu[4][2][2].add(new Food("Chicken Cobb Wrap", "Action Station"));
        menu[4][2][2].add(new Food("Super Nacho Bar", "Main Dish (Entrée)"));
        menu[4][2][2].add(new Food("Mole Tater Tot Bowl", "Vegetarian/Vegan (Entrée)"));
        menu[4][2][2].add(new Food("BBQ Chicken Pizza", "Grill"));
        menu[4][2][2].add(new Food("Sweet & Sour Chicken w/ Rice", "Stir Fry Station"));

        //Thursday
        //Breakfast
        menu[4][3][0].add(new Food("Cream of Wheat", "Breakfast Bar"));
        menu[4][3][0].add(new Food("Chorizo & Egg Burrito", "Breakfast Bar"));
        menu[4][3][0].add(new Food("Turkey Sausage", "Breakfast Bar"));
        menu[4][3][0].add(new Food("Home Fries Potatoes", "Breakfast Bar"));

        //Lunch
        menu[4][3][1].add(new Food("Posole", "Soups 1"));
        menu[4][3][1].add(new Food("Potato Cheese", "Soups 2"));
        menu[4][3][1].add(new Food("Apple Spinach Salad", "Action Station"));
        menu[4][3][1].add(new Food("Chicken Tiki Masala w/ Rice", "Main Dish (Entrée)"));
        menu[4][3][1].add(new Food("Caprese Flatbread", "Vegetarian/Vegan (Entrée)"));
        menu[4][3][1].add(new Food("Pastrami Sandwich", "Grill"));
        menu[4][3][1].add(new Food("Mongolian Beef w/ Rice", "Stir Fry Station"));

        //Dinner
        menu[4][3][2].add(new Food("Posole", "Soups 1"));
        menu[4][3][2].add(new Food("Potato Cheese", "Soups 2"));
        menu[4][3][2].add(new Food("Fresh Fruit Salad", "Action Station"));
        menu[4][3][2].add(new Food("Korean Short Ribs w/ Rice", "Main Dish (Entrée)"));
        menu[4][3][2].add(new Food("Baked Manicotti w/ Pesto Sauce", "Vegetarian/Vegan (Entrée)"));
        menu[4][3][2].add(new Food("Miner Chicken Sandwich", "Grill"));
        menu[4][3][2].add(new Food("Carnitas Tacos w/ Rice", "Stir Fry Station"));

        //Friday
        //Breakfast
        menu[4][4][0].add(new Food("Grits", "Breakfast Bar"));
        menu[4][4][0].add(new Food("Chocolate Chip Pancakes", "Breakfast Bar"));
        menu[4][4][0].add(new Food("Bacon", "Breakfast Bar"));
        menu[4][4][0].add(new Food("Tater Tots", "Breakfast Bar"));

        //Lunch
        menu[4][4][1].add(new Food("Clam Chowder", "Soups 1"));
        menu[4][4][1].add(new Food("Minestroni", "Soups 2"));
        menu[4][4][1].add(new Food("Quinoa & Vegetable Grain Salad", "Action Station"));
        menu[4][4][1].add(new Food("Balsamic Salmon w/ Rice", "Main Dish (Entrée)"));
        menu[4][4][1].add(new Food("Falafel Taco", "Vegetarian/Vegan (Entrée)"));
        menu[4][4][1].add(new Food("Shredded Beef Taquitos w/ Guacamole", "Grill"));
        menu[4][4][1].add(new Food("Teriyaki Chicken w/ Rice", "Stir Fry Station"));

        //Dinner
        menu[4][4][2].add(new Food("Clam Chowder", "Soups 1"));
        menu[4][4][2].add(new Food("Minestroni", "Soups 2"));
        menu[4][4][2].add(new Food("Chinese Chicken Salad", "Action Station"));
        menu[4][4][2].add(new Food("Chicken Parmesan w/ Spaghetti", "Main Dish (Entrée)"));
        menu[4][4][2].add(new Food("Ramen Noodle Bowl", "Vegetarian/Vegan (Entrée)"));
        menu[4][4][2].add(new Food("Turkey Corn Dogs", "Grill"));
        menu[4][4][2].add(new Food("Beef Burrito Bowl", "Stir Fry Station"));

        //Saturday
        //Breakfast
        menu[4][5][0].add(new Food("Arroz Con Leche", "Breakfast Bar"));
        menu[4][5][0].add(new Food("French Toast", "Breakfast Bar"));
        menu[4][5][0].add(new Food("Kielbasa Sausage", "Breakfast Bar"));
        menu[4][5][0].add(new Food("Potatoes O’ Brien", "Breakfast Bar"));

        //Lunch
        menu[4][5][1].add(new Food("Italian Wedding", "Soups 1"));
        menu[4][5][1].add(new Food("Cream of Broccoli", "Soups 2"));
        menu[4][5][1].add(new Food("Smoothie Bar", "Action Station"));
        menu[4][5][1].add(new Food("Steak Picado w/ Rice & Beans", "Main Dish (Entrée)"));
        menu[4][5][1].add(new Food("Baked Tortellini w/ Tomato Sauce", "Vegetarian/Vegan (Entrée)"));
        menu[4][5][1].add(new Food("Omelet Bar", "Grill"));
        menu[4][5][1].add(new Food("Breakfast Quesadillas", "Stir Fry Station"));

        //Dinner
        menu[4][5][2].add(new Food("Italian Wedding", "Soups 1"));
        menu[4][5][2].add(new Food("Cream of Broccoli", "Soups 2"));
        menu[4][5][2].add(new Food("Turkey Club Wrap", "Action Station"));
        menu[4][5][2].add(new Food("Meat Lasagna w/ Breadstick", "Main Dish (Entrée)"));
        menu[4][5][2].add(new Food("Vegetable Lasagna w/ Breadstick", "Vegetarian/Vegan (Entrée)"));
        menu[4][5][2].add(new Food("Grilled Ham & Cheese Sandwich", "Grill"));
        menu[4][5][2].add(new Food("Shrimp Pad Thai w/ Noodles", "Stir Fry Station"));
        //End of cycle 5 ---------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------
    }


}
