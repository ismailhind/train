package com.ismail.cleancode;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static ArrayList<Vehicle> stringToArrayVehicles(String str) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        for (int i = 0; i < str.length(); i++) {
            vehicles.add(vehicleFactory.getVehicle(str.charAt(i)));
        }
        return (ArrayList<Vehicle>) vehicles;
    }
}
