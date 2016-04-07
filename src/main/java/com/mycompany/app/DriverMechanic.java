package com.mycompany.app;

/**
 * Created by student on 2016/04/06.
 */
public class DriverMechanic implements DriverInterface{
    private double price = 50.0;

    public DriverMechanic() {
    }

    public static int available = 0;


    @Override
    public String name(String name) {

        return "Driver name is "+name;
    }

    @Override
    public double price(double time) {

        return price*time;
    }

    @Override
    public String role() {
        return "Roadside assistance";
    }

    @Override
    public String isAvailable() {
        if (available % 2 == 0) {
            available++;
            return "The mechanic has been sent to your location";
        }
        else {
            available++;
            return "The mechanic is not available";
        }
    }

    @Override
    public String isFinished() {
        available++;
        return "Driver finished Call out";
    }
}
