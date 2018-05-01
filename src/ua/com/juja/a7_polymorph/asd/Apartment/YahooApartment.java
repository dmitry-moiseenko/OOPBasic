package ua.com.juja.a7_polymorph.asd.Apartment;

public class YahooApartment extends Apartment {
    public YahooApartment(int number, int capacity) {
        super(number, capacity);
    }

    @Override
    public String toString(){
        String result = super.toString();
        return result + " Hello user, Yahoo is greats you";
    }
}
