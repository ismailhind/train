package com.ismail.cleancode;

public enum VehicleType {

    HEAD_LEFT('H'),
    HEAD_RIGHT('h'),
    CARGO('C'),
    PASSENGER('P'),
    RESTAURANT('R');

    private final Character vehicleType;

    VehicleType(Character vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Character getVehicleType(){
        return vehicleType;
    }

}
