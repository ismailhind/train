package com.ismail.cleancode;

public class CargoVehicle extends Vehicle implements Fillable {

    public void accept(VehicleVisitor visitor) {
        visitor.cargoWriter();
    }

    public boolean fillable() {
        return true;
    }
}
