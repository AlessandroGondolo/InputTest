package ires.corso;

import sun.security.x509.OtherName;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in;

        in = new Scanner(System.in);

        System.out.println("Inserisci 3 numeri interi da confrontare: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = 0;
        int ordine = 0;
        boolean x = false;
        if ((a == b) || (c == a)) {
            System.out.println("I 3 numeri sono uguali");
        } else {
            if (a > b) {
                max = a;
                ordine = 1;
            } else {
                max = b;
                ordine = 2;
            }


            if (c > max) {
                max = c;
                ordine = 3;
            }

            System.out.println("Il numero maggiore è:" + max);

            System.out.println("Il numero maggiore è il " + ordine + "° numero inserito ed è: " + max);

        }
    }
}
