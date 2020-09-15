package org.example.DaveLevi.Dag06;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RevisitPrimitiveTypes {

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

        //wat kan je doen met een variable waar een referece in zit?
        String s2 = s1.substring(7);

        assertThat(s2).isEqualTo("een string!");


    }


}
