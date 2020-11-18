package com.tzw.observer;

public class DadObs implements Observer {
    public void feed(){
        System.out.println("dad feed ............");
    }

    @Override
    public void obsHand(String localtion, String time) {
        feed();
    }
}
