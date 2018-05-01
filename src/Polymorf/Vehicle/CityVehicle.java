package Polymorf.Vehicle;

public abstract class CityVehicle {
    protected String name;
    private int quantityOfWheels;

    CityVehicle(String name, int quantityOfWheels){
        this.name = name;
        this.quantityOfWheels = quantityOfWheels;
    }

    CityVehicle(){

    }

    public void drive(){
        System.out.println("I'm driving " + this.name);
    }

    public String toString(){
        return getClass().getSimpleName() + ": name \"" + this.name + "\" ";
    }

}
