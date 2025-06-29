package nivell_1.exercici_3.model;

import java.util.Map;

public class CheckAsnwer {
    static boolean checkAnswer(String country, String answer, Map<String, String> map) {
        if (map.get(country).equalsIgnoreCase(answer)) {
            return true;
        } else {
            System.out.println("I'm sorry, the correct answer is " + map.get(country));
            return false;
        }
    }
}
