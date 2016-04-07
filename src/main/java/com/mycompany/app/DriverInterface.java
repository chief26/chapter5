package com.mycompany.app;

/**
 * Created by student on 2016/04/06.
 */
public interface DriverInterface {
    public abstract String name(String name);
    public abstract double price(double distance);
    public abstract String role();
    public abstract String isAvailable();
    public abstract String isFinished();
}
