package com.mycompany.app;

/**
 * Created by student on 2016/04/06.
 */
public class PersonWithTruckBuilder implements PersonBuilder{
    private Person person;
    private ServiceHandler serviceHandler;

    public PersonWithTruckBuilder(){
        person = new Person();
    }

    @Override
    public void buildLocation() {
        person.setLocation("Observatory");
    }

    @Override
    public void buildDestination() {
        person.setDestination("Sea Point");
    }

    @Override
    public void buildChain() {
        serviceHandler = ServiceHandlerChainPattern.getChain();
        person.setChain(serviceHandler);
    }

    @Override
    public void buildType() {
        person.setType(2);
    }

    @Override
    public Person getPerson() {
        return person;
    }
}
