package com.tzw.observer;

public class MomObs implements Observer {

    public void hug(){
        System.out.println("mom hug................");
    }

    @Override
    public void obsHand(String localtion, String time) {
        hug();
    }
}
