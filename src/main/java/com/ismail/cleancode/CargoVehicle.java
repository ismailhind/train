package com.ismail.cleancode;

public class CargoVehicle extends Vehicle implements Fillable{

    private boolean fillable = false;

    public CargoVehicle() {
        this.fillable = true;
    }

    public void accept(VehicleVisitor visitor) {
        visitor.cargoWriter(fillable);
    }

    public boolean isFillable() {
        return this.fillable;
    }

    public void setFillable(boolean fillable) {
        this.fillable = fillable;
    }

}
