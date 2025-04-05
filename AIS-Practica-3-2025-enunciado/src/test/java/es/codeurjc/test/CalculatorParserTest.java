package es.codeurjc.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CalculatorParserTest {
    @Test
    public void testParse() {
        CalculatorParser parser = new CalculatorParser();
        assertTrue(parser.parse("1") == 1);
    }
    @Test
    public void testParse2(){
        CalculatorParser parser = new CalculatorParser();
        assertEquals(parser.parse("2"), 2);
    }
}
