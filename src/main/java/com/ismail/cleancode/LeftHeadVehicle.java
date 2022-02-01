package com.ismail.cleancode;

public class LeftHeadVehicle extends Vehicle {

    public void accept(VehicleVisitor visitor) {
        visitor.leftHeadWriter();
    }

}
