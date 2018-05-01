package ua.com.juja.a7_polymorph.asd.Apartment;

import ua.com.juja.a7_polymorph.asd.Room;

public abstract class AbstractApartment {
    private Room[] rooms;
    protected int number;

    public AbstractApartment(int number, int capacity) {
        this.number = number;
        rooms = new Room[capacity];
        for (int i = 0; i < capacity; i++) {
            rooms[i] = new Room();
        }
    }
    @Override
    public String toString() {
        String apartmentName = this.getClass().getSimpleName();
        String result = "Hi, I am an " + apartmentName + " #" + number + "\n";
        return result;
    }

    public boolean isFree(){
        return false;
    }
}
