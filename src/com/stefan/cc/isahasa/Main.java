package com.stefan.cc.isahasa;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("red");
        Car c2 = new Car("blue");
        Car c3 = c1 ;

        System.out.println(c1.getColor());
        c3.setColor("orange");
        System.out.println(c1.getColor());


        Human h1 = new Human(20);
        h1.setMyCar(c1);

        System.out.println(h1.getMyCar().getColor());

        h1.getMyCar().setColor("blue");
        System.out.println(c3.getColor());
    }

}
