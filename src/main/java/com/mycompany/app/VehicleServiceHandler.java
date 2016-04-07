package com.mycompany.app;

/**
 * Created by student on 2016/04/06.
 */
public class VehicleServiceHandler extends ServiceHandler{
    @Override
    public String handleRequest(int request) {
        if(request == 1) {
            return  "Light Motor Driver";

        }
        else
            return successor.handleRequest(request);
    }

}
