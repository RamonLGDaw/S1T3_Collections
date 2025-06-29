package nivell_1.exercici_3.model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SaveResults {

    static void saveResults(String playerName, int counter) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(
                    new FileWriter("src/nivell_1/exercici_3/resources/classificacio.txt", true));
            bufferedWriter.write("-" + playerName + ": " + counter + " points");
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getClass().getName());
        }
    }
}
