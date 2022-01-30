package com.ismail.cleancode;

public class ModifiedCargoVehicle implements Vehicle {

    public String print(boolean last) {
        if(last) return "|^^^^|";
        return "|^^^^|::";
    }
}
