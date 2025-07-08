package nivell_2.exercici_1.service;

import nivell_2.exercici_1.model.Restaurant;

import java.util.HashSet;

public class RunMain {

    public static void run(){

        HashSet<Restaurant> restaurantsHashSet = new HashSet<>();

        Restaurant restaurant_1 = new Restaurant("Restaurant_1", 1);
        Restaurant restaurant_2 = new Restaurant("Restaurant_2", 2);
        Restaurant restaurant_3 = new Restaurant("Restaurant_3", 3);
        Restaurant restaurant_4 = new Restaurant("Restaurant_3", 3);
        Restaurant restaurant_5 = new Restaurant("Restaurant_3", 2);

        restaurantsHashSet.add(restaurant_1);
        restaurantsHashSet.add(restaurant_2);
        restaurantsHashSet.add(restaurant_3);
        restaurantsHashSet.add(restaurant_4);
        restaurantsHashSet.add(restaurant_5);

        for(Restaurant restaurant: restaurantsHashSet){
            System.out.println("Name: " + restaurant.getName() + " - Score: " + restaurant.getScore());
        }
    }
}
