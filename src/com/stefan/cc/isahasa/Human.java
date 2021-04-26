package com.stefan.cc.isahasa;

public class Human extends Creature {
    private Car myCar;


    public Human(int puls) {
        super(puls);
    }

    public void talk(String text){
        System.out.println(text);
    }

    public Car getMyCar() {
        return myCar;
    }

    public void setMyCar(Car myCar) {
        this.myCar = myCar;
    }
}
