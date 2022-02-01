package com.ismail.cleancode;

public interface VehicleVisitor {

    void cargoWriter(boolean filable);
    void rVehicleWriter();
    void rightHeadWriter();
    void leftHeadWriter();
    void passengerWriter();
    void modifiedCargoWriter();

    StringBuilder getBuilder();
}
