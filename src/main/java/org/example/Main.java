package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main
{ /* Main classının scope başlangıcı */
    public static void main(String[] args)
    { /* Main metotunun scope başlangıcı */
        // Programlama
        // Elimizdeki ham verinin yönetilerek yazılım ürününe çevilirmesi.

        // Programming Concepts

        // Variables - Değişkenler

        // type-safe
        String text = "Merhaba, Tobeto";
        Integer number = 10;
        int number2 = 15;
        // RAM'de tutuluyolar.
        System.out.println(text);
        System.out.println(number);
        System.out.println(number2);

        List<Integer> numbers =  new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);
        // Scope => Kapsam,Alan

        if(1==1)
        {
            System.out.println(numbers);
            String text2 = "Merhaba";
        }
        else
        {
            System.out.println("Koşul yanlış");
        }
        //System.out.println(text2);

        // 14:00

    } /* Main metotunun scope bitişi */
} /* Main classının scope bitiş */
