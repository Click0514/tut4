package tut4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalcTest extends Calc{

    @Test
    void add() {
//        int a = 5;
//        int b = 10;
//        int c = add(a,b);
        assertEquals(15, add(5,10));
    }

    @Test
    void subtract() {
        assertEquals(1, subtract(3,2));
    }



}