package Polymorf.Vehicle;

public class Car extends CityVehicle{
    private static final int QUANTITY_OF_WHEELS = 4;

    public Car(String name) {
        super(name, QUANTITY_OF_WHEELS);
    }

    public String getName(){
        return super.name;
    }

    public int getWheel() {
        return QUANTITY_OF_WHEELS;
    }


    @Override
    public String toString(){
        return super.toString();

    }

}
