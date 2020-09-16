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
            linkerDrioehoekAfbouwen(i, size-1);
            System.out.println();
        }

        for (int i = 0; i < size; i++) {
            linkerDriehoekOpbowen(i);
            System.out.println();
        }


    }

    void linkerDriehoekOpbowen(int i) {
        for (int j = 0; j <= i; j++) {
            printStar();
        }


    }
    void linkerDrioehoekAfbouwen(int i, int size) {
        for (int j = size; i < j; j = j -1){
            printStar();
        }
    }

    void printStar() {
        System.out.print("* ");
    }
    void printAt() {
        System.out.print("@");
    }
}