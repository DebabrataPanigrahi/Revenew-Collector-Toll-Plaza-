package com.tollPlaza;

import java.util.HashMap;
import java.util.Map;

public class Vehicle implements Tollable {
    private static final Map<String, Double> RATES;

    static {
        RATES = new HashMap<>();
        RATES.put("Car", (double) 50);
        RATES.put("Bus", (double) 100);
        RATES.put("Truck", (double) 150);
    }

    private String type;
    private boolean isTwoWay;

    public Vehicle(String type, boolean isTwoWay) {
        this.type = type;
        this.isTwoWay = isTwoWay;
    }

    public String getType() {
        return type;
    }

    @Override
    public double calculateTollFee() {
        double tollFee = RATES.getOrDefault(type, 0.0);
        if (isTwoWay) {
            tollFee *= 2;
        }
        return tollFee;
    }
}