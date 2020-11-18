package com.tzw.observer;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();

        child.weekUp(new WeekupEvent("bed","2"));
    }
}
