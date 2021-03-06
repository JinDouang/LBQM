package com.lbqm.longbeachquickmenu.database;

import java.util.ArrayList;

public class DatabaseBeachsideMenu {

    private ArrayList<Food>[][][] menu = new ArrayList[5][7][3];

    public ArrayList<Food> getMenu(int cycle, int day, int time){
        return menu[cycle][day][time];
    }

    public int getFoodLength(int cycle, int day, int time) {
        return menu[cycle][day][time].size();
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
        menu[0][0][1].add(new Food("Broccoli Cheddar", "Soups 2"));
        menu[0][0][1].add(new Food("Caprese Salad", "The Bar (Entrée)"));
        menu[0][0][1].add(new Food("Chicken Fajita", "At Home (Entrée)"));
        menu[0][0][1].add(new Food("Tofu Fajita", "Vegetarian/Vegan (Entrée)"));
        menu[0][0][1].add(new Food("Hamburgers", "Grill"));
        menu[0][0][1].add(new Food("BBQ Chicken", "Pizza Station (Entrée)"));
        menu[0][0][1].add(new Food("Peach Cobler", "Sweets"));

        //Dinner
        menu[0][0][2].add(new Food("Chicken Noodle", "Soups 1"));
        menu[0][0][2].add(new Food("Broccoli Cheddar", "Soups 2"));
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
        menu[0][1][1].add(new Food("Italian Ravioli", "Soups 2"));
        menu[0][1][1].add(new Food("Chili Bar", "The Bar (Entrée)"));
        menu[0][1][1].add(new Food("BBQ Thai Chicken", "At Home (Entrée)"));
        menu[0][1][1].add(new Food("Vegetable Wellington", "Vegetarian/Vegan (Entrée)"));
        menu[0][1][1].add(new Food("Bell Pepper & Sausage Sandwich", "Grill"));
        menu[0][1][1].add(new Food("Veggie", "Pizza Station (Entrée)"));
        menu[0][1][1].add(new Food("Bread Pudding", "Sweets"));

        //Dinner
        menu[0][1][2].add(new Food("Sausage & Lentil", "Soups 1"));
        menu[0][1][2].add(new Food("Italian Ravioli", "Soups 2"));
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
        menu[0][2][1].add(new Food("Corn Chowder", "Soups 2"));
        menu[0][2][1].add(new Food("Greek Salad", "The Bar (Entrée)"));
        menu[0][2][1].add(new Food("Chicken Parmesan", "At Home (Entrée)"));
        menu[0][2][1].add(new Food("Gardein Chicken Fajitas", "Vegetarian/Vegan (Entrée)"));
        menu[0][2][1].add(new Food("Taco Station", "Grill"));
        menu[0][2][1].add(new Food("Hawaiian", "Pizza Station (Entrée)"));
        menu[0][2][1].add(new Food("Lemon Cake", "Sweets"));

        //Dinner
        menu[0][2][2].add(new Food("Beef & Potato", "Soups 1"));
        menu[0][2][2].add(new Food("Corn Chowder", "Soups 2"));
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
        menu[0][3][1].add(new Food("Butternut Squash", "Soups 2"));
        menu[0][3][1].add(new Food("Chopped Salad", "The Bar (Entrée)"));
        menu[0][3][1].add(new Food("Pasta Station", "At Home (Entrée)"));
        menu[0][3][1].add(new Food("BBQ Tofu Steak", "Vegetarian/Vegan (Entrée)"));
        menu[0][3][1].add(new Food("Bahn Mi Sandwich", "Grill"));
        menu[0][3][1].add(new Food("Pepperoni w/ Jalapeño", "Pizza Station (Entrée)"));
        menu[0][3][1].add(new Food("Red Velvet Cup Cake", "Sweets"));

        //Dinner
        menu[0][3][2].add(new Food("Chicken Noodle", "Soups 1"));
        menu[0][3][2].add(new Food("Butternut Squash", "Soups 2"));
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
        menu[0][4][1].add(new Food("Vegetable Noodle", "Soups 2"));
        menu[0][4][1].add(new Food("Santé Fe Salad", "The Bar (Entrée)"));
        menu[0][4][1].add(new Food("Cajun Chicken", "At Home (Entrée)"));
        menu[0][4][1].add(new Food("Edamame Fried Rice w/ Pot Stickers", "Vegetarian/Vegan (Entrée)"));
        menu[0][4][1].add(new Food("Shredded Corned Beef Sandwich", "Grill"));
        menu[0][4][1].add(new Food("Combo", "Pizza Station (Entrée)"));
        menu[0][4][1].add(new Food("German Chocolate Cake", "Sweets"));

        //Dinner
        menu[0][4][2].add(new Food("Clam Chowder", "Soups 1"));
        menu[0][4][2].add(new Food("Vegetable Noodle", "Soups 2"));
        menu[0][4][2].add(new Food("Chili Bar", "The Bar (Entrée)"));
        menu[0][4][2].add(new Food("Pan Seared Scallops w/ Pasta", "At Home (Entrée)"));
        menu[0][4][2].add(new Food("Gardien Stir Fry Beef", "Vegetarian/Vegan (Entrée)"));
        menu[0][4][2].add(new Food("Pulled BBQ Salmon Sandwich", "Grill"));
        menu[0][4][2].add(new Food("Combo", "Pizza Station (Entrée)"));
        menu[0][4][2].add(new Food("Lucky Charm Cupcake", "Sweets"));

        //Saturday
        //Breakfast
        menu[0][5][0].add(new Food("Cream of Wheat", "Breakfast Bar"));
        menu[0][5][0].add(new Food("Chocolate Chip Pancakes", "Breakfast Bar"));
        menu[0][5][0].add(new Food("Sausage Patty", "Breakfast Bar"));
        menu[0][5][0].add(new Food("Potatoes O’ Brien", "Breakfast Bar"));

        //Lunch
        menu[0][5][1].add(new Food("Beef Barley", "Soups 1"));
        menu[0][5][1].add(new Food("Tomato Basil", "Soups 2"));
        menu[0][5][1].add(new Food("Chicken Taquitos", "At Home (Entrée)"));
        menu[0][5][1].add(new Food("Smoothie Bar ", "Vegetarian/Vegan (Entrée)"));

        //Dinner
        menu[0][5][2].add(new Food("Beef Barley", "Soups 1"));
        menu[0][5][2].add(new Food("Tomato Basil", "Soups 2"));
        menu[0][5][2].add(new Food("Greek Salad", "The Bar (Entrée)"));
        menu[0][5][2].add(new Food("BBQ Meatloaf", "At Home (Entrée)"));
        menu[0][5][2].add(new Food("Broccoli Feta Rice", "Vegetarian/Vegan (Entrée)"));
        menu[0][5][2].add(new Food("PepperJack Chicken Sandwich", "Grill"));
        menu[0][5][2].add(new Food("BBQ Chicken", "Pizza Station (Entrée)"));

        //Sunday
        //Breakfast
        menu[0][6][0].add(new Food("Cream of Rice", "Breakfast Bar"));
        menu[0][6][0].add(new Food("Texas French Toast", "Breakfast Bar"));
        menu[0][6][0].add(new Food("Kielbasa Sausage", "Breakfast Bar"));
        menu[0][6][0].add(new Food("Cottage Fries", "Breakfast Bar"));

        //Lunch
        menu[0][6][1].add(new Food("Chicken Rice", "Soups 1"));
        menu[0][6][1].add(new Food("Potato Chowder", "Soups 2"));
        menu[0][6][1].add(new Food("Garlic & Herb Roast Beef", "At Home (Entrée)"));
        menu[0][6][1].add(new Food("Smoothie Bar", "Vegetarian/Vegan (Entrée)"));

        //Dinner
        menu[0][6][2].add(new Food("Chicken Rice", "Soups 1"));
        menu[0][6][2].add(new Food("Potato Chowder", "Soups 2"));
        menu[0][6][2].add(new Food("Chopped Salad", "The Bar (Entrée)"));
        menu[0][6][2].add(new Food("Meat Lasagna", "At Home (Entrée)"));
        menu[0][6][2].add(new Food("Vegetable Lasagna", "Vegetarian/Vegan (Entrée)"));
        menu[0][6][2].add(new Food("Patty Melt", "Grill"));
        menu[0][6][2].add(new Food("Combo", "Pizza Station (Entrée)"));
        //End of Cycle 1

        //Cycle 2
        //Monday
        //Breakfast
        menu[1][0][0].add(new Food("Cream of Rice", "Breakfast Bar"));
        menu[1][0][0].add(new Food("Chocolate Chip Pancakes", "Breakfast Bar"));
        menu[1][0][0].add(new Food("Grilled Ham", "Breakfast Bar"));
        menu[1][0][0].add(new Food("Cottage Fries", "Breakfast Bar"));

        //Lunch
        menu[1][0][1].add(new Food("Split Pea", "Soups 1"));
        menu[1][0][1].add(new Food("Vegetable", "Soups 2"));
        menu[1][0][1].add(new Food("Southwestern Black Bean Salad", "The Bar (Entrée)"));
        menu[1][0][1].add(new Food("Beef Stroganoff", "At Home (Entrée)"));
        menu[1][0][1].add(new Food("Gardein Beef Stroganoff", "Vegetarian/Vegan (Entrée)"));
        menu[1][0][1].add(new Food("Ortega Chicken Sandwich", "Grill"));
        menu[1][0][1].add(new Food("Mexican", "Pizza Station (Entrée)"));
        menu[1][0][1].add(new Food("Chocolate Cake", "Sweets"));

        //Dinner
        menu[1][0][2].add(new Food("Split Pea", "Soups 1"));
        menu[1][0][2].add(new Food("Vegetable", "Soups 2"));
        menu[1][0][2].add(new Food("Apple Walnut Salad", "The Bar (Entrée)"));
        menu[1][0][2].add(new Food("BBQ Chicken", "At Home (Entrée)"));
        menu[1][0][2].add(new Food("Cheese Tortellini Florentine", "Vegetarian/Vegan (Entrée)"));
        menu[1][0][2].add(new Food("French Onion Beef Burger", "Grill"));
        menu[1][0][2].add(new Food("Mexican", "Pizza Station (Entrée)"));
        menu[1][0][2].add(new Food("Pumpkin Pie", "Sweets"));

        //Tuesday
        //Breakfast
        menu[1][1][0].add(new Food("Grits", "Breakfast Bar"));
        menu[1][1][0].add(new Food("Chilaquiles", "Breakfast Bar"));
        menu[1][1][0].add(new Food("Carne Asada ", "Breakfast Bar"));
        menu[1][1][0].add(new Food("Hash Brown", "Breakfast Bar"));

        //Lunch
        menu[1][1][1].add(new Food("Chicken Tortilla", "Soups 1"));
        menu[1][1][1].add(new Food("Potato Chowder", "Soups 2"));
        menu[1][1][1].add(new Food("Carrot & Raisin", "The Bar (Entrée)"));
        menu[1][1][1].add(new Food("Tamales", "At Home (Entrée)"));
        menu[1][1][1].add(new Food("Pasta Pomodoro", "Vegetarian/Vegan (Entrée)"));
        menu[1][1][1].add(new Food("Chicken Teriyaki Bowl ", "Grill"));
        menu[1][1][1].add(new Food("Buffalo Chicken", "Pizza Station (Entrée)"));
        menu[1][1][1].add(new Food("Oreo Brownie Bar", "Sweets"));

        //Dinner
        menu[1][1][2].add(new Food("Chicken Tortilla", "Soups 1"));
        menu[1][1][2].add(new Food("Potato Chowder", "Soups 2"));
        menu[1][1][2].add(new Food("Sugar Baked Yam B", "The Bar (Entrée)"));
        menu[1][1][2].add(new Food("Flat Iron Steak", "At Home (Entrée)"));
        menu[1][1][2].add(new Food("Santa Fe Veggie Quesadillas", "Vegetarian/Vegan (Entrée)"));
        menu[1][1][2].add(new Food("Chipotle Ranch Chicken Sandwich", "Grill"));
        menu[1][1][2].add(new Food("Buffalo Chicken", "Pizza Station (Entrée)"));
        menu[1][1][2].add(new Food("Oreo Brownie Pie", "Sweets"));

        //Wednesday
        //Breakfast
        menu[1][2][0].add(new Food("Sweet Rice w/ Milk", "Breakfast Bar"));
        menu[1][2][0].add(new Food("Breakfast Burrito", "Breakfast Bar"));
        menu[1][2][0].add(new Food("Kielbasa", "Breakfast Bar"));
        menu[1][2][0].add(new Food("Country Potatoes", "Breakfast Bar"));

        //Lunch
        menu[1][2][1].add(new Food("Chicken Noodle", "Soups 1"));
        menu[1][2][1].add(new Food("French Onion", "Soups 2"));
        menu[1][2][1].add(new Food("BLT Pasta Salad", "The Bar (Entrée)"));
        menu[1][2][1].add(new Food("Orange Chicken Bowl", "At Home (Entrée)"));
        menu[1][2][1].add(new Food("Vegetable Noodles", "Vegetarian/Vegan (Entrée)"));
        menu[1][2][1].add(new Food("Frisco Burger", "Grill"));
        menu[1][2][1].add(new Food("Margarita", "Pizza Station (Entrée)"));
        menu[1][2][1].add(new Food("Carrot Cake", "Sweets"));

        //Dinner
        menu[1][2][2].add(new Food("Chicken Noodle", "Soups 1"));
        menu[1][2][2].add(new Food("French Onion", "Soups 2"));
        menu[1][2][2].add(new Food("BBQ Chicken Salad", "The Bar (Entrée)"));
        menu[1][2][2].add(new Food("Chicken & Spinach Au Gratin", "At Home (Entrée)"));
        menu[1][2][2].add(new Food("Vegetable Empanada", "Vegetarian/Vegan (Entrée)"));
        menu[1][2][2].add(new Food("Sloppy Joe", "Grill"));
        menu[1][2][2].add(new Food("Margarita", "Pizza Station (Entrée)"));
        menu[1][2][2].add(new Food("Apple Pie", "Sweets"));

        //Thursday
        //Breakfast
        menu[1][3][0].add(new Food("Cream of Wheat", "Breakfast Bar"));
        menu[1][3][0].add(new Food("French Toast", "Breakfast Bar"));
        menu[1][3][0].add(new Food("Spam", "Breakfast Bar"));
        menu[1][3][0].add(new Food("Tater Tots", "Breakfast Bar"));

        //Lunch
        menu[1][3][1].add(new Food("Italian Wedding", "Soups 1"));
        menu[1][3][1].add(new Food("Tomato Basil", "Soups 2"));
        menu[1][3][1].add(new Food("Apple Walnut Salad", "The Bar (Entrée)"));
        menu[1][3][1].add(new Food("Spicy Pork Chops", "At Home (Entrée)"));
        menu[1][3][1].add(new Food("Vegetable Tempura", "Vegetarian/Vegan (Entrée)"));
        menu[1][3][1].add(new Food("Reuben Sandwich", "Grill"));
        menu[1][3][1].add(new Food("Carne Asada", "Pizza Station (Entrée)"));
        menu[1][3][1].add(new Food("Oatmeal Fruit Bar", "Sweets"));

        //Dinner
        menu[1][3][2].add(new Food("Italian Wedding", "Soups 1"));
        menu[1][3][2].add(new Food("Tomato Basil", "Soups 2"));
        menu[1][3][2].add(new Food("Roast Beef, Onion, & White Cheddar Wrap", "The Bar (Entrée)"));
        menu[1][3][2].add(new Food("Chicken Adobo", "At Home (Entrée)"));
        menu[1][3][2].add(new Food("Tomato, Eggplant, & Potato Stew", "Vegetarian/Vegan (Entrée)"));
        menu[1][3][2].add(new Food("Chicken Shawarma", "Grill"));
        menu[1][3][2].add(new Food("Carne Asada", "Pizza Station (Entrée)"));
        menu[1][3][2].add(new Food("Oatmeal Fruit Bar", "Sweets"));

        //Friday
        //Breakfast
        menu[1][4][0].add(new Food("Cinnamon Rice", "Breakfast Bar"));
        menu[1][4][0].add(new Food("Egg, Ham, & Cheese Croissant", "Breakfast Bar"));
        menu[1][4][0].add(new Food("Bacon ", "Breakfast Bar"));
        menu[1][4][0].add(new Food("Hash Brown Patty", "Breakfast Bar"));

        //Lunch
        menu[1][4][1].add(new Food("Clam Chowder", "Soups 1"));
        menu[1][4][1].add(new Food("Black Bean", "Soups 1"));
        menu[1][4][1].add(new Food("Citrus Kale", "The Bar (Entrée)"));
        menu[1][4][1].add(new Food("Chicken Tenders", "At Home (Entrée)"));
        menu[1][4][1].add(new Food("Mac-&-Cheese", "Vegetarian/Vegan (Entrée)"));
        menu[1][4][1].add(new Food("California Turkey Sandwich", "Grill"));
        menu[1][4][1].add(new Food("Meat Lovers", "Pizza Station (Entrée)"));
        menu[1][4][1].add(new Food("Strawberry Cheese Cake", "Sweets"));

        //Dinner
        menu[1][4][2].add(new Food("Clam Chowder", "Soups 1"));
        menu[1][4][2].add(new Food("Black Bean", "Soups 2"));
        menu[1][4][2].add(new Food("Potato Bar", "The Bar (Entrée)"));
        menu[1][4][2].add(new Food("Chicken Florentine", "At Home (Entrée)"));
        menu[1][4][2].add(new Food("Ravioli Pomodoro", "Vegetarian/Vegan (Entrée)"));
        menu[1][4][2].add(new Food("Fish Sandwich", "Grill"));
        menu[1][4][2].add(new Food("Meat Lovers", "Pizza Station (Entrée)"));
        menu[1][4][2].add(new Food("Fruit Loop Krispy", "Sweets"));

        //Saturday
        //Breakfast
        menu[1][5][0].add(new Food("Cream of Wheat", "Breakfast Bar"));
        menu[1][5][0].add(new Food("Cinnamon Rolls", "Breakfast Bar"));
        menu[1][5][0].add(new Food("Sausage Links", "Breakfast Bar"));
        menu[1][5][0].add(new Food("Roasted Herb Potatoes", "Breakfast Bar"));

        //Lunch
        menu[1][5][1].add(new Food("Sausage & Kale", "Soups 1"));
        menu[1][5][1].add(new Food("Garden Vegetable", "Soups 1"));
        menu[1][5][1].add(new Food("Asian Cole Slaw ", "The Bar (Entrée)"));
        menu[1][5][1].add(new Food("Chicken Ranchero ", "At Home (Entrée)"));
        menu[1][5][1].add(new Food("Bowtie Pasta Primavera", "Vegetarian/Vegan (Entrée)"));
        menu[1][5][1].add(new Food("Combo", "Pizza Station (Entrée)"));

        //Dinner
        menu[1][5][2].add(new Food("Sausage & Kale", "Soups 1"));
        menu[1][5][2].add(new Food("Garden Vegetable", "Soups 2"));
        menu[1][5][2].add(new Food("Pasta Bar", "The Bar (Entrée)"));
        menu[1][5][2].add(new Food("Beef Fajitas", "At Home (Entrée)"));
        menu[1][5][2].add(new Food("Gardein Chicken Fajitas ", "Vegetarian/Vegan (Entrée)"));
        menu[1][5][2].add(new Food("Pastrami on French Roll", "Grill"));
        menu[1][5][2].add(new Food("Pesto Chicken", "Pizza Station (Entrée)"));

        //Sunday
        //Breakfast
        menu[1][6][0].add(new Food("Cream of Rice", "Breakfast Bar"));
        menu[1][6][0].add(new Food("Pancakes", "Breakfast Bar"));
        menu[1][6][0].add(new Food("Little Smokies", "Breakfast Bar"));
        menu[1][6][0].add(new Food("Hash Brown", "Breakfast Bar"));

        //Lunch
        menu[1][6][1].add(new Food("Beef & Rice", "Soups 1"));
        menu[1][6][1].add(new Food("Cream of Broccoli", "Soups 2"));
        menu[1][6][1].add(new Food("Cucumber Tomato", "The Bar (Entrée)"));
        menu[1][6][1].add(new Food("Swedish Meatballs w/ Noodles", "At Home (Entrée)"));
        menu[1][6][1].add(new Food("Vegetable Lasagna", "Vegetarian/Vegan (Entrée)"));
        menu[1][6][1].add(new Food("Pico de Fruta", "Pizza Station (Entrée)"));

        //Dinner
        menu[1][6][2].add(new Food("Beef & Rice", "Soups 1"));
        menu[1][6][2].add(new Food("Cream of Broccoli", "Soups 2"));
        menu[1][6][2].add(new Food("Cobb Salad", "The Bar (Entrée)"));
        menu[1][6][2].add(new Food("Fried Chicken", "At Home (Entrée)"));
        menu[1][6][2].add(new Food("Mac-&-Cheese", "Vegetarian/Vegan (Entrée)"));
        menu[1][6][2].add(new Food("BBQ Pulled Pork Sandwich\n", "Grill"));
        menu[1][6][2].add(new Food("Veggie", "Pizza Station (Entrée)"));

        //Cycle 3
        //Monday
        //Breakfast
        menu[2][0][0].add(new Food("Cream of Rice", "Breakfast Bar"));
        menu[2][0][0].add(new Food("Texas French Toast", "Breakfast Bar"));
        menu[2][0][0].add(new Food("Grilled Ham", "Breakfast Bar"));
        menu[2][0][0].add(new Food("Cottage Fries", "Breakfast Bar"));

        //Lunch
        menu[2][0][1].add(new Food("Chicken Tortilla", "Soups 1"));
        menu[2][0][1].add(new Food("Cream of Broccoli", "Soups 2"));
        menu[2][0][1].add(new Food("Grilled Vegetable Wrap", "The Bar (Entrée)"));
        menu[2][0][1].add(new Food("Teriyaki Chicken", "At Home (Entrée)"));
        menu[2][0][1].add(new Food("Vegetable Yakisoba Bowl", "Vegetarian/Vegan (Entrée)"));
        menu[2][0][1].add(new Food("BLT", "Grill"));
        menu[2][0][1].add(new Food("Combo", "Pizza Station (Entrée)"));
        menu[2][0][1].add(new Food("M&M Bar ", "Sweets"));

        //Dinner
        menu[2][0][2].add(new Food("Chicken Tortilla", "Soups 1"));
        menu[2][0][2].add(new Food("Cream of Broccoli", "Soups 2"));
        menu[2][0][2].add(new Food("South West Caesar Salad", "The Bar (Entrée)"));
        menu[2][0][2].add(new Food("Meat/Vegetable Lasagna", "At Home (Entrée)"));
        menu[2][0][2].add(new Food("Cauliflower & Potato Stew ", "Vegetarian/Vegan (Entrée)"));
        menu[2][0][2].add(new Food("Turkey Burger", "Grill"));
        menu[2][0][2].add(new Food("Combo", "Pizza Station (Entrée)"));
        menu[2][0][2].add(new Food("M&M Bar ", "Sweets"));

        //Tuesday
        //Breakfast
        menu[2][1][0].add(new Food("Grits", "Breakfast Bar"));
        menu[2][1][0].add(new Food("Biscuit Sandwich", "Breakfast Bar"));
        menu[2][1][0].add(new Food("Bacon", "Breakfast Bar"));
        menu[2][1][0].add(new Food("Hash Brown", "Breakfast Bar"));

        //Lunch
        menu[2][1][1].add(new Food("Potato & Bacon", "Soups 1"));
        menu[2][1][1].add(new Food("Miso Soup", "Soups 2"));
        menu[2][1][1].add(new Food("Crispy Chicken Bacon Wrap", "The Bar (Entrée)"));
        menu[2][1][1].add(new Food("Korean Bowl", "At Home (Entrée)"));
        menu[2][1][1].add(new Food("Spinach & Cheese Tortellini", "Vegetarian/Vegan (Entrée)"));
        menu[2][1][1].add(new Food("Reuben Sandwich", "Grill"));
        menu[2][1][1].add(new Food("Pastrami", "Pizza Station (Entrée)"));
        menu[2][1][1].add(new Food("Boston Cream Pie ", "Sweets"));

        //Dinner
        menu[2][1][2].add(new Food("Potato & Bacon", "Soups 1"));
        menu[2][1][2].add(new Food("Miso Soup", "Soups 2"));
        menu[2][1][2].add(new Food("Apple Walnut Salad ", "The Bar (Entrée)"));
        menu[2][1][2].add(new Food("Shepherd’s Pie", "At Home (Entrée)"));
        menu[2][1][2].add(new Food("Mushroom Stroganoff", "Vegetarian/Vegan (Entrée)"));
        menu[2][1][2].add(new Food("Grilled Ham & Cheese", "Grill"));
        menu[2][1][2].add(new Food("Pastrami", "Pizza Station (Entrée)"));
        menu[2][1][2].add(new Food("Boston Cream Pie ", "Sweets"));

        //Wednesday
        //Breakfast
        menu[2][2][0].add(new Food("Sweet Rice w/ Milk", "Breakfast Bar"));
        menu[2][2][0].add(new Food("Chocolate Pancakes", "Breakfast Bar"));
        menu[2][2][0].add(new Food("Corned Beef Hash", "Breakfast Bar"));
        menu[2][2][0].add(new Food("Country Potatoes", "Breakfast Bar"));

        //Lunch
        menu[2][2][1].add(new Food("Albondigas", "Soups 1"));
        menu[2][2][1].add(new Food("Italian Ravioli", "Soups 2"));
        menu[2][2][1].add(new Food("Beef Taco Salad", "The Bar (Entrée)"));
        menu[2][2][1].add(new Food("Chicken and Biscuits", "At Home (Entrée)"));
        menu[2][2][1].add(new Food("Beef Gardein Stir Fry", "Vegetarian/Vegan (Entrée)"));
        menu[2][2][1].add(new Food("Tortas", "Grill"));
        menu[2][2][1].add(new Food("Buffalo Chicken", "Pizza Station (Entrée)"));
        menu[2][2][1].add(new Food("Brownies", "Sweets"));

        //Dinner
        menu[2][2][2].add(new Food("Albondigas", "Soups 1"));
        menu[2][2][2].add(new Food("Italian Ravioli", "Soups 2"));
        menu[2][2][2].add(new Food("Chinese Chicken Salad", "The Bar (Entrée)"));
        menu[2][2][2].add(new Food("Mediterranean Chicken", "At Home (Entrée)"));
        menu[2][2][2].add(new Food("Gardein Beef", "Vegetarian/Vegan (Entrée)"));
        menu[2][2][2].add(new Food("Pesto Turkey Flat Bread", "Grill"));
        menu[2][2][2].add(new Food("Buffalo Chicken", "Pizza Station (Entrée)"));
        menu[2][2][2].add(new Food("Carrot Cake", "Sweets"));

        //Thursday
        //Breakfast
        menu[2][3][0].add(new Food("Cream of Wheat", "Breakfast Bar"));
        menu[2][3][0].add(new Food("Biscuits & Gravy", "Breakfast Bar"));
        menu[2][3][0].add(new Food("Kielbasa ", "Breakfast Bar"));
        menu[2][3][0].add(new Food("Tater Tots", "Breakfast Bar"));

        //Lunch
        menu[2][3][1].add(new Food("Pozole", "Soups 1"));
        menu[2][3][1].add(new Food("Potato Chowder", "Soups 2"));
        menu[2][3][1].add(new Food("BBQ Chicken Wrap", "The Bar (Entrée)"));
        menu[2][3][1].add(new Food("Asian Shrimp Pasta", "At Home (Entrée)"));
        menu[2][3][1].add(new Food("Moroccan Lentil", "Vegetarian/Vegan (Entrée)"));
        menu[2][3][1].add(new Food("Turkey Club Sandwich", "Grill"));
        menu[2][3][1].add(new Food("Italian Sausage", "Pizza Station (Entrée)"));
        menu[2][3][1].add(new Food("Pumpkin Pie", "Sweets"));

        //Dinner
        menu[2][3][2].add(new Food("Pozole", "Soups 1"));
        menu[2][3][2].add(new Food("Potato Chowder ", "Soups 2"));
        menu[2][3][2].add(new Food("Assorted Humas w/ Pita Chips", "The Bar (Entrée)"));
        menu[2][3][2].add(new Food("Spicy BBQ Chicken", "At Home (Entrée)"));
        menu[2][3][2].add(new Food("Pasta Jambalaya", "Vegetarian/Vegan (Entrée)"));
        menu[2][3][2].add(new Food("Burrito Al Pastor", "Grill"));
        menu[2][3][2].add(new Food("Italian Sausage", "Pizza Station (Entrée)"));
        menu[2][3][2].add(new Food("Pumpkin Pie", "Sweets"));

        //Friday
        //Breakfast
        menu[2][4][0].add(new Food("Cinnamon Rice", "Breakfast Bar"));
        menu[2][4][0].add(new Food("Breakfast Burrito", "Breakfast Bar"));
        menu[2][4][0].add(new Food("Lil Smokies", "Breakfast Bar"));
        menu[2][4][0].add(new Food("Potatoes O’ Brien", "Breakfast Bar"));

        //Lunch
        menu[2][4][1].add(new Food("Clam Chowder", "Soups 1"));
        menu[2][4][1].add(new Food("Minestrone", "Soups 2"));
        menu[2][4][1].add(new Food("Chicken Caesar", "The Bar (Entrée)"));
        menu[2][4][1].add(new Food("Seafood Platter", "At Home (Entrée)"));
        menu[2][4][1].add(new Food("Roasted Cauliflower Bowl", "Vegetarian/Vegan (Entrée)"));
        menu[2][4][1].add(new Food("Taquitos", "Grill"));
        menu[2][4][1].add(new Food("Hawaiian", "Pizza Station (Entrée)"));
        menu[2][4][1].add(new Food("Pound Cake", "Sweets"));

        //Dinner
        menu[2][4][2].add(new Food("Clam Chowder", "Soups 1"));
        menu[2][4][2].add(new Food("Minestrone", "Soups 2"));
        menu[2][4][2].add(new Food("Greek Salad", "The Bar (Entrée)"));
        menu[2][4][2].add(new Food("Chicken Fried Steak (Beef)", "At Home (Entrée)"));
        menu[2][4][2].add(new Food("Curry Garbanzo Vegetable Stew", "Vegetarian/Vegan (Entrée)"));
        menu[2][4][2].add(new Food("Hawaiian BBQ Pull Pork Sandwich", "Grill"));
        menu[2][4][2].add(new Food("Hawaiian", "Pizza Station (Entrée)"));
        menu[2][4][2].add(new Food("Pound Cake", "Sweets"));

        //Saturday
        //Breakfast
        menu[2][5][0].add(new Food("Cream of Wheat", "Breakfast Bar"));
        menu[2][5][0].add(new Food("Waffle Bar", "Breakfast Bar"));
        menu[2][5][0].add(new Food("Sausage Links ", "Breakfast Bar"));
        menu[2][5][0].add(new Food("Hash Brown Patty", "Breakfast Bar"));

        //Lunch
        menu[2][5][1].add(new Food("Vegetable Beef", "Soups 1"));
        menu[2][5][1].add(new Food("Corn Chowder", "Soups 2"));
        menu[2][5][1].add(new Food("Roasted Pork Loin", "At Home (Entrée)"));
        menu[2][5][1].add(new Food("Tortellini Florentine", "Vegetarian/Vegan (Entrée)"));

        //Dinner
        menu[2][5][2].add(new Food("Vegetable Beef", "Soups 1"));
        menu[2][5][2].add(new Food("Corn Chowder", "Soups 2"));
        menu[2][5][2].add(new Food("Chopped Salad", "The Bar (Entrée)"));
        menu[2][5][2].add(new Food("Chicken Bacon Alfredo Pasta", "At Home (Entrée)"));
        menu[2][5][2].add(new Food("Vegetable Pad Thai", "Vegetarian/Vegan (Entrée)"));
        menu[2][5][2].add(new Food("Philly Steak", "Grill"));
        menu[2][5][2].add(new Food("Combo", "Pizza Station (Entrée)"));

        //Sunday
        //Breakfast
        menu[2][6][0].add(new Food("Cream of Rice", "Breakfast Bar"));
        menu[2][6][0].add(new Food("Cinnamon Rolls ", "Breakfast Bar"));
        menu[2][6][0].add(new Food("Sausage Patty", "Breakfast Bar"));
        menu[2][6][0].add(new Food("Hash Brown", "Breakfast Bar"));

        //Lunch
        menu[2][6][1].add(new Food("Chicken Gumbo", "Soups 1"));
        menu[2][6][1].add(new Food("Vegetable", "Soups 2"));
        menu[2][6][1].add(new Food("Chicken Tamale", "At Home (Entrée)"));
        menu[2][6][1].add(new Food("Cheese Tamale", "Vegetarian/Vegan (Entrée)"));

        //Dinner
        menu[2][6][2].add(new Food("Chicken Gumbo", "Soups 1"));
        menu[2][6][2].add(new Food("Vegetable", "Soups 2"));
        menu[2][6][2].add(new Food("Baked Potato", "The Bar (Entrée)"));
        menu[2][6][2].add(new Food("Beef Ravioli", "At Home (Entrée)"));
        menu[2][6][2].add(new Food("Cheese Raviolli", "Vegetarian/Vegan (Entrée)"));
        menu[2][6][2].add(new Food("Spicy Ranch Chicken Sandwich", "Grill"));
        menu[2][6][2].add(new Food("Sausage & Pepper", "Pizza Station (Entrée)"));

        //Cycle 4
        //Monday
        //Breakfast
        menu[3][0][0].add(new Food("Cream of Rice", "Breakfast Bar"));
        menu[3][0][0].add(new Food("French Toast", "Breakfast Bar"));
        menu[3][0][0].add(new Food("Kielbasa Sausage", "Breakfast Bar"));
        menu[3][0][0].add(new Food("Country Potatoes", "Breakfast Bar"));

        //Lunnh
        menu[3][0][1].add(new Food("Beef Noodle", "Soups 1"));
        menu[3][0][1].add(new Food("Butternut Squash Soup", "Soups 2"));
        menu[3][0][1].add(new Food("Italian Pasta Salad", "The Bar (Entrée)"));
        menu[3][0][1].add(new Food("Lemon Chicken", "At Home (Entrée)"));
        menu[3][0][1].add(new Food("Veggie Noodles", "Vegetarian/Vegan (Entrée)"));
        menu[3][0][1].add(new Food("Grilled Californian Turkey Club", "Grill"));
        menu[3][0][1].add(new Food("Mexican Chorizo", "Pizza Station (Entrée)"));
        menu[3][0][1].add(new Food("Chocolate Brownie", "Sweets"));

        //Dinner
        menu[3][0][2].add(new Food("Beef Noodle", "Soups 1"));
        menu[3][0][2].add(new Food("Butternut Squash Soup", "Soups 2"));
        menu[3][0][2].add(new Food("Caprese Salad", "The Bar (Entrée)"));
        menu[3][0][2].add(new Food("Garlic & Herb Flank Steak", "At Home (Entrée)"));
        menu[3][0][2].add(new Food("Cheese Tortellini Au Gratin", "Vegetarian/Vegan (Entrée)"));
        menu[3][0][2].add(new Food("Chicken/Cheese Quesadilla", "Grill"));
        menu[3][0][2].add(new Food("Mexican Chorizo", "Pizza Station (Entrée)"));
        menu[3][0][2].add(new Food("Chocolate Brownie", "Sweets"));

        //Tuesday
        //Breakfast
        menu[3][1][0].add(new Food("Grits", "Breakfast Bar"));
        menu[3][1][0].add(new Food("Chocolate Chip Pancakes", "Breakfast Bar"));
        menu[3][1][0].add(new Food("Bacon", "Breakfast Bar"));
        menu[3][1][0].add(new Food("Hash Brown", "Breakfast Bar"));

        //Lunnh
        menu[3][1][1].add(new Food("Chicken Tortilla", "Soups 1"));
        menu[3][1][1].add(new Food("Tomato Basil Soup ", "Soups 2"));
        menu[3][1][1].add(new Food("Ceasar Salad", "The Bar (Entrée)"));
        menu[3][1][1].add(new Food("Spaghetti & Sausage", "At Home (Entrée)"));
        menu[3][1][1].add(new Food("Gardein Beef & Chicken Fajita", "Vegetarian/Vegan (Entrée)"));
        menu[3][1][1].add(new Food("Chicken Tenders", "Grill"));
        menu[3][1][1].add(new Food("Buffalo Chicken", "Pizza Station (Entrée)"));
        menu[3][1][1].add(new Food("Zucchini Bread", "Sweets"));

        //Dinner
        menu[3][1][2].add(new Food("Chicken Tortilla", "Soups 1"));
        menu[3][1][2].add(new Food("Tomato Basil Soup ", "Soups 2"));
        menu[3][1][2].add(new Food("Sushi Bar", "The Bar (Entrée)"));
        menu[3][1][2].add(new Food("Wing & Things", "At Home (Entrée)"));
        menu[3][1][2].add(new Food("Potato & Cauliflower Curry", "Vegetarian/Vegan (Entrée)"));
        menu[3][1][2].add(new Food("Hot Dogs", "Grill"));
        menu[3][1][2].add(new Food("Buffalo Chicken", "Pizza Station (Entrée)"));
        menu[3][1][2].add(new Food("Rice Krispy", "Sweets"));

        //Wednesday
        //Breakfast
        menu[3][2][0].add(new Food("Sweet Rice w/ Milk", "Breakfast Bar"));
        menu[3][2][0].add(new Food("Huevos Rancheros", "Breakfast Bar"));
        menu[3][2][0].add(new Food("Carne Asada ", "Breakfast Bar"));
        menu[3][2][0].add(new Food("Cottage Fries", "Breakfast Bar"));

        //Lunch
        menu[3][2][1].add(new Food("Italian Wedding", "Soups 1"));
        menu[3][2][1].add(new Food("Creamy Potato", "Soups 2"));
        menu[3][2][1].add(new Food("Pho Bar", "The Bar (Entrée)"));
        menu[3][2][1].add(new Food("5 Spice Thai Pork", "At Home (Entrée)"));
        menu[3][2][1].add(new Food("Eggplant Parmesan", "Vegetarian/Vegan (Entrée)"));
        menu[3][2][1].add(new Food("Burrito Station", "Grill"));
        menu[3][2][1].add(new Food("Sausage Calzon", "Pizza Station (Entrée)"));
        menu[3][2][1].add(new Food("Coconut Cream Pie", "Sweets"));

        //Dinner
        menu[3][2][2].add(new Food("Italian Wedding", "Soups 1"));
        menu[3][2][2].add(new Food("Creamy Potato", "Soups 2"));
        menu[3][2][2].add(new Food("Cajun Chicken Wrap", "The Bar (Entrée)"));
        menu[3][2][2].add(new Food("Carne Con Chile Rojo C", "At Home (Entrée)"));
        menu[3][2][2].add(new Food("Pasta & Vegetable Alfredo", "Vegetarian/Vegan (Entrée)"));
        menu[3][2][2].add(new Food("Onion Burger", "Grill"));
        menu[3][2][2].add(new Food("Chicken Empanada", "Pizza Station (Entrée)"));
        menu[3][2][2].add(new Food("Coconut Cream Pie", "Sweets"));

        //Thursday
        //Breakfast
        menu[3][3][0].add(new Food("Cream of Wheat", "Breakfast Bar"));
        menu[3][3][0].add(new Food("Cinnamon Rolls ", "Breakfast Bar"));
        menu[3][3][0].add(new Food("Sausage Patty", "Breakfast Bar"));
        menu[3][3][0].add(new Food("Tater Tots", "Breakfast Bar"));

        //Lunch
        menu[3][3][1].add(new Food("Caldo De Res", "Soups 1"));
        menu[3][3][1].add(new Food("Corn Chowder", "Soups 2"));
        menu[3][3][1].add(new Food("Nacho Bar", "The Bar (Entrée)"));
        menu[3][3][1].add(new Food("Chicken Teriyaki", "At Home (Entrée)"));
        menu[3][3][1].add(new Food("Vegetable Quiche", "Vegetarian/Vegan (Entrée)"));
        menu[3][3][1].add(new Food("Pesto & Pastrami Sandwich", "Grill"));
        menu[3][3][1].add(new Food("Mac & Cheese Pizza", "Pizza Station (Entrée)"));
        menu[3][3][1].add(new Food("Pound Cake", "Sweets"));

        //Dinner
        menu[3][3][2].add(new Food("Caldo De Res", "Soups 1"));
        menu[3][3][2].add(new Food("Corn Chowder", "Soups 2"));
        menu[3][3][2].add(new Food("Chicken Fiesta Salad", "The Bar (Entrée)"));
        menu[3][3][2].add(new Food("Carnitas", "At Home (Entrée)"));
        menu[3][3][2].add(new Food("Cheese Tamales", "Vegetarian/Vegan (Entrée)"));
        menu[3][3][2].add(new Food("Char Broiled Chicken ", "Grill"));
        menu[3][3][2].add(new Food("Mac & Cheese Pizza", "Pizza Station (Entrée)"));
        menu[3][3][2].add(new Food("Pound Cake", "Sweets"));

        //Friday
        //Breakfast
        menu[3][4][0].add(new Food("Cinnamon Rice", "Breakfast Bar"));
        menu[3][4][0].add(new Food("Benedict Waffle", "Breakfast Bar"));
        menu[3][4][0].add(new Food("Grilled Ham", "Breakfast Bar"));
        menu[3][4][0].add(new Food("Potatoes O’Brien", "Breakfast Bar"));

        //Lunch
        menu[3][4][1].add(new Food("Clam Chowder", "Soups 1"));
        menu[3][4][1].add(new Food("Vegetable", "Soups 2"));
        menu[3][4][1].add(new Food("Smoothie Bar", "The Bar (Entrée)"));
        menu[3][4][1].add(new Food("Cajun Cod Fish", "At Home (Entrée)"));
        menu[3][4][1].add(new Food("Chile Relleno", "Vegetarian/Vegan (Entrée)"));
        menu[3][4][1].add(new Food("Sopes", "Grill"));
        menu[3][4][1].add(new Food("Pesto Chicken", "Pizza Station (Entrée)"));
        menu[3][4][1].add(new Food("Mocha Cup Cake", "Sweets"));

        //Dinner
        menu[3][4][2].add(new Food("Clam Chowder", "Soups 1"));
        menu[3][4][2].add(new Food("Vegetable", "Soups 2"));
        menu[3][4][2].add(new Food("Sourdough Sausage Bowl", "The Bar (Entrée)"));
        menu[3][4][2].add(new Food("Beef Stroganoff", "At Home (Entrée)"));
        menu[3][4][2].add(new Food("Broccoli Feta Rice", "Vegetarian/Vegan (Entrée)"));
        menu[3][4][2].add(new Food("Fish & Chips", "Grill"));
        menu[3][4][2].add(new Food("Pesto Chicken", "Pizza Station (Entrée)"));
        menu[3][4][2].add(new Food("Mocha Cup Cake", "Sweets"));

        //Saturday
        //Breakfast
        menu[3][5][0].add(new Food("Cream of Wheat", "Breakfast Bar"));
        menu[3][5][0].add(new Food("French Toast", "Breakfast Bar"));
        menu[3][5][0].add(new Food("Turkey Sausage Patty", "Breakfast Bar"));
        menu[3][5][0].add(new Food("Hash Brown", "Breakfast Bar"));

        //Lunch
        menu[3][5][1].add(new Food("Chicken Noodle", "Soups 1"));
        menu[3][5][1].add(new Food("Cream of Broccoli", "Soups 2"));
        menu[3][5][1].add(new Food("Fried Chicken", "At Home (Entrée)"));
        menu[3][5][1].add(new Food("Mac & Cheese", "Vegetarian/Vegan (Entrée)"));

        //Dinner
        menu[3][5][2].add(new Food("Chicken Noodle", "Soups 1"));
        menu[3][5][2].add(new Food("Cream of Broccoli", "Soups 2"));
        menu[3][5][2].add(new Food("Baked Potato Bar", "The Bar (Entrée)"));
        menu[3][5][2].add(new Food("Memphis Ribs", "At Home (Entrée)"));
        menu[3][5][2].add(new Food("Chickpea Ratatouille", "Vegetarian/Vegan (Entrée)"));
        menu[3][5][2].add(new Food("Italian Chicken Sandwich", "Grill"));
        menu[3][5][2].add(new Food("Mac & Cheese", "Pizza Station (Entrée)"));

        //Sunday
        //Breakfast
        menu[3][6][0].add(new Food("Cream of Rice", "Breakfast Bar"));
        menu[3][6][0].add(new Food("Pancake", "Breakfast Bar"));
        menu[3][6][0].add(new Food("Sausage Link", "Breakfast Bar"));
        menu[3][6][0].add(new Food("Hash Brown", "Breakfast Bar"));

        //Lunch
        menu[3][6][1].add(new Food("Beef & Rice Soup", "Soups 1"));
        menu[3][6][1].add(new Food("French Onion", "Soups 2"));
        menu[3][6][1].add(new Food("Buffalo Pork Chops", "At Home (Entrée)"));
        menu[3][6][1].add(new Food("Bionicos", "Vegetarian/Vegan (Entrée)"));

        //Dinner
        menu[3][6][2].add(new Food("Beef & Rice Soup", "Soups 1"));
        menu[3][6][2].add(new Food("French Onion", "Soups 2"));
        menu[3][6][2].add(new Food("Cobb Salad", "The Bar (Entrée)"));
        menu[3][6][2].add(new Food("Chicken Fajita", "At Home (Entrée)"));
        menu[3][6][2].add(new Food("Gardein Chicken Fajita", "Vegetarian/Vegan (Entrée)"));
        menu[3][6][2].add(new Food("Grilled Ham Cheese", "Grill"));
        menu[3][6][2].add(new Food("Combo", "Pizza Station (Entrée)"));

        //Cycle 5
        //Monday
        //Breakfast
        menu[4][0][0].add(new Food("Cream of Rice", "Breakfast Bar"));
        menu[4][0][0].add(new Food("Egg & Ham Croissant", "Breakfast Bar"));
        menu[4][0][0].add(new Food("Kielbasa Sausage", "Breakfast Bar"));
        menu[4][0][0].add(new Food("Cottage Fries", "Breakfast Bar"));

        //Lunch
        menu[4][0][1].add(new Food("Split Pea", "Soups 1"));
        menu[4][0][1].add(new Food("Vegetable", "Soups 2"));
        menu[4][0][1].add(new Food("Cajun Chicken Wrap", "The Bar (Entrée)"));
        menu[4][0][1].add(new Food("Fried Chicken", "At Home (Entrée)"));
        menu[4][0][1].add(new Food("Tofu & Broccoli w/ Curry Sauce", "Vegetarian/Vegan (Entrée)"));
        menu[4][0][1].add(new Food("Grilled Sausage Sticks", "Grill"));
        menu[4][0][1].add(new Food("Pesto Chicken", "Pizza Station (Entrée)"));
        menu[4][0][1].add(new Food("Chocolate Cream Pie", "Sweets"));

        //Dinner
        menu[4][0][2].add(new Food("Split Pea", "Soups 1"));
        menu[4][0][2].add(new Food("Vegetable", "Soups 2"));
        menu[4][0][2].add(new Food("Manicotti/Spicy Mushroom Marinara", "The Bar (Entrée)"));
        menu[4][0][2].add(new Food("Chicken Florentine", "At Home (Entrée)"));
        menu[4][0][2].add(new Food("Gardein Beef Teriyaki", "Vegetarian/Vegan (Entrée)"));
        menu[4][0][2].add(new Food("Hawaiian BBQ Pork Sandwich", "Grill"));
        menu[4][0][2].add(new Food("Pesto Chicken", "Pizza Station (Entrée)"));
        menu[4][0][2].add(new Food("Chocolate Cream Pie", "Sweets"));

        //Tuesday
        //Breakfast
        menu[4][1][0].add(new Food("Grits", "Breakfast Bar"));
        menu[4][1][0].add(new Food("Open Face Sourdough Sandwich", "Breakfast Bar"));
        menu[4][1][0].add(new Food("Spam", "Breakfast Bar"));
        menu[4][1][0].add(new Food("Hash Brown Patty", "Breakfast Bar"));

        //Lunch
        menu[4][1][1].add(new Food("Italian Wedding", "Soups 1"));
        menu[4][1][1].add(new Food("Potato Chowder", "Soups 2"));
        menu[4][1][1].add(new Food("Chipotle Caesar Salad", "The Bar (Entrée)"));
        menu[4][1][1].add(new Food("Chicken Tandori", "At Home (Entrée)"));
        menu[4][1][1].add(new Food("Cheese Tortellini Pomadoro", "Vegetarian/Vegan (Entrée)"));
        menu[4][1][1].add(new Food("Tortas Pambazos (Wet Tortas)", "Grill"));
        menu[4][1][1].add(new Food("Florentine", "Pizza Station (Entrée)"));
        menu[4][1][1].add(new Food("Mini Cream Puffs", "Sweets"));

        //Dinner
        menu[4][1][2].add(new Food("Italian Wedding", "Soups 1"));
        menu[4][1][2].add(new Food("Potato Chowder ", "Soups 2"));
        menu[4][1][2].add(new Food("Potato Bar", "The Bar (Entrée)"));
        menu[4][1][2].add(new Food("Beef Enchiladas", "At Home (Entrée)"));
        menu[4][1][2].add(new Food("Teriyaki Ginger Veggie Bowl", "Vegetarian/Vegan (Entrée)"));
        menu[4][1][2].add(new Food("Beef Dip Sandwich", "Grill"));
        menu[4][1][2].add(new Food("Florentine", "Pizza Station (Entrée)"));
        menu[4][1][2].add(new Food("Mini Cream Puffs", "Sweets"));

        //Wednesday
        //Breakfast
        menu[4][2][0].add(new Food("Sweet Rice w/ Milk", "Breakfast Bar"));
        menu[4][2][0].add(new Food("Breakfast Burrito", "Breakfast Bar"));
        menu[4][2][0].add(new Food("Sausage Links", "Breakfast Bar"));
        menu[4][2][0].add(new Food("Country Potatoes", "Breakfast Bar"));

        //Lunch
        menu[4][2][1].add(new Food("Chicken Noodle", "Soups 1"));
        menu[4][2][1].add(new Food("Broccoli Cheese", "Soups 2"));
        menu[4][2][1].add(new Food("Taco Station", "The Bar (Entrée)"));
        menu[4][2][1].add(new Food("Mongolian Beef", "At Home (Entrée)"));
        menu[4][2][1].add(new Food("Asian Vegetable Noodle", "Vegetarian/Vegan (Entrée)"));
        menu[4][2][1].add(new Food("Naan Chicken Sandwich", "Grill"));
        menu[4][2][1].add(new Food("Buffalo Chicken", "Pizza Station (Entrée)"));
        menu[4][2][1].add(new Food("Devil Cake", "Sweets"));

        //Dinner
        menu[4][2][2].add(new Food("Chicken Noodle", "Soups 1"));
        menu[4][2][2].add(new Food("Broccoli Cheese", "Soups 2"));
        menu[4][2][2].add(new Food("Apple Walnut Salad", "The Bar (Entrée)"));
        menu[4][2][2].add(new Food("Kung Pao Chicken", "At Home (Entrée)"));
        menu[4][2][2].add(new Food("Vegetable Tofu Curry", "Vegetarian/Vegan (Entrée)"));
        menu[4][2][2].add(new Food("Hamburgers", "Grill"));
        menu[4][2][2].add(new Food("Buffalo Chicken", "Pizza Station (Entrée)"));
        menu[4][2][2].add(new Food("Devil Cake", "Sweets"));

        //Thursday
        //Breakfast
        menu[4][3][0].add(new Food("Champurrado", "Breakfast Bar"));
        menu[4][3][0].add(new Food("Chocolate Chip Pancakes", "Breakfast Bar"));
        menu[4][3][0].add(new Food("Sausage Patty", "Breakfast Bar"));
        menu[4][3][0].add(new Food("Tater Tots", "Breakfast Bar"));

        //Lunch
        menu[4][3][1].add(new Food("Pozole", "Soups 1"));
        menu[4][3][1].add(new Food("Italian Raviol", "Soups 2"));
        menu[4][3][1].add(new Food("Thai Beef Salad", "The Bar (Entrée)"));
        menu[4][3][1].add(new Food("Cajun Chicken", "At Home (Entrée)"));
        menu[4][3][1].add(new Food("Charro Pasta", "Vegetarian/Vegan (Entrée)"));
        menu[4][3][1].add(new Food("Pesto Turkey Flatbread", "Grill"));
        menu[4][3][1].add(new Food("Italian Sausage", "Pizza Station (Entrée)"));
        menu[4][3][1].add(new Food("Confetti Cup Cake", "Sweets"));

        //Dinner
        menu[4][3][2].add(new Food("Pozole", "Soups 1"));
        menu[4][3][2].add(new Food("Italian Raviol", "Soups 2"));
        menu[4][3][2].add(new Food("Build Your Own Soup Bowl", "The Bar (Entrée)"));
        menu[4][3][2].add(new Food("Thai BBQ Beef", "At Home (Entrée)"));
        menu[4][3][2].add(new Food("Vegatable Noodle Stir Fry", "Vegetarian/Vegan (Entrée)"));
        menu[4][3][2].add(new Food("Krispy Ranch Chicken Sandwich", "Grill"));
        menu[4][3][2].add(new Food("Italian Sausage", "Pizza Station (Entrée)"));
        menu[4][3][2].add(new Food("Confetti Cup Cake", "Sweets"));

        //Friday
        //Breakfast
        menu[4][4][0].add(new Food("Cinnamon Rice", "Breakfast Bar"));
        menu[4][4][0].add(new Food("Stuffed French Toast", "Breakfast Bar"));
        menu[4][4][0].add(new Food("Bacon", "Breakfast Bar"));
        menu[4][4][0].add(new Food("Potatoes O’Brien", "Breakfast Bar"));

        //Lunch
        menu[4][4][1].add(new Food("Clam Chowder", "Soups 1"));
        menu[4][4][1].add(new Food("Minestrone", "Soups 2"));
        menu[4][4][1].add(new Food("Crispy Chicken Salad", "The Bar (Entrée)"));
        menu[4][4][1].add(new Food("Cod in Thai Red Curry Sauce", "At Home (Entrée)"));
        menu[4][4][1].add(new Food("Vegetable Tempura", "Vegetarian/Vegan (Entrée)"));
        menu[4][4][1].add(new Food("Quesadilla Al Pastor", "Grill"));
        menu[4][4][1].add(new Food("Hawaiian", "Pizza Station (Entrée)"));
        menu[4][4][1].add(new Food("Whoppie Pie", "Sweets"));

        //Dinner
        menu[4][4][2].add(new Food("Clam Chowder", "Soups 1"));
        menu[4][4][2].add(new Food("Asi", "Soups 2"));
        menu[4][4][2].add(new Food("Spinach Pear Salad", "The Bar (Entrée)"));
        menu[4][4][2].add(new Food("Home Style Meat Loaf", "At Home (Entrée)"));
        menu[4][4][2].add(new Food("Cheese Tortalini", "Vegetarian/Vegan (Entrée)"));
        menu[4][4][2].add(new Food("Cajun Ranch Fish Sandwich", "Grill"));
        menu[4][4][2].add(new Food("Hawaiian", "Pizza Station (Entrée)"));

        //Saturday
        //Breakfast
        menu[4][5][0].add(new Food("Cream of Wheat", "Breakfast Bar"));
        menu[4][5][0].add(new Food("Waffle Bar", "Breakfast Bar"));
        menu[4][5][0].add(new Food("Little Smokies", "Breakfast Bar"));
        menu[4][5][0].add(new Food("Hash Brown Patty", "Breakfast Bar"));

        //Lunch
        menu[4][5][1].add(new Food("Sausage & Lentil", "Soups 1"));
        menu[4][5][1].add(new Food("Garden Vegetable", "Soups 2"));
        menu[4][5][1].add(new Food("Roast Beef Carvery", "At Home (Entrée)"));
        menu[4][5][1].add(new Food("Ravioli w/ Mushroom Marinara", "Vegetarian/Vegan (Entrée)"));

        //Dinner
        menu[4][5][2].add(new Food("Sausage & Lentil", "Soups 1"));
        menu[4][5][2].add(new Food("Garden Vegetable", "Soups 2"));
        menu[4][5][2].add(new Food("Greek Salad", "The Bar (Entrée)"));
        menu[4][5][2].add(new Food("Meat Lasagna", "At Home (Entrée)"));
        menu[4][5][2].add(new Food("Vegetable Lasagna", "Vegetarian/Vegan (Entrée)"));
        menu[4][5][2].add(new Food("Wings-N-Things", "Grill"));
        menu[4][5][2].add(new Food("Vegetable", "Pizza Station (Entrée)"));

        //Sunday
        //Breakfast
        menu[4][6][0].add(new Food("Cream of Rice", "Breakfast Bar"));
        menu[4][6][0].add(new Food("Biscuits & Gravy", "Breakfast Bar"));
        menu[4][6][0].add(new Food("Turkey Sausage Patty", "Breakfast Bar"));
        menu[4][6][0].add(new Food("Hash Brown", "Breakfast Bar"));

        //Lunch
        menu[4][6][1].add(new Food("Chicken Noodle", "Soups 1"));
        menu[4][6][1].add(new Food("Tomato Basil", "Soups 2"));
        menu[4][6][1].add(new Food("Spicy BBQ Chicken", "At Home (Entrée)"));
        menu[4][6][1].add(new Food("Ravioli w/ Mushroom Marinara", "Vegetarian/Vegan (Entrée)"));

        //Dinner
        menu[4][6][2].add(new Food("Chicken Noodle", "Soups 1"));
        menu[4][6][2].add(new Food("Tomato Basil", "Soups 2"));
        menu[4][6][2].add(new Food("Caesar Salad", "The Bar (Entrée)"));
        menu[4][6][2].add(new Food("Roast Turkey Breast", "At Home (Entrée)"));
        menu[4][6][2].add(new Food("Cheese Ravioli w/ Pesto Alfredo", "Vegetarian/Vegan (Entrée)"));
        menu[4][6][2].add(new Food("Fish & Chips", "Grill"));
        menu[4][6][2].add(new Food("BBQ Chicken", "Pizza Station (Entrée)"));
    }


}
