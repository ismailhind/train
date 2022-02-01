package com.ismail.cleancode;

public class PassengerVehicle extends Vehicle {

    public void accept(VehicleVisitor visitor) {
        visitor.passengerWriter();
    }

}
