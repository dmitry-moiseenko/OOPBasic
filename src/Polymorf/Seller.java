package Polymorf;

import Polymorf.Vehicle.Car;

import java.util.Random;

public class Seller {
    private Owner owner;
    private String honda = "Honda";
    private String kia = "KIA";
    private String bmw = "BMW";
    private String mersedes = "Mersedes";
    private String hyndai = "Hyndai";
    private String laga = "Lada";

    private String[] allCarToSell = {honda, kia, bmw, mersedes, hyndai, laga};

    public int ran() {
        return new Random().nextInt(6) + 1;
    }

    public String sellCar(Owner owner) {
        switch (this.ran()) {
            case 1:
                owner.setCityVehicle(new Car(honda), owner);
                return honda;
            case 2:
                owner.setCityVehicle(new Car(kia), owner);
                return this.kia;
            case 3:
                owner.setCityVehicle(new Car(bmw), owner);
                return this.bmw;
            case 4:
                owner.setCityVehicle(new Car(mersedes), owner);
                return this.mersedes;
            case 5:
                owner.setCityVehicle(new Car(hyndai), owner);
                return this.hyndai;
            case 6:
                owner.setCityVehicle(new Car(laga), owner);
                return this.laga;
            default:
                return "Машин нет в продаже";
        }
    }

    public String[] allCarToSell() {
        return allCarToSell;
    }

//        CityVehicle car = new Car();
}
