package com.ismail.cleancode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static com.ismail.cleancode.VehicleType.*;

public class Train  {

    public static final String DOUBLE_SEMICOLON = "::";
    private final List<Vehicle> vehicles = new ArrayList<Vehicle>();


    public Train(String input) {
        fillVehicles(input);
    }

    public String print() {
        VehicleVisitor visitor = new VehicleVisitorDisplay();
        for (int i = 0; i < vehicles.size(); i++) {
            vehicles.get(i).accept(visitor);
            if(i < vehicles.size()-1) visitor.getBuilder().append(DOUBLE_SEMICOLON);
        }
        return visitor.getBuilder().toString();
    }

    public void fillVehicles(String str) {
        IntStream.range(0, str.length())
                .mapToObj(index -> (index == 0 && str.charAt(index) == HEAD_LEFT.getVehicleType())
                        ? vehicles.add(VehicleFactory.getVehicle(HEAD_RIGHT.getVehicleType()))
                        : vehicles.add(VehicleFactory.getVehicle(str.charAt(index))))
                .collect(Collectors.toList());
    }

    public void detachEnd() {
        vehicles.remove(vehicles.size() - 1);
    }

    public void detachHead() {
        vehicles.remove(0);
    }

    public boolean fill() {
        vehicles.stream()
                .filter(vehicle -> vehicle instanceof Fillable)
                .map(Fillable.class::cast)
                .anyMatch(Fillable::fill);

        return false;
    }
}
