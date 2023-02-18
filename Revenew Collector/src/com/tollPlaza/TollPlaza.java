package com.tollPlaza;

import java.util.HashMap;
import java.util.Map;

public class TollPlaza {
    private Map<String, Double> monthlyRevenue;

    public TollPlaza() {
        monthlyRevenue = new HashMap<>();
    }

    public void processVehicle(Tollable vehicle) {
        double tollFee = vehicle.calculateTollFee();

        String vehicleType;
        if (vehicle instanceof TwoWheeler) {
            vehicleType = "TwoWheeler";
        } else if (vehicle instanceof Ambulance) {
            vehicleType = "Ambulance";
        } else {
            vehicleType = ((Vehicle) vehicle).getType();
        }

        updateMonthlyRevenue(vehicleType, tollFee);
    }

    private void updateMonthlyRevenue(String vehicleType, double tollFee) {
        if (monthlyRevenue.containsKey(vehicleType)) {
            monthlyRevenue.put(vehicleType, monthlyRevenue.get(vehicleType) + tollFee);
        } else {
            monthlyRevenue.put(vehicleType, tollFee);
        }
    }

    public Map<String, Double> getMonthlyRevenue() {
        return monthlyRevenue;
    }
}