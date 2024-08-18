package com.zahidiyigokler.a12_oop_details;

public class Kopek extends Hayvan implements Egitim {
    public Kopek(){
        super();
    }
    public Kopek(String isim,
                 String gozRengi,
                 String tuyRengi){
        super(isim,gozRengi,tuyRengi);
    }
    @Override
    public boolean egitimAl(){
        System.out.println("Köpekler eğitim alır.");
        return true;
    }
    @Override
    public boolean egitimAlBody(){
        System.out.println("Köpekler gayet de eğitim alır.");
        return true;
    }
}
