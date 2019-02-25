package week6Exercises.exe02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConeIceCreamTest {
    IceCream cone=new ConeIceCream("A","B");

    @Test
    void eat() {
        Assertions.assertEquals("The "+ cone.getFlavor() + " ice-cream with " + cone.getTopping() +" is licked.","The A ice-cream with B is licked.","");

    }
}