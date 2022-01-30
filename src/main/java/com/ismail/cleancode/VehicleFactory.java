package com.ismail.cleancode;

public class VehicleFactory {

    public Vehicle getVehicle(char vehicleType){
        if(vehicleType == 'H') return new HeadVehicle();
        if(vehicleType == 'C') return new CargoVehicle();
        if(vehicleType == 'c') return new ModifiedCargoVehicle();
        if(vehicleType == 'P') return new PassengerVehicle();
        if(vehicleType == 'R') return new RVehicle();
        return null;
    }
}
