package com.ismail.cleancode;

public class CargoVehicle extends Vehicle implements Fillable{

   private boolean isFillable = true;

    public void accept(VehicleVisitor visitor) {
        if(isFillable) visitor.cargoWriter();
        else visitor.filledCargoWriter();
    }

    @Override
    public boolean fill() {
        if(isFillable) {
            isFillable = false;
            return true;
        }
        return false;
    }
}
