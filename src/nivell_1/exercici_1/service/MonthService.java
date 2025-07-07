package nivell_1.exercici_1.service;

import nivell_1.exercici_1.model.Month;

import java.util.*;

public class MonthService {

    public List<Month> createMonthListWithoutAugust() {
        return new ArrayList<>(Arrays.asList(
                new Month("January"),
                new Month("February"),
                new Month("March"),
                new Month("April"),
                new Month("May"),
                new Month("June"),
                new Month("July"),
                new Month("September"),
                new Month("October"),
                new Month("November"),
                new Month("December")
        ));
    }

    public void insertMonth(List<Month> months, int index, Month month) {
        months.add(index, month);
    }

    public Set<Month> convertToSet(List<Month> months) {
        return new HashSet<>(months);
    }

    public void printWithForLoop(Collection<Month> months) {
        for (Month month : months) {
            System.out.println("Month: " + month);
        }
    }

    public void printWithIterator(Collection<Month> months) {
        Iterator<Month> iterator = months.iterator();
        while (iterator.hasNext()) {
            System.out.println("Month: " + iterator.next());
        }
    }
}
