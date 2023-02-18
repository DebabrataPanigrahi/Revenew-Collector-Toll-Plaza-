package com.tollPlaza;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        TollPlaza tollPlaza = new TollPlaza();

        tollPlaza.processVehicle(new TwoWheeler());
        tollPlaza.processVehicle(new Ambulance());
        tollPlaza.processVehicle(new Vehicle("Car", false));
        tollPlaza.processVehicle(new Vehicle("Bus", true));
        tollPlaza.processVehicle(new Vehicle("Truck", false));

        Map<String, Double> monthlyRevenue = tollPlaza.getMonthlyRevenue();
        for (Map.Entry<String, Double> entry : monthlyRevenue.entrySet()) {
            System.out.println(entry.getKey() + ": $" + entry.getValue());
        }
    }
}
