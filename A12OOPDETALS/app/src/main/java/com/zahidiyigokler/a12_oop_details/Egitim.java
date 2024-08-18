package com.zahidiyigokler.a12_oop_details;

public interface Egitim {
    public boolean egitimAl();
    public default boolean egitimAlBody(){
        System.out.println("Eğitim almıyoruz.");
        return false;
    }
}
