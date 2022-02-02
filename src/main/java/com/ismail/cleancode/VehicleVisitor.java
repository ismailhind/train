package com.ismail.cleancode;

public interface VehicleVisitor {

    void cargoWriter();
    void filledCargoWriter();
    void rVehicleWriter();
    void rightHeadWriter();
    void leftHeadWriter();
    void passengerWriter();
    void modifiedCargoWriter();

    StringBuilder getBuilder();
}
