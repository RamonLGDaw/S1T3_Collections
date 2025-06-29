package nivell_1.exercici_3.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class LoadCountries {

    public static HashMap<String, String> loadCountriesFromFile() {
        String line = "";
        HashMap<String, String> countriesList = new HashMap<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader("src/nivell_1/exercici_3/resources/countries.txt"));
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.isEmpty()) {
                    String[] item = line.split(" ");
                    countriesList.put(item[0], item[1]);
                }
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error loading data from file.");
        }

        return countriesList;
    }

}
