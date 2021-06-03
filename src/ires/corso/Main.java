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

        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        System.out.println("Il numero maggiore è:" + max);


    }
}
