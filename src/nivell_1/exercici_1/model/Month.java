package nivell_1.exercici_1.model;

public class Month {
    private String name;

    public Month(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  this.name;
    }
}
