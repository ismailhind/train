package com.ismail.cleancode;

public class ModifiedCargoVehicle implements Vehicle {

    public void accept(VehicleVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "|^^^^|";
    }

/*    public String print(boolean last) {
        if(last) return "|^^^^|";
        return "|^^^^|::";
    }*/
}
