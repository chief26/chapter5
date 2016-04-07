package com.mycompany.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/04/06.
 */
public class TestObjects {

    TruckAvailable truckAvailable1;
    DriverFactory driverFactory;
    DriverInterface driverInterface;
    ServiceHandler chain;
    PersonBuilder personBuilder;
    PersonDirector personDirector;

    @Before
    public void setUp() throws Exception {
        truckAvailable1 = TruckAvailable.getInstance();

        chain = ServiceHandlerChainPattern.getChain();
        driverFactory = DriverFactory.getDriverFactoryInstance();

        personBuilder = new PersonWithVehicleBuilder();
        personDirector = new PersonDirector(personBuilder);
    }

    @Test
    public void testTruckAvailable() throws Exception {
        Assert.assertEquals(truckAvailable1.searchForDriver(1), "The light Vehicle driver has been sent to your location");

    }

    @Test
    public void testUpdateTruckAvailable() throws Exception {

        TruckAvailable truckAvailable2 = TruckAvailable.getInstance();
        Assert.assertEquals(truckAvailable2.searchForDriver(1), "The driver is not available");
    }

    @Test
    public void testDriverFactory() throws Exception {
        driverInterface = driverFactory.getDriverRole(chain.handleRequest(2));
        Assert.assertEquals(driverInterface.isAvailable(), "The heavy Vehicle driver has been sent to your location");
        Assert.assertEquals(driverInterface.isFinished(), "Driver finished Call out");
    }

    @Test
    public void testUpdateDriverFactory() throws Exception {
        driverInterface = driverFactory.getDriverRole(chain.handleRequest(3));
        Assert.assertEquals(driverInterface.isAvailable(), "The mechanic has been sent to your location");
        Assert.assertEquals(driverInterface.isFinished(), "Driver finished Call out");
        Assert.assertEquals(driverInterface.isAvailable(), "The mechanic has been sent to your location");
        Assert.assertEquals(driverInterface.isAvailable(), "The mechanic is not available");

    }

    @Test
    public void testPerson() throws Exception {
        personDirector.constructPerson();
        Person person = personDirector.getPerson();
        Assert.assertEquals(person.getType(), 1);
        Assert.assertEquals(person.getChain().handleRequest(1), "Light Motor Driver");
    }

    @Test
    public void testUpdatePerson() throws Exception {
        personDirector.constructPerson();
        Person person = personDirector.getPerson();
        Assert.assertEquals(person.getType(), 1);
        Assert.assertEquals(person.getChain().handleRequest(1), "Light Motor Driver");

        //PersonBuilder otherPersonBuilder = new PersonWithVehicleBuilder();
        PersonDirector otherPersonDirector = new PersonDirector(personBuilder);

        otherPersonDirector.constructPerson();
        Person otherPerson = otherPersonDirector.getPerson();
        Assert.assertEquals(person.getType(), otherPerson.getType());
        Assert.assertEquals(person.getChain().handleRequest(1), otherPerson.getChain().handleRequest(1));

    }

    @Test
    public void testServiceHandler() throws Exception {
        chain = ServiceHandlerChainPattern.getChain();
        Assert.assertEquals(chain.handleRequest(3), "Mechanic");
    }
}