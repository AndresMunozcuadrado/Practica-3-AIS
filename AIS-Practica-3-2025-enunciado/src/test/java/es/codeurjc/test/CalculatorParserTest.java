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

    @Test
    public void test8(){
        CalculatorParser parser = new CalculatorParser();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> parser.parse("A"));
        assertEquals("Invalid expression", exception.getMessage());
    }
    @Test
    public void test9(){
        CalculatorParser parser = new CalculatorParser();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> parser.parse("B"));
        assertEquals("Invalid expression", exception.getMessage());
    }
}
