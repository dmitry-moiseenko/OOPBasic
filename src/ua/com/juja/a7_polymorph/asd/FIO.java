package ua.com.juja.a7_polymorph.asd;

public class FIO {
    private String name;
    private String surname;

    FIO(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String toString() {
        return this.name + "  " + this.surname;
    }

}
