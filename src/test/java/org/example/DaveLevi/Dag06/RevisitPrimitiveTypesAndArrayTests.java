package org.example.DaveLevi.Dag06;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RevisitPrimitiveTypesAndArrayTests {

    @Test
    void primitiveTypes() {
        byte a;
        short b;
        int c;
        long d;
        double e;
        float f;
        boolean g;
        char h;
    }

    @Test
    void stringRefference() {
        String s1 = "Dit is een string!";
        System.out.println(s1);

        //wat kan je doen met een variable waar een referece in zit?
        String s2 = s1.substring(7);

        assertThat(s2).isEqualTo("een string!");

        String s3 = s1.replace('e', 'a');
        System.out.println(s3);

        char s4 = s1.charAt(9);
        System.out.println(s4);
        assertThat(s4).isEqualTo('n');


        String s5 = s1.concat(" Dit is een toevoeging!");
        System.out.println(s5);
    }

    @Test
    void eenHandigeManierOmVeelVariablenTeDeclareren() {
        int leeftijd;     // een int declareren
        int[] leeftijden; // Een int Array declareren
        leeftijd = 10;
        leeftijden = new int[10];
        int leeftijdOpIndex = leeftijden[0];
        System.out.println(leeftijdOpIndex);
        leeftijden[0] = 74;
        leeftijden[1] = 26;
        leeftijden[2] = 43;
        leeftijden[3] = 84;
        leeftijden[4] = 19;
        leeftijden[5] = 22;
        leeftijden[6] = 31;
        leeftijden[7] = 78;
        leeftijden[8] = 27;
        leeftijden[9] = 77;
        int sum = 0;
        for(int i = 0; i < leeftijden.length;i++) {
            sum = sum + leeftijden[i];
        }
        System.out.println(sum);

    }
}
