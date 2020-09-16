package org.example.DaveLevi.Dag06;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Dag06LinksDriehoek {


    @Test
    void linkerDriehoek() {
        System.out.println("hoe groot mag de 3-hoek?");
        Scanner eye = new Scanner(System.in);
        int size = eye.nextInt();
        System.out.println();
        for (int i = 0; i < size-1; i++) {
            linkerDrioehoekAfbouwen(i, size);
            printAt();
            System.out.println();
        }

        for (int i = 0; i < size; i++) {
            linkerDriehoekOpbowen(i, size);
            printAt();
            System.out.println();
        }
    }

    void linkerDriehoekOpbowen(int i, int size) {
        for (int j = 0; j <= i; j++) {
            printSpace();
        }
        printAt();
        for (int x = size-i; i < size-1; i++)
            printStar();

    }
    void linkerDrioehoekAfbouwen(int i, int size) {
        for (int j = size; i < j; j = j -1){
            printSpace();
        }
        printAt();
        for (int x = size-i; i > 0; i=i-1)
            printStar();
    }

    void printAt() {
        System.out.print("@ ");
    }
    void printStar() {
        System.out.print("* ");
    }
    void printSpace() {
        System.out.print("  ");
    }
}