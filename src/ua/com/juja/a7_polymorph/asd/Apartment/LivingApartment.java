package ua.com.juja.a7_polymorph.asd.Apartment;

import ua.com.juja.a7_polymorph.asd.Owner;

public class LivingApartment extends Apartment {

    private Owner[] owners;
    private int capacity;

    public LivingApartment(int number, int capacity) {
        super(number, capacity);
        this.capacity = capacity;
        owners = new Owner[capacity];
    }
    @Override
    public boolean isFree() {
        return nextIndex() != -1;
    }

    public int getCapacity() {
        return capacity;
    }

    public void addOwner(Owner owner) {
        int i = nextIndex();
        if (i == -1) {
            throw new RuntimeException("Apartment is full!");
        }
        owners[i] = owner;
    }

    private int nextIndex() {
        for (int i = 0; i < owners.length; i++) {
            if (owners[i] == null) {
                return i;
            }
        }
        return -1;
    }
    @Override
    public String toString() {
        String result = super.toString();
        result += "\t\tMy capacity is:" + capacity + " with owners:\n";
        for (Owner owner : owners) {
            if (owner != null) {
                result += "\t\t\t" + owner.toString() + "\n";
            }
        }
        result += "\t\tMy free status is:" + isFree()+ "\n";
        return result;
    }
}
