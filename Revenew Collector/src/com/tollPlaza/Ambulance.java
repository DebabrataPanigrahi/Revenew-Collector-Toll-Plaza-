package com.tollPlaza;

public class Ambulance implements Tollable {
    private static final double FEE = 0;

    @Override
    public double calculateTollFee() {
        return FEE;
    }
}
