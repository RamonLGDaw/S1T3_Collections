package nivell_1.exercici_1.model;

import nivell_1.exercici_1.service.MonthService;

import java.util.*;

public class RunMain {

    public static void run() {
        MonthService monthService = new MonthService();

        System.out.println("Creant la llista de mesos SENSE el mes d’agost");
        List<Month> calendar = monthService.createMonthListWithoutAugust();
        monthService.printWithForLoop(calendar);

        System.out.println("\nInserint el mes 'Agost' a la posició 8 (índex 7)");
        monthService.insertMonth(calendar, 7, new Month("August"));
        monthService.printWithForLoop(calendar);

        System.out.println("\nRecorregut de l'ArrayList amb un iterator:");
        monthService.printWithIterator(calendar);

        System.out.println("\nConvertint la llista a un HashSet per evitar duplicats");
        Set<Month> calendarSet = monthService.convertToSet(calendar);
        monthService.printWithForLoop(calendarSet);

        System.out.println("\nRecorregut del HashSet amb un iterator:");
        monthService.printWithIterator(calendarSet);
        System.out.println("Longitud: " +calendarSet.size());

        System.out.println("\nIntentant afegir 'Agost' una altra vegada al HashSet.");
        calendarSet.add(new Month("August"));
        System.out.println("HashSet després d'intentar afegir el mes duplicat 'Agost':");
        monthService.printWithForLoop(calendarSet);
        System.out.println("Longitud: " +calendarSet.size());
    }
}