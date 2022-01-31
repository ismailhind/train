package com.ismail.cleancode;

public class PassengerVehicle implements Vehicle {

    public void accept(VehicleVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "|OOOO|";
    }

    /*    public String print(boolean last) {
        if(last) return "|OOOO|";
        return "|OOOO|::";
    }*/
}
