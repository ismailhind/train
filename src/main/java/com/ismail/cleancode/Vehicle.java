package com.ismail.cleancode;

public abstract class Vehicle implements Fillable {

    public abstract void accept(VehicleVisitor visitor);

    public boolean fillable() {
        return false;
    }
}
