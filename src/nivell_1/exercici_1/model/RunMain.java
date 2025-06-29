package nivell_1.exercici_1.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class RunMain {

    public static void run(){
        Month january = new Month("January");
        Month february = new Month("February");
        Month march = new Month("March");
        Month april = new Month("April");
        Month may = new Month("May");
        Month june = new Month("June");
        Month july = new Month("July");
        Month august = new Month("August");
        Month september = new Month("September");
        Month october = new Month("October");
        Month november = new Month("November");
        Month december = new Month("December");

        ArrayList<Month> calendar = new ArrayList<>(Arrays.asList(
                january,
                february,
                march,
                april,
                may,
                june,
                july,
                september,
                october,
                november,
                december
        ));


        System.out.println("Calendar: " + calendar);


        calendar.add(7, august);


        System.out.println("Calendar in ArrayList: " + calendar);


        HashSet<Month> calendarHashSet = new HashSet<>(Arrays.asList(
                january,
                february,
                march,
                april,
                may,
                june,
                july,
                august,
                september,
                october,
                november,
                december
        ));



        System.out.println("HashSet with months: " + calendarHashSet);
        System.out.println("HastSet lenght: " + calendarHashSet.size());


        calendarHashSet.add(august);

        System.out.println("HashSet after trying to add august again:");
        System.out.println("HashSet with months: " + calendarHashSet);
        System.out.println("HastSet length: " + calendarHashSet.size());



        System.out.println("\nArrayList Calendar for loop:");
        for(Month month:calendar){
            System.out.println("Month: " + month);
        }


        System.out.println("\nHashSet Calendar for loop:");
        for(Month month:calendarHashSet){
            System.out.println("Month: " + month);
        }


        System.out.println("\nArrayList Calendar iterator:");
        Iterator<Month> iteratorArrayList = calendar.iterator();
        while (iteratorArrayList.hasNext()){
            Month month = iteratorArrayList.next();
            System.out.println("Month: " + month);
        }


        System.out.println("\nHashSet Calendar iterator:");
        Iterator<Month> iteratorHashSet = calendarHashSet.iterator();
        while (iteratorHashSet.hasNext()){
            Month month = iteratorHashSet.next();
            System.out.println("Month: " + month);
        }
    }
}
