package com.mycompany.app;

/**
 * Created by student on 2016/04/06.
 */
public class DriverFactory {
    private static DriverFactory driverFactory = null;

    private DriverFactory(){}

    public static DriverFactory getDriverFactoryInstance(){
        if(driverFactory == null)
            return new DriverFactory();
        return driverFactory;
    }

    public DriverInterface getDriverRole(String driver){
        if("Heavy Motor Driver".equalsIgnoreCase(driver))
            return new DriverTruck();
        else if ("Light Motor Driver".equalsIgnoreCase(driver))
            return new DriverVehicle();
        else
            return new DriverMechanic();
    }
}
