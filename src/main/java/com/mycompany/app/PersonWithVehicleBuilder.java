package com.mycompany.app;

/**
 * Created by student on 2016/04/06.
 */
public class PersonWithVehicleBuilder implements PersonBuilder{
    private Person person;
    private ServiceHandler serviceHandler;

    public PersonWithVehicleBuilder(){
        person = new Person();
    }

    @Override
    public void buildLocation() {
        person.setLocation("Bellville");
    }

    @Override
    public void buildDestination() {
        person.setDestination("Manenberg");
    }

    @Override
    public void buildChain() {
        serviceHandler = ServiceHandlerChainPattern.getChain();
        person.setChain(serviceHandler);
    }

    @Override
    public void buildType() {
        person.setType(1);
    }

    @Override
    public Person getPerson() {
        return person;
    }
}
