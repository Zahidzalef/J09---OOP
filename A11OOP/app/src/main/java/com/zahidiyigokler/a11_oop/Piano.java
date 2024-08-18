package com.zahidiyigokler.a11_oop;

public class Piano implements Instrument,HouseDecor {
    String brand;
    boolean digital;

    @Override
    public void info() {
        System.out.println("override method");
    }
}
