package com.ismail.cleancode;

public final class VehicleFactory {

    private VehicleFactory() {
    }

    public static Vehicle getVehicle(char vehicleType){
        if(vehicleType == 'h') return new LeftHeadVehicle();
        if(vehicleType == 'H') return new RightHeadVehicle();
        if(vehicleType == 'C') return new CargoVehicle();
        if(vehicleType == 'P') return new PassengerVehicle();
        if(vehicleType == 'R') return new RVehicle();
        return null;
    }
}
