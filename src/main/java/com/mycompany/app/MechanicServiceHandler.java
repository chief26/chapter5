package com.mycompany.app;

/**
 * Created by student on 2016/04/06.
 */
public class MechanicServiceHandler extends ServiceHandler{
    @Override
    public String handleRequest(int request) {
        if(request >= 3) {
            return  "Mechanic";
        }
        else
            return successor.handleRequest(request);
    }


}
