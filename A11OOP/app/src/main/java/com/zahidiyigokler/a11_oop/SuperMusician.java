package com.zahidiyigokler.a11_oop;

public class SuperMusician extends Musician{
    public SuperMusician(String name,String instrument,int age){
        super(name,instrument,age);
    }
    public String sing() {
        return "Nothing Else Matters";
    }
}
