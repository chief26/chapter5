package com.mycompany.app;

/**
 * Created by student on 2016/04/06.
 */
public class PersonDirector {
    private PersonBuilder personBuilder = null;

    public PersonDirector(PersonBuilder personBuilder){
        this.personBuilder = personBuilder;
    }

    public void constructPerson(){
        personBuilder.buildLocation();
        personBuilder.buildDestination();
        personBuilder.buildChain();
        personBuilder.buildType();
    }

    public Person getPerson(){
        return personBuilder.getPerson();
    }
}
