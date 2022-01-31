package com.ismail.cleancode;

public class RVehicle implements Vehicle {

    public void accept(VehicleVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "|hThT|";
    }

/*    public String print(boolean last) {
        if(last) return "|hThT|";
        return "|hThT|::";
    }*/
}
