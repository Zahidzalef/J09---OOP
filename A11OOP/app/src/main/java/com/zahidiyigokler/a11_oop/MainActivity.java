package com.zahidiyigokler.a11_oop;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        /*
        User myUser = new User();
        myUser.name = "Zalef";
        myUser.job = "Instruvtor";

        User newUser = new User();
        newUser.name = "Kirk";
        newUser.job = "Musician";

         */

        User myUser = new User("Zalef","Instructor");
        System.out.println(myUser.information());
        System.out.println(myUser.name);

        // Encapsulation
        Musician james = new Musician("James","Guitar",50);
        System.out.println(james.getName());
        james.setAge(60,"Zalef");
        System.out.println(james.getAge());

        // Inheritance
        SuperMusician lars = new SuperMusician("Lars","Drums",55);
        System.out.println(lars.sing());
        System.out.println(lars.getAge());

        // Polymorphism
        // Static Polymorphism
        Mathematics mathematics=new Mathematics();
        System.out.println(mathematics.sum());
        System.out.println(mathematics.sum(5,3));
        System.out.println(mathematics.sum(5,3,4));

        // Dynamic Polymorphism
        Animal myAnimal = new Animal();
        myAnimal.sing();
        Dog barley = new Dog();
        barley.test();
        barley.sing();

        // Abstract & Interface
        Piano myPiano = new Piano();
        myPiano.brand="Yamaha";
        myPiano.digital=true;
        myPiano.info();
    }
}
