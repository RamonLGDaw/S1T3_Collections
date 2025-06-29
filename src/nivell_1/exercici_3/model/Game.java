package nivell_1.exercici_3.model;

import java.util.*;

public class Game {
    static Scanner scanner = new Scanner(System.in);


    public void run() {

        HashMap<String, String> mapCountries = LoadCountries.loadCountriesFromFile();

        String playerName = EnterName.enterName();
        int finalScore = GameLogic.playGame(playerName, mapCountries);
        SaveResults.saveResults(playerName, finalScore);

        System.out.println("End of the program.");

    }
}