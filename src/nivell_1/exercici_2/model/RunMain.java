package nivell_1.exercici_2.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RunMain {

    public  static void run(){
        List<Integer> listInt_1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<Integer> listInt_2 = new ArrayList<>();

        Iterator<Integer> iteratorListInt_1 = listInt_1.iterator();

        while (iteratorListInt_1.hasNext()) {
            Integer integer = iteratorListInt_1.next();

            listInt_2.add(0, integer);
        }

        System.out.println("List 1: " + listInt_1);
        System.out.println("List 2: " + listInt_2);
    }
}
