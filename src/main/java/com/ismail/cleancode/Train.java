package com.ismail.cleancode;

import java.util.List;

public class Train {

    VehicleFactory vehicleFactory;
    List<Character> inputChar;

    public Train(String input) {
        inputChar = Utils.stringToArrayChar(input);
        vehicleFactory = new VehicleFactory();
    }

    public String print() {
        String output = "";
        boolean last = false;

        for (int i = 0; i < inputChar.size(); i++) {
            if(i==0 && inputChar.get(i) == 'H') output += "<";
            if(i == inputChar.size() - 1) last = true;
            Vehicle vehicle = vehicleFactory.getVehicle(inputChar.get(i));
            output += vehicle.print(last);
        }
        return output;
    }

    public void detachEnd() {
        inputChar.remove(inputChar.size()-1);
    }

    public void detachHead() {
        inputChar.remove(0);
    }

    public boolean fill() {
        for (int i = 0; i < inputChar.size(); i++) {
            if(inputChar.get(i)=='C'){
                inputChar.set(i,'c');
                return true;
            }
        }
        return false;
    }


}
