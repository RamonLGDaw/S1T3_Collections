package nivell_1.exercici_3.model;

import static nivell_1.exercici_3.model.Game.scanner;

public class EnterName {

    static String enterName() {
        String playerName = "";
        while (playerName.isEmpty()) {
            System.out.print("Enter your name: ");
            playerName = scanner.nextLine();
            playerName = playerName.trim();

        }

        return playerName;
    }
}
