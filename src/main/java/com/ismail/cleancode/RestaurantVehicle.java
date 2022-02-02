package com.ismail.cleancode;

public class RestaurantVehicle extends Vehicle {

    public void accept(VehicleVisitor visitor) {
        visitor.rVehicleWriter();
    }

}
