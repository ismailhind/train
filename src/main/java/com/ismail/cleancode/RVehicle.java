package com.ismail.cleancode;

public class RVehicle extends Vehicle {

    public void accept(VehicleVisitor visitor) {
        visitor.rVehicleWriter();
    }

}
