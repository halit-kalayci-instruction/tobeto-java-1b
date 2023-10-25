package org.example;


// Her class, default olarak boş bir constructor ile başlar.
public class Product
{
    public Product()
    {
        System.out.println("Boş ctor çalıştırıldı.");
    }
    public Product(String name, double price){
        // this => class'a referans eder
        this.name = name;
        this.price = price;
    }

    public String name;
    public double price;

    // erişim_belirteci dönüş_tipi method_ismi() {}
    public void discount(double discount)
    {
        price = price - discount;
    }
    // method overloading => aynı isimde farklı imzada n kadar methoda sahip olmak
}
