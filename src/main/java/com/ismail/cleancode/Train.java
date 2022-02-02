package com.ismail.cleancode;

import java.util.ArrayList;
import java.util.List;

public class Train  {

    private final List<Vehicle> vehicles = new ArrayList<Vehicle>();


    public Train(String input) {
        fillVehicles(input);
    }

    public String print() {
        VehicleVisitor visitor = new VehicleVisitorDisplay();
        for (int i = 0; i < vehicles.size(); i++) {
            vehicles.get(i).accept(visitor);
            if(i < vehicles.size()-1) visitor.getBuilder().append("::");
        }
        return visitor.getBuilder().toString();
    }

    public void fillVehicles(String str) {
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'H' && i == 0)  vehicles.add(VehicleFactory.getVehicle('h'));
            else vehicles.add(VehicleFactory.getVehicle(str.charAt(i)));
        }
    }

    public void detachEnd() {
        vehicles.remove(vehicles.size() - 1);
    }

    public void detachHead() {
        vehicles.remove(0);
    }

    public boolean fill() {
        for (int i = 0; i < vehicles.size(); i++) {
            if(vehicles.get(i) instanceof CargoVehicle
            && ((CargoVehicle) vehicles.get(i)).isFillable()){
                replaceFillableCargoWith(i, (CargoVehicle)vehicles.get(i));
                return true;
            }
        }
        return false;
    }

    private void replaceFillableCargoWith(int i, CargoVehicle vehicle) {
        vehicle.setFillable(false);
        vehicles.set(i, vehicle);
    }
}
