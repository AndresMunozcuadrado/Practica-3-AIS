package es.codeurjc.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculatorParserTest {
    @Test
    public void testPrimeros3Ej(){
        CalculatorParser parser = new CalculatorParser();
        assertEquals(parser.parse("1"), 1);
        assertEquals(parser.parse("2"), 2);
        assertEquals(parser.parse("3"), 3);
    }

    @Test
    public void test4a7(){
        CalculatorParser parser = new CalculatorParser();
        assertEquals(parser.parse("1+1"), 2);
        assertEquals(parser.parse("2+3"), 5);
        assertEquals(parser.parse("2+3+4"), 9);
        assertEquals(parser.parse("1+2+3+4"), 10);
    }

    public String aTAux(String expression){
        CalculatorParser parser = new CalculatorParser();
        IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> parser.parse(expression));
        return result.getMessage();
    }
    @Test
    public void test8a12(){
        assertEquals("Invalid expression", aTAux("A"));
        assertEquals("Invalid expression", aTAux("B"));
        assertEquals("Invalid expression", aTAux("k"));
        assertEquals("Invalid expression", aTAux("HoLa"));
        assertEquals("Invalid expression", aTAux("1 + A"));
    }
    @Test
    public void test13(){
        CalculatorParser parser = new CalculatorParser();
        assertEquals(parser.parse("5-3"), 2);
    }
    @Test
    public void test14(){
        CalculatorParser parser = new CalculatorParser();
        assertEquals(parser.parse("1-2"), -1);
    }
    @Test
    public void test15(){
        CalculatorParser parser = new CalculatorParser();
        assertEquals(parser.parse("7-2-1"), 4);
    }
    @Test
    public void test16(){
        CalculatorParser parser = new CalculatorParser();
        assertEquals(parser.parse("9-5-3-1"), 0);
    }
    @Test
    public void test17(){
        CalculatorParser parser = new CalculatorParser();
        assertEquals(parser.parse("7+1-5"), 3);
    }
    @Test
    public void test18(){
        CalculatorParser parser = new CalculatorParser();
        assertEquals(parser.parse("9-5+4"), 8);
    }
}
