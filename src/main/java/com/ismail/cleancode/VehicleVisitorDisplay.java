package com.ismail.cleancode;

public class VehicleVisitorDisplay implements VehicleVisitor {

    public void visit(CargoVehicle vehicle) {
        System.out.print(vehicle.toString());
    }

    public void visit(ModifiedCargoVehicle vehicle) {
        System.out.print(vehicle.toString());
    }

    public void visit(HeadVehicle vehicle) {
        System.out.print(vehicle.toString());
    }

    public void visit(PassengerVehicle vehicle) {
        System.out.print(vehicle.toString());
    }

    public void visit(RVehicle vehicle) {
        System.out.print("|hThT|");
    }

    public void visit(Train train) {
    }
}
