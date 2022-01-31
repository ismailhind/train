package com.ismail.cleancode;

public interface VehicleVisitor {

    public void visit(CargoVehicle vehicle);
    public void visit(ModifiedCargoVehicle vehicle);
    public void visit(HeadVehicle vehicle);
    public void visit(PassengerVehicle vehicle);
    public void visit(RVehicle vehicle);
    public void visit(Train vehicle);

}
