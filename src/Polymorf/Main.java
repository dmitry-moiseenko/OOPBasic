package Polymorf;

import Polymorf.Vehicle.Car;
import Polymorf.Vehicle.CityVehicle;
import Polymorf.Vehicle.Motorcycle;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Toyota");
        car.drive();


        Motorcycle moto = new Motorcycle("Yamaha");
        moto.drive();
        System.out.println(moto.toString());


        CityVehicle cityVehicle = new Motorcycle("Honda");
        cityVehicle.drive();

        Owner owner1 = new Owner(new FIO("Vasya", "Petrov"));
        Owner owner2 = new Owner(new FIO("Kolya", "Sidoroff"));
        Seller seller = new Seller();


        System.out.println("sale " + seller.sellCar(owner1));
        System.out.println(owner1.toString() + " " + owner1.getCityVehicle());


    }

}
