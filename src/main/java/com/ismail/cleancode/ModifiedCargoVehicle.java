package com.ismail.cleancode;

public class ModifiedCargoVehicle extends Vehicle {

    public void accept(VehicleVisitor visitor) {
        visitor.modifiedCargoWriter();
    }

}
