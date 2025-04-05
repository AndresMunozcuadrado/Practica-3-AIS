package es.codeurjc.test;

public class CalculatorParser {

    public int parse(String expression) {
        if (expression.contains("+")) {
            String[] parts = expression.split("\\+");
            return parse(parts[0]) + parse(parts[1]);
        }
        return Integer.parseInt(expression);
    }
	
}