package nivell_2.exercici_2;

import nivell_2.exercici_2.model.Restaurant;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Restaurant> restaurantTreeSet = new TreeSet<>();

        Restaurant restaurant_1 = new Restaurant("BurguerKing", 1);
        Restaurant restaurant_2 = new Restaurant("McDonals", 2);
        Restaurant restaurant_3 = new Restaurant("KFC", 3);
        Restaurant restaurant_4 = new Restaurant("Pans&company", 3);
        Restaurant restaurant_5 = new Restaurant("Subway", 2);
        Restaurant restaurant_6 = new Restaurant("BurguerKing", 2);
        Restaurant restaurant_7 = new Restaurant("BurguerKing", 4);

        restaurantTreeSet.add(restaurant_1);
        restaurantTreeSet.add(restaurant_2);
        restaurantTreeSet.add(restaurant_3);
        restaurantTreeSet.add(restaurant_4);
        restaurantTreeSet.add(restaurant_5);
        restaurantTreeSet.add(restaurant_6);
        restaurantTreeSet.add(restaurant_7);

        for(Restaurant restaurant: restaurantTreeSet){
            System.out.println("Name: " + restaurant.getName() + ", score: " + restaurant.getScore());
        }

    }
}
