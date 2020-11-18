package com.tzw.chain;

public class Msg {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "name='" + name + '\'' +
                '}';
    }
}
