package Polymorf;

import Polymorf.Vehicle.CityVehicle;

public class Owner {
    private FIO fio;
    private CityVehicle cityVehicle;

    public Owner(FIO fio) {
        this.fio = fio;
    }



    public String toString(){
        return fio.toString();
    }

    public CityVehicle getCityVehicle() {
        return cityVehicle;
    }

    public void setCityVehicle(CityVehicle cityVehicle, Owner owner) {
        if (fio.equals(owner.fio)){
            this.cityVehicle = cityVehicle;
        }
    }
}
