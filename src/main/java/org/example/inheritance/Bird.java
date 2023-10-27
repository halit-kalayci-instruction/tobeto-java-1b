package org.example.inheritance;

// extends
public class Bird extends Animal{
    public void fly(){

    }

    @Override
    public void makeSound() {
        System.out.println("cik cik..");
    }
}
