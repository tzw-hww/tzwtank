package com.tzw.observer;

import com.sun.org.apache.xpath.internal.operations.Mod;

import java.util.ArrayList;
import java.util.List;

public class Child {

    public boolean cry = false;
    List<Observer> obsList = new ArrayList<>();
    {
        obsList.add(new DadObs());
        obsList.add(new MomObs());
    }

    public void isCry(){
        cry = true;
    }

    public void weekUp(WeekupEvent e){
        for (Observer observer : obsList) {
            observer.obsHand(e.location,e.myTime);
        }
    }
}
