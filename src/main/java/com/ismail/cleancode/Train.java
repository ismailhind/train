package com.ismail.cleancode;

import jdk.nashorn.api.scripting.ScriptObjectMirror;

import java.util.List;

public class Train implements Vehicle {

    VehicleFactory vehicleFactory;
  //  List<Character> inputChar;
    public List<Vehicle> vehicles;

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public Train(String input) {
        vehicleFactory = new VehicleFactory();
        vehicles = Utils.stringToArrayVehicles(input);
    }

/*    public String print() {
        String output = "";
        boolean last = false;

        for (int i = 0; i < inputChar.size(); i++) {
            if (i == 0 && inputChar.get(i) == 'H') output += "<";
            if (i == inputChar.size() - 1) last = true;
            Vehicle vehicle = vehicleFactory.getVehicle(inputChar.get(i));
            //   output += vehicle.print(last);
        }
        return output;
    }

    public void detachEnd() {
        inputChar.remove(inputChar.size() - 1);
    }

    public void detachHead() {
        inputChar.remove(0);
    }

    public boolean fill() {
        for (int i = 0; i < inputChar.size(); i++) {
            if (inputChar.get(i) == 'C') {
                inputChar.set(i, 'c');
                return true;
            }
        }
        return false;
    }*/


    public void accept(VehicleVisitor visitor) {
        String output = "";
        for (int i = 0; i < vehicles.size(); i++) {
            vehicles.get(i).accept(visitor);
        }
    }
}
