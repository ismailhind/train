package com.ismail.cleancode;

public class RightHeadVehicle extends Vehicle {

    public void accept(VehicleVisitor visitor) {
        visitor.rightHeadWriter();
    }

}
