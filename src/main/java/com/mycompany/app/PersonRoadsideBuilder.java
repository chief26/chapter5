package com.mycompany.app;

/**
 * Created by student on 2016/04/06.
 */
public class PersonRoadsideBuilder implements PersonBuilder{
    private Person person;
    private ServiceHandler serviceHandler;

    public PersonRoadsideBuilder(){
        person = new Person();
    }

    @Override
    public void buildLocation() {
        person.setLocation("Mitchell's Plain");
    }

    @Override
    public void buildDestination() {
        person.setDestination("Mitchell's Plain");
    }

    @Override
    public void buildChain() {
        serviceHandler = ServiceHandlerChainPattern.getChain();
        person.setChain(serviceHandler);
    }

    @Override
    public void buildType() {
        person.setType(3);
    }

    @Override
    public Person getPerson() {
        return person;
    }
}
