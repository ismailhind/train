package com.ismail.cleancode;

public interface VehicleVisitor {

    public void cargoWriter();
    public void rVehicleWriter();
    public void rightHeadWriter();
    public void leftHeadWriter();
    public void passengerWriter();
    public void modifiedCargoWriter();

    StringBuilder getBuilder();
}
