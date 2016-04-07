package com.mycompany.app;

/**
 * Created by student on 2016/04/06.
 */
public class Person {
    private String location;
    private String destination;
    private ServiceHandler chain;
    private int type;

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setChain(ServiceHandler chain) {
        this.chain = chain;
    }

    public ServiceHandler getChain() {
        return chain;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Person{" +
                "location='" + location + '\'' +
                ", destination='" + destination + '\'' + ""; }
}
