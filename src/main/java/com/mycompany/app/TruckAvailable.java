package com.mycompany.app;

/**
 * Created by student on 2016/04/06.
 */
public class TruckAvailable {
    private static TruckAvailable truckAvailable = null;
    DriverFactory driverFactory;
    DriverInterface driverInterface;
    PersonBuilder personBuilder;
    PersonDirector personDirector;
    Person person;
    private TruckAvailable(){
    }

    public static TruckAvailable getInstance(){
        if(truckAvailable == null){
            truckAvailable = new TruckAvailable();
        }
        return truckAvailable;
    }

    public String searchForDriver(int request){
        if (request == 1)
            personBuilder = new PersonWithVehicleBuilder();
        else if (request == 2)
            personBuilder = new PersonWithTruckBuilder();
        else
            personBuilder = new PersonRoadsideBuilder();

        personDirector = new PersonDirector(personBuilder);
        personDirector.constructPerson();
        person = personDirector.getPerson();
        driverFactory = DriverFactory.getDriverFactoryInstance();
        driverInterface = driverFactory.getDriverRole(person.getChain().handleRequest(person.getType()));
        return driverInterface.isAvailable();
    }
}
