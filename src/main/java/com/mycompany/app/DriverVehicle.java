package com.mycompany.app;

/**
 * Created by student on 2016/04/06.
 */
public class DriverVehicle implements DriverInterface{
    private double price = 50.0;
    public static int available = 0;

    public DriverVehicle() {
    }

    @Override
    public String name(String name) {
        return name;
    }

    @Override
    public double price(double distance) {

        return price*distance;
    }

    @Override
    public String role() {
        return "Light Motor Driver";
    }

    @Override
    public String isAvailable() {
        if (available % 2 == 0) {
            available++;
            return "The light Vehicle driver has been sent to your location";
        }
        else {
            available++;
            return "The driver is not available";
        }
    }

    @Override
    public String isFinished() {
        available++;
        return "Driver finished Call out";
    }
}
