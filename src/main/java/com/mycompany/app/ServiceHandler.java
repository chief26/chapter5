package com.mycompany.app;

/**
 * Created by student on 2016/04/06.
 */
public abstract class ServiceHandler {
    ServiceHandler successor;

    public void setSuccessor(ServiceHandler successor) {
        this.successor = successor;
    }

    public abstract String handleRequest(int request);
}
