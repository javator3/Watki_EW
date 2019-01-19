package com.Watki;

import java.util.Random;

public class Podwajanie extends Thread {


        public void run() {
            int liczba;
            Random random = new Random();

            liczba = random.nextInt(50);

            System.out.println("Wynik: " + liczba*2 + " thread: " + Thread.currentThread().getName());

        }

}
