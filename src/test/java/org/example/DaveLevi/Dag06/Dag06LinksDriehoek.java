package org.example.DaveLevi.Dag06;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Dag06LinksDriehoek {


    @Test
    void rechterDriehoek() {
        System.out.println("hoe groot mag de 3-hoek?");
        Scanner eye = new Scanner(System.in);
        int size = eye.nextInt();

        printAt();
        System.out.println();
        for (int i = 0; i < size; i++) {
            rechterDriehoekOpbouwen(i);
            System.out.println();
        }
        for (int i = 0; i < size-1; i++) {
            rechterDriehoekAfbouwen(i, size-1);
            System.out.println();
        }
        printAt();
    }

    void rechterDriehoekOpbouwen(int i) {
        printAt();
        for (int j = 0; j <= i; j++) {
            printStar();
        }
        printAt();

    }
    void rechterDriehoekAfbouwen(int i, int size) {
        printAt();
        for (int j = size; i < j; j = j -1){
            printStar();
        }
        printAt();
    }

    void printStar() {
        System.out.print("* ");
    }
    void printAt() {
        System.out.print("@");
    }
}