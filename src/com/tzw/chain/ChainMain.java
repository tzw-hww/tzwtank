package com.tzw.chain;

public class ChainMain {
    public static void main(String[] args) {
        String msg = "<Script>,欢迎大家996";
        Msg m = new Msg();
        m.setName(msg);

        String name = m.getName();
        name=name.replace("<","(");
        name=name.replace(">",")");
        m.setName(name);


        name=name.replace("996","995");
        m.setName(name);

        System.out.println(m);
    }

    class Fileter{
        public void doFileter(){

        }
    }


}
