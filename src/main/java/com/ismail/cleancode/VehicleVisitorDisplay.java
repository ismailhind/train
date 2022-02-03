package com.ismail.cleancode;

public class VehicleVisitorDisplay implements VehicleVisitor {

    StringBuilder builder = new StringBuilder("");

    public StringBuilder getBuilder() {
        return builder;
    }

    public void cargoWriter() {
        builder.append("|____|");
    }

    public void filledCargoWriter() {
        builder.append("|^^^^|");
    }

    public void rVehicleWriter() {
        builder.append("|hThT|");
    }

    public void rightHeadWriter() {
        builder.append("HHHH>");
    }

    public void leftHeadWriter() {
        builder.append("<HHHH");
    }

    public void passengerWriter() {
        builder.append("|OOOO|");
    }

    public void modifiedCargoWriter() {
        builder.append("|^^^^|");
    }

}
