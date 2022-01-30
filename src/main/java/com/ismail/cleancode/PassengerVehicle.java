package com.ismail.cleancode;

public class PassengerVehicle implements Vehicle {
    public String print(boolean last) {
        if(last) return "|OOOO|";
        return "|OOOO|::";
    }
}
