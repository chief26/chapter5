package com.mycompany.app;

/**
 * Created by student on 2016/04/06.
 */
public interface PersonBuilder {
    public void buildLocation();
    public void buildDestination();
    public void buildChain();
    public void buildType();
    public Person getPerson();
}
