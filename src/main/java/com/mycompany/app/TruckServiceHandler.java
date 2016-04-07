package com.mycompany.app;

/**
 * Created by student on 2016/04/06.
 */
public class TruckServiceHandler extends ServiceHandler{
    @Override
    public String handleRequest(int request) {
        if(request == 2) {
            return "Heavy Motor Driver";
        }
        else
            return successor.handleRequest(request);
    }


}
