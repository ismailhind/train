package com.ismail.cleancode;

public class HeadVehicle implements Vehicle {

    public void accept(VehicleVisitor visitor) {
        visitor.visit(this);
    }
    @Override
    public String toString() {
        return "|HHHH|";
    }
/*    public String print(boolean last){
        if(last) return "HHHH>";
        return "HHHH::";
    }*/
}
