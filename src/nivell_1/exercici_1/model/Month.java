package nivell_1.exercici_1.model;

import java.util.Objects;

public class Month {
    private String name;

    public Month(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Month month = (Month) object;
        return Objects.equals(name, month.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return  this.name;
    }
}
