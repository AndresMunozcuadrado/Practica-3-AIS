package es.codeurjc.test;

public class CalculatorParser {

    public int parse(String expression) {
        expression = expression.trim();
        if (expression.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Invalid expression");
        }
        if (expression.contains("+")) {
            String[] parts = expression.split("\\+", 2);
            return parse(parts[0]) + parse(parts[1]);
        }
        return Integer.parseInt(expression.trim());
    }
}