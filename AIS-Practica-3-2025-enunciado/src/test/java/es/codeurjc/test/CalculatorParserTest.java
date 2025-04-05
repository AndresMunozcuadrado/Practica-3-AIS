package es.codeurjc.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CalculatorParserTest {
    @Test
    public void testParse() {
        CalculatorParser parser = new CalculatorParser();
        assertTrue(parser.parse("1") == 1);
    }
}
