package Polymorf;

public class FIO {
    private String name;
    private String surname;


    public FIO(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    public String toString() {
        return this.name + "." + this.surname;
    }
}
