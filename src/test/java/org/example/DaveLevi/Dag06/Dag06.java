package org.example.DaveLevi.Dag06;

import org.junit.jupiter.api.Test;

public class Dag06 {

    @Test
    void rechterDriehoek() {
        int size = 5;

        for (int i = 0; i < size; i++) {
            rechterDriehoekOpbouwen(i);
            System.out.println();
        }
        for (int i = 0; i < size; i++) {
            rechterDriehoekAfbouwen(i, size);
            System.out.println();
        }
    }

    void rechterDriehoekOpbouwen(int i) {
        for (int j = 0; j <= i; j++) {
            printStar();
        }
    }
    void rechterDriehoekAfbouwen(int i, int size) {
        size = size - i;
        for (int j = size; j <= i; i++){
            printStar();
        }
    }

    void printStar() {
        System.out.print("* ");
    }

}
