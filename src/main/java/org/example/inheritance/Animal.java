package org.example.inheritance;

// somut işlemler de barındırabilen
// soyutlama da yapılan yapılardır
public abstract class Animal {
    public int id;

    public abstract void makeSound();

    public void eat(){
        System.out.println("Animal eating");
    }
    public void breathe(){
        System.out.println("Animal breathing");
    }
}
