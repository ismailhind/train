package com.ismail.cleancode;

import static com.ismail.cleancode.VehicleType.*;

public final class VehicleFactory {

    private VehicleFactory() {
    }

    public static Vehicle getVehicle(char vehicleType){
        if(vehicleType == HEAD_RIGHT.getVehicleType()) return new LeftHeadVehicle();
        if(vehicleType == HEAD_LEFT.getVehicleType()) return new RightHeadVehicle();
        if(vehicleType == CARGO.getVehicleType()) return new CargoVehicle();
        if(vehicleType == PASSENGER.getVehicleType()) return new PassengerVehicle();
        if(vehicleType == RESTAURANT.getVehicleType()) return new RestaurantVehicle();
        return null;
    }
}
