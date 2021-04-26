package com.stefan.cc.isahasa;

public class Creature {
    private int puls;

    public Creature(int puls) {
        this.puls = puls;
    }

    public void doBeat(){
        System.out.println("My heart is beating at " + puls);
    }
}
