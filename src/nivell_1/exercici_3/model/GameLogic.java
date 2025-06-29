package nivell_1.exercici_3.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import static nivell_1.exercici_3.model.Game.scanner;

public class GameLogic {
    final static int ROUNDS_NUMBER = 10;

    static int playGame(String playerName, HashMap<String, String> mapCountries) {
        Random ramdom = new Random();

        int counter = 0;
        List<String> countryList = new ArrayList<>();

        for (String pais : mapCountries.keySet()) {
            countryList.add(pais);
        }

        for (int i = 0; i < ROUNDS_NUMBER; i++) {

            int numRandom = ramdom.nextInt(countryList.size());
            System.out.println("\nRound: " + (i + 1));
            System.out.println(playerName + ", what is the capital of " + countryList.get(numRandom) + "?");
            String playerAnswer = scanner.nextLine();
            playerAnswer = playerAnswer.trim();
            playerAnswer = playerAnswer.replace(" ", "_");
            System.out.println("You answered: " + playerAnswer);

            if (CheckAsnwer.checkAnswer(countryList.get(numRandom), playerAnswer, mapCountries)) {
                System.out.println("That's correct. One point");
                counter++;
            }

            countryList.remove(countryList.get(numRandom));
        }

        System.out.println("\n" + playerName + " your final score is " + counter + " points.");
        return counter;
    }
}
