package es.codeurjc.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
    public void test4(){
        CalculatorParser parser = new CalculatorParser();
        assertEquals(parser.parse("1+1"), 2);
    }
}
