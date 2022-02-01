package com.ismail.cleancode;

public class CargoVehicle extends Vehicle {

    public void accept(VehicleVisitor visitor) {
        visitor.cargoWriter();
    }

}
