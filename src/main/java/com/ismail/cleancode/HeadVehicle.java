package com.ismail.cleancode;

public class HeadVehicle implements Vehicle {

    public String print(boolean last){
        if(last) return "HHHH>";
        return "HHHH::";
    }
}
