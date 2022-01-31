package com.ismail.cleancode;

public class Test {

    public static void main(String[] args) {
        Train train = new Train("HHR");
        train.accept(new VehicleVisitorDisplay());
    }
}
