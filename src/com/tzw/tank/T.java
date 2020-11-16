package com.tzw.tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class T {

    public static void main(String[] args) throws InterruptedException {
        Frame f = new TankFrame();
        while(true){
            Thread.sleep(50);
            f.repaint();
        }

    }
}
