package com.ismail.cleancode;

public class CargoVehicle implements Vehicle {

    public void accept(VehicleVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "|____|";
    }

    /*    public String print(boolean last) {
        if(last) return "|____|";
        return "|____|::";
    }*/
}
