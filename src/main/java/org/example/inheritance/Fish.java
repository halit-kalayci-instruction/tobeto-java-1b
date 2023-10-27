package org.example.inheritance;

// Fish => Subclass
// Animal => Superclass
public class Fish extends Animal{
    public void swim(){

    }

    @Override
    public void makeSound() {
        System.out.println("Fish sound..");
    }

    @Override // ana classadaki bu metodu üzerine yap
    public void breathe() {
        // this => içinde bulunduğum class
        // super => kalıtım aldığım class'ı ifade eder.
        System.out.println("Fish cant breathe");
        //super.breathe();
    }


}
