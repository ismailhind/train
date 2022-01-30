package com.ismail.cleancode;

public class CargoVehicle implements Vehicle {


    public String print(boolean last) {
        if(last) return "|____|";
        return "|____|::";
    }
}
