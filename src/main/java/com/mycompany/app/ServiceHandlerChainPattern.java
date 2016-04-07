package com.mycompany.app;

/**
 * Created by student on 2016/04/06.
 */
public class ServiceHandlerChainPattern {
    public static ServiceHandler getChain(){
        ServiceHandler vehicle = new VehicleServiceHandler();
        ServiceHandler truck = new TruckServiceHandler();
        ServiceHandler mechanic = new MechanicServiceHandler();

        vehicle.setSuccessor(truck);
        truck.setSuccessor(mechanic);

        return vehicle;
    }
}
