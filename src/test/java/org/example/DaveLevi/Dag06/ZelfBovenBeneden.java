package org.example.DaveLevi.Dag06;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class ZelfBovenBeneden {
    @Test
    public void main() {
        int formaat = vraagFormaat();
        driehoekPuntBoven(formaat);
    }
    int vraagFormaat(){
        Scanner eye = new Scanner(System.in);
        System.out.println("Geef het formaat dat de driehoek mag zijn");
        return eye.nextInt();
    }

    void driehoekPuntBoven(int formaat) {
        for (int i = 1; i <= formaat; i++) {
            for (int j = i; j < formaat; j++) {
                space();
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || i == formaat || k == (2 * i - 1)) {
                    mark();
                } else {
                    space();
                }
            }
            System.out.println();
        }
    }

    void space() {
        System.out.print(" ");
    }

    void mark() {
        System.out.print("@");
    }
}
