package es.codeurjc.test;

public class CalculatorParser {

    public int parse(String expression) {
        expression = expression.trim();
        if (!expression.matches("[0-9+\\-\\s]+")) {
            throw new IllegalArgumentException("Invalid expression");
        }
        if (expression.contains("+")) {
            String[] parts = expression.split("\\+", 2);
            return parse(parts[0]) + parse(parts[1]);
        }
        if (expression.contains("-")) {
            int lastMinus = expression.lastIndexOf('-');
            if (lastMinus > 0) {
                String left = expression.substring(0, lastMinus);
                String right = expression.substring(lastMinus + 1);
                return parse(left) - parse(right);
            }
        }
        return Integer.parseInt(expression.trim());
    }
	
}