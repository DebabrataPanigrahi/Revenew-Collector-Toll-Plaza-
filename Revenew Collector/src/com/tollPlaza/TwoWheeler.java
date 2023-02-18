package com.tollPlaza;

public class TwoWheeler implements Tollable {
    private static final double FEE = 10;

    @Override
    public double calculateTollFee() {
        return FEE;
    }
}
